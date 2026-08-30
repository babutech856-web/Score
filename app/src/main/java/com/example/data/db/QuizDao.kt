package com.example.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface QuizDao {

    // Attempts
    @Query("SELECT * FROM quiz_attempts ORDER BY timestamp DESC")
    fun getAllAttempts(): Flow<List<QuizAttemptEntity>>

    @Query("SELECT * FROM quiz_attempts WHERE isDailyQuiz = 1 AND dateString = :dateString LIMIT 1")
    suspend fun getDailyAttemptForDate(dateString: String): QuizAttemptEntity?

    @Query("SELECT * FROM quiz_attempts WHERE isDailyQuiz = 1 AND dateString = :dateString LIMIT 1")
    fun observeDailyAttemptForDate(dateString: String): Flow<QuizAttemptEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAttempt(attempt: QuizAttemptEntity): Long

    // Bookmarks
    @Query("SELECT * FROM question_bookmarks ORDER BY bookmarkedAt DESC")
    fun getAllBookmarks(): Flow<List<BookmarkedQuestionEntity>>

    @Query("SELECT questionId FROM question_bookmarks")
    fun getBookmarkedQuestionIds(): Flow<List<String>>

    @Query("SELECT EXISTS(SELECT 1 FROM question_bookmarks WHERE questionId = :questionId)")
    suspend fun isBookmarked(questionId: String): Boolean

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBookmark(bookmark: BookmarkedQuestionEntity)

    @Query("DELETE FROM question_bookmarks WHERE questionId = :questionId")
    suspend fun deleteBookmark(questionId: String)

    @Query("UPDATE question_bookmarks SET notes = :notes WHERE questionId = :questionId")
    suspend fun updateBookmarkNotes(questionId: String, notes: String)

    // Question Attempts
    @Query("SELECT * FROM question_attempts")
    fun getAllQuestionAttempts(): Flow<List<QuestionAttemptEntity>>

    @Query("SELECT * FROM question_attempts WHERE timesCorrect < timesAttempted")
    fun getIncorrectQuestionAttempts(): Flow<List<QuestionAttemptEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdateQuestionAttempt(attempt: QuestionAttemptEntity)

    @Query("SELECT * FROM question_attempts WHERE questionId = :questionId")
    suspend fun getQuestionAttempt(questionId: String): QuestionAttemptEntity?

    // User Stats
    @Query("SELECT * FROM user_stats WHERE id = 1")
    fun getUserStats(): Flow<UserStatsEntity?>

    @Query("SELECT * FROM user_stats WHERE id = 1")
    suspend fun getUserStatsOnce(): UserStatsEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdateUserStats(stats: UserStatsEntity)
}
