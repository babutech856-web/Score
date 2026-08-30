package com.example.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.data.model.Difficulty
import com.example.data.model.ForensicCategory
import com.example.data.model.ForensicQuestion

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

@Entity(tableName = "custom_questions")
data class CustomQuestionEntity(
    @PrimaryKey val id: String,
    val categoryName: String,
    val question: String,
    val optionsString: String, // Pipe-separated options: Option 1|Option 2|Option 3|Option 4
    val correctOptionIndex: Int,
    val explanation: String,
    val clinicalPearl: String,
    val difficultyName: String = "STANDARD",
    val reference: String = "User Imported Question",
    val importedAt: Long = System.currentTimeMillis()
) {
    fun toForensicQuestion(): ForensicQuestion {
        val cat = try {
            ForensicCategory.valueOf(categoryName)
        } catch (e: Exception) {
            ForensicCategory.values().find {
                it.name.equals(categoryName, ignoreCase = true) ||
                it.shortName.equals(categoryName, ignoreCase = true) ||
                it.title.contains(categoryName, ignoreCase = true)
            } ?: ForensicCategory.AUTOPSY_CASES
        }

        val diff = try {
            Difficulty.valueOf(difficultyName)
        } catch (e: Exception) {
            Difficulty.STANDARD
        }

        val parsedOptions = optionsString.split("||").filter { it.isNotBlank() }
        val finalOptions = if (parsedOptions.size >= 2) parsedOptions else listOf("Option A", "Option B", "Option C", "Option D")

        return ForensicQuestion(
            id = id,
            category = cat,
            question = question,
            options = finalOptions,
            correctOptionIndex = correctOptionIndex.coerceIn(0, finalOptions.size - 1),
            explanation = explanation,
            clinicalPearl = clinicalPearl,
            difficulty = diff,
            reference = reference
        )
    }
}

fun ForensicQuestion.toCustomEntity(): CustomQuestionEntity {
    return CustomQuestionEntity(
        id = id,
        categoryName = category.name,
        question = question,
        optionsString = options.joinToString("||"),
        correctOptionIndex = correctOptionIndex,
        explanation = explanation,
        clinicalPearl = clinicalPearl,
        difficultyName = difficulty.name,
        reference = reference
    )
}
