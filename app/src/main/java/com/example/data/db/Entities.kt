package com.example.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quiz_attempts")
data class QuizAttemptEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val quizTitle: String,
    val categoryName: String?,
    val dateString: String, // YYYY-MM-DD
    val totalQuestions: Int,
    val correctAnswers: Int,
    val timeTakenSeconds: Int,
    val timestamp: Long = System.currentTimeMillis(),
    val isDailyQuiz: Boolean = false
)

@Entity(tableName = "question_bookmarks")
data class BookmarkedQuestionEntity(
    @PrimaryKey val questionId: String,
    val notes: String = "",
    val bookmarkedAt: Long = System.currentTimeMillis()
)

@Entity(tableName = "question_attempts")
data class QuestionAttemptEntity(
    @PrimaryKey val questionId: String,
    val timesAttempted: Int = 0,
    val timesCorrect: Int = 0,
    val lastSelectedOption: Int = -1,
    val lastAttemptedAt: Long = System.currentTimeMillis()
)

@Entity(tableName = "user_stats")
data class UserStatsEntity(
    @PrimaryKey val id: Int = 1,
    val currentStreak: Int = 0,
    val maxStreak: Int = 0,
    val lastCompletedDate: String = "",
    val totalQuizzes: Int = 0,
    val totalQuestions: Int = 0,
    val totalCorrect: Int = 0
)
