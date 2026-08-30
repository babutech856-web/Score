package com.example.data.repository

import com.example.data.datasource.ForensicFlashcardsBank
import com.example.data.datasource.ForensicQuestionBank
import com.example.data.db.AppDatabase
import com.example.data.db.BookmarkedQuestionEntity
import com.example.data.db.CustomQuestionEntity
import com.example.data.db.QuestionAttemptEntity
import com.example.data.db.QuizAttemptEntity
import com.example.data.db.UserStatsEntity
import com.example.data.db.toCustomEntity
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

    // Combine static + custom questions
    fun getAllCustomQuestionsFlow(): Flow<List<CustomQuestionEntity>> = dao.getAllCustomQuestions()

    suspend fun getAllQuestions(): List<ForensicQuestion> {
        val custom = dao.getAllCustomQuestionsOnce().map { it.toForensicQuestion() }
        return ForensicQuestionBank.staticQuestions + custom
    }

    fun getAllStaticQuestions(): List<ForensicQuestion> = ForensicQuestionBank.staticQuestions

    suspend fun getDailyQuestions(dateString: String = getTodayDateString()): List<ForensicQuestion> {
        val all = getAllQuestions()
        val shuffled = all.sortedBy { (it.id + dateString).hashCode() }
        
        val selected = mutableListOf<ForensicQuestion>()
        val categoriesSeen = mutableSetOf<ForensicCategory>()

        for (q in shuffled) {
            if (q.category !in categoriesSeen) {
                selected.add(q)
                categoriesSeen.add(q.category)
                if (selected.size == 5) break
            }
        }

        if (selected.size < 5) {
            for (q in shuffled) {
                if (q !in selected) {
                    selected.add(q)
                    if (selected.size == 5) break
                }
            }
        }
        return selected
    }

    suspend fun getQuestionsByCategory(category: ForensicCategory): List<ForensicQuestion> {
        return getAllQuestions().filter { it.category == category }
    }

    suspend fun getQuestionsByDifficulty(difficulty: Difficulty): List<ForensicQuestion> {
        return getAllQuestions().filter { it.difficulty == difficulty }
    }

    suspend fun getQuestionById(id: String): ForensicQuestion? {
        return getAllQuestions().find { it.id == id }
    }

    fun getFlashcards(): List<ForensicFlashcard> = ForensicFlashcardsBank.flashcards

    // Custom questions management
    suspend fun insertCustomQuestions(questions: List<ForensicQuestion>) {
        val entities = questions.map { it.toCustomEntity() }
        dao.insertCustomQuestions(entities)
    }

    suspend fun deleteCustomQuestion(questionId: String) {
        dao.deleteCustomQuestion(questionId)
    }

    suspend fun deleteAllCustomQuestions() {
        dao.deleteAllCustomQuestions()
    }

    fun observeDailyAttemptForToday(): Flow<QuizAttemptEntity?> {
        return dao.observeDailyAttemptForDate(getTodayDateString())
    }

    fun getAllAttempts(): Flow<List<QuizAttemptEntity>> = dao.getAllAttempts()

    fun getUserStats(): Flow<UserStatsEntity?> = dao.getUserStats()

    fun getBookmarkedQuestionIds(): Flow<List<String>> = dao.getBookmarkedQuestionIds()

    fun getBookmarks(): Flow<List<BookmarkedQuestionEntity>> = dao.getAllBookmarks()

    fun getIncorrectQuestions(): Flow<List<ForensicQuestion>> {
        return dao.getIncorrectQuestionAttempts().map { attempts ->
            val all = getAllQuestions()
            attempts.mapNotNull { attempt ->
                all.find { it.id == attempt.questionId }
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
        questionResults: Map<String, Pair<Int, Boolean>>
    ): Long {
        val todayStr = getTodayDateString()

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

        val currentStats = dao.getUserStatsOnce() ?: UserStatsEntity()
        val yesterdayStr = getYesterdayDateString()

        val newStreak = when {
            currentStats.lastCompletedDate == todayStr -> currentStats.currentStreak
            currentStats.lastCompletedDate == yesterdayStr -> currentStats.currentStreak + 1
            currentStats.lastCompletedDate.isEmpty() -> 1
            else -> 1
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
