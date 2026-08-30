package com.example.data.repository

import com.example.data.datasource.ForensicFlashcardsBank
import com.example.data.datasource.ForensicQuestionBank
import com.example.data.db.AppDatabase
import com.example.data.db.BookmarkedQuestionEntity
import com.example.data.db.QuestionAttemptEntity
import com.example.data.db.QuizAttemptEntity
import com.example.data.db.UserStatsEntity
import com.example.data.model.Difficulty
import com.example.data.model.ForensicCategory
import com.example.data.model.ForensicFlashcard
import com.example.data.model.ForensicQuestion
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class ForensicRepository(private val database: AppDatabase) {

    private val dao = database.quizDao()

    fun getTodayDateString(): String {
        val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        return sdf.format(Date())
    }

    fun getDailyQuestions(dateString: String = getTodayDateString()): List<ForensicQuestion> {
        return ForensicQuestionBank.getDailyQuizQuestions(dateString)
    }

    fun getAllQuestions(): List<ForensicQuestion> = ForensicQuestionBank.questions

    fun getQuestionsByCategory(category: ForensicCategory): List<ForensicQuestion> {
        return ForensicQuestionBank.getQuestionsByCategory(category)
    }

    fun getQuestionsByDifficulty(difficulty: Difficulty): List<ForensicQuestion> {
        return ForensicQuestionBank.getQuestionsByDifficulty(difficulty)
    }

    fun getQuestionById(id: String): ForensicQuestion? {
        return ForensicQuestionBank.questions.find { it.id == id }
    }

    fun getFlashcards(): List<ForensicFlashcard> = ForensicFlashcardsBank.flashcards

    fun observeDailyAttemptForToday(): Flow<QuizAttemptEntity?> {
        return dao.observeDailyAttemptForDate(getTodayDateString())
    }

    fun getAllAttempts(): Flow<List<QuizAttemptEntity>> = dao.getAllAttempts()

    fun getUserStats(): Flow<UserStatsEntity?> = dao.getUserStats()

    fun getBookmarkedQuestionIds(): Flow<List<String>> = dao.getBookmarkedQuestionIds()

    fun getBookmarks(): Flow<List<BookmarkedQuestionEntity>> = dao.getAllBookmarks()

    fun getIncorrectQuestions(): Flow<List<ForensicQuestion>> {
        return dao.getIncorrectQuestionAttempts().map { attempts ->
            attempts.mapNotNull { attempt ->
                ForensicQuestionBank.questions.find { it.id == attempt.questionId }
            }
        }
    }

    suspend fun toggleBookmark(questionId: String) {
        val isBookmarked = dao.isBookmarked(questionId)
        if (isBookmarked) {
            dao.deleteBookmark(questionId)
        } else {
            dao.insertBookmark(BookmarkedQuestionEntity(questionId = questionId))
        }
    }

    suspend fun saveBookmarkNotes(questionId: String, notes: String) {
        dao.insertBookmark(BookmarkedQuestionEntity(questionId = questionId, notes = notes))
    }

    suspend fun recordQuizCompletion(
        quizTitle: String,
        categoryName: String?,
        isDailyQuiz: Boolean,
        totalQuestions: Int,
        correctAnswers: Int,
        timeTakenSeconds: Int,
        questionResults: Map<String, Pair<Int, Boolean>> // questionId -> (selectedOption, isCorrect)
    ): Long {
        val todayStr = getTodayDateString()

        // 1. Insert quiz attempt
        val attemptId = dao.insertAttempt(
            QuizAttemptEntity(
                quizTitle = quizTitle,
                categoryName = categoryName,
                dateString = todayStr,
                totalQuestions = totalQuestions,
                correctAnswers = correctAnswers,
                timeTakenSeconds = timeTakenSeconds,
                isDailyQuiz = isDailyQuiz
            )
        )

        // 2. Update question attempt stats
        questionResults.forEach { (qId, result) ->
            val (selectedOption, isCorrect) = result
            val existing = dao.getQuestionAttempt(qId)
            val updated = if (existing != null) {
                existing.copy(
                    timesAttempted = existing.timesAttempted + 1,
                    timesCorrect = existing.timesCorrect + (if (isCorrect) 1 else 0),
                    lastSelectedOption = selectedOption,
                    lastAttemptedAt = System.currentTimeMillis()
                )
            } else {
                QuestionAttemptEntity(
                    questionId = qId,
                    timesAttempted = 1,
                    timesCorrect = if (isCorrect) 1 else 0,
                    lastSelectedOption = selectedOption,
                    lastAttemptedAt = System.currentTimeMillis()
                )
            }
            dao.insertOrUpdateQuestionAttempt(updated)
        }

        // 3. Update User Stats & Streak
        val currentStats = dao.getUserStatsOnce() ?: UserStatsEntity()
        val yesterdayStr = getYesterdayDateString()

        val newStreak = when {
            currentStats.lastCompletedDate == todayStr -> currentStats.currentStreak // Already played today
            currentStats.lastCompletedDate == yesterdayStr -> currentStats.currentStreak + 1 // Streak continued
            currentStats.lastCompletedDate.isEmpty() -> 1 // First time
            else -> 1 // Streak reset
        }

        val updatedMaxStreak = maxOf(currentStats.maxStreak, newStreak)

        val updatedStats = currentStats.copy(
            currentStreak = newStreak,
            maxStreak = updatedMaxStreak,
            lastCompletedDate = todayStr,
            totalQuizzes = currentStats.totalQuizzes + 1,
            totalQuestions = currentStats.totalQuestions + totalQuestions,
            totalCorrect = currentStats.totalCorrect + correctAnswers
        )

        dao.insertOrUpdateUserStats(updatedStats)

        return attemptId
    }

    private fun getYesterdayDateString(): String {
        val cal = Calendar.getInstance()
        cal.add(Calendar.DATE, -1)
        val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        return sdf.format(cal.time)
    }
}
