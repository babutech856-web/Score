package com.example.ui.viewmodel

import android.app.Application
import android.content.Context
import android.net.Uri
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.datasource.ForensicQuestionBank
import com.example.data.db.AppDatabase
import com.example.data.db.BookmarkedQuestionEntity
import com.example.data.db.CustomQuestionEntity
import com.example.data.db.QuizAttemptEntity
import com.example.data.db.UserStatsEntity
import com.example.data.model.Difficulty
import com.example.data.model.ForensicCategory
import com.example.data.model.ForensicFlashcard
import com.example.data.model.ForensicQuestion
import com.example.data.model.QuizMode
import com.example.data.parser.ParseResult
import com.example.data.parser.QuestionDocParser
import com.example.data.repository.ForensicRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class ActiveQuizState(
    val isActive: Boolean = false,
    val quizTitle: String = "",
    val category: ForensicCategory? = null,
    val isDailyQuiz: Boolean = false,
    val mode: QuizMode = QuizMode.PRACTICE,
    val questions: List<ForensicQuestion> = emptyList(),
    val currentIndex: Int = 0,
    val selectedAnswers: Map<Int, Int> = emptyMap(), // index -> optionIndex
    val isCompleted: Boolean = false,
    val timeElapsedSeconds: Int = 0,
    val completedAttemptId: Long? = null
) {
    val currentQuestion: ForensicQuestion?
        get() = questions.getOrNull(currentIndex)

    val currentSelectedOption: Int?
        get() = selectedAnswers[currentIndex]

    val totalQuestions: Int
        get() = questions.size

    val answeredCount: Int
        get() = selectedAnswers.size

    val correctCount: Int
        get() = questions.indices.count { idx ->
            selectedAnswers[idx] == questions[idx].correctOptionIndex
        }

    val scorePercentage: Int
        get() = if (totalQuestions > 0) (correctCount * 100) / totalQuestions else 0
}

data class DailyHubUiState(
    val todayFormatted: String = "",
    val streak: Int = 0,
    val maxStreak: Int = 0,
    val isDailyCompletedToday: Boolean = false,
    val todayScore: Int = 0,
    val totalQuizzesTaken: Int = 0,
    val totalQuestionsAnswered: Int = 0,
    val overallAccuracy: Int = 0,
    val bookmarkedIds: Set<String> = emptySet(),
    val recentAttempts: List<QuizAttemptEntity> = emptyList(),
    val totalQuestionsInBank: Int = 208,
    val customQuestionsCount: Int = 0
)

class ForensicQuizViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: ForensicRepository

    init {
        val db = AppDatabase.getDatabase(application)
        repository = ForensicRepository(db)
    }

    private val _activeQuizState = MutableStateFlow(ActiveQuizState())
    val activeQuizState: StateFlow<ActiveQuizState> = _activeQuizState.asStateFlow()

    private val _userStats = repository.getUserStats()
    private val _dailyAttempt = repository.observeDailyAttemptForToday()
    private val _recentAttempts = repository.getAllAttempts()
    private val _bookmarkedIds = repository.getBookmarkedQuestionIds()

    val customQuestions: StateFlow<List<CustomQuestionEntity>> = repository.getAllCustomQuestionsFlow()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val allBookmarks: StateFlow<List<BookmarkedQuestionEntity>> = repository.getBookmarks()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val incorrectQuestions: StateFlow<List<ForensicQuestion>> = repository.getIncorrectQuestions()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val flashcards: List<ForensicFlashcard> = repository.getFlashcards()

    private var timerJob: Job? = null

    val dailyHubUiState: StateFlow<DailyHubUiState> = combine(
        _userStats,
        _dailyAttempt,
        _recentAttempts,
        _bookmarkedIds,
        customQuestions
    ) { stats, dailyAttempt, recent, bookmarks, customs ->
        val dateFormat = SimpleDateFormat("EEEE, MMMM d", Locale.getDefault())
        val todayStr = dateFormat.format(Date())

        val totalQuestions = stats?.totalQuestions ?: 0
        val totalCorrect = stats?.totalCorrect ?: 0
        val accuracy = if (totalQuestions > 0) (totalCorrect * 100) / totalQuestions else 0

        DailyHubUiState(
            todayFormatted = todayStr,
            streak = stats?.currentStreak ?: 0,
            maxStreak = stats?.maxStreak ?: 0,
            isDailyCompletedToday = dailyAttempt != null,
            todayScore = dailyAttempt?.let {
                if (it.totalQuestions > 0) (it.correctAnswers * 100) / it.totalQuestions else 0
            } ?: 0,
            totalQuizzesTaken = stats?.totalQuizzes ?: 0,
            totalQuestionsAnswered = totalQuestions,
            overallAccuracy = accuracy,
            bookmarkedIds = bookmarks.toSet(),
            recentAttempts = recent,
            totalQuestionsInBank = ForensicQuestionBank.staticQuestions.size + customs.size,
            customQuestionsCount = customs.size
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), DailyHubUiState())

    fun startDailyQuiz(mode: QuizMode = QuizMode.PRACTICE) {
        viewModelScope.launch {
            val questions = repository.getDailyQuestions()
            val dateFormat = SimpleDateFormat("MMM d", Locale.getDefault())
            val title = "Daily Forensic Challenge (${dateFormat.format(Date())})"

            startQuizSession(
                title = title,
                category = null,
                isDailyQuiz = true,
                mode = mode,
                questions = questions
            )
        }
    }

    fun startTopicQuiz(
        category: ForensicCategory,
        count: Int = 5,
        mode: QuizMode = QuizMode.PRACTICE
    ) {
        viewModelScope.launch {
            val allTopicQuestions = repository.getQuestionsByCategory(category)
            val selected = allTopicQuestions.shuffled().take(count.coerceAtMost(allTopicQuestions.size))

            startQuizSession(
                title = "${category.shortName} Practice",
                category = category,
                isDailyQuiz = false,
                mode = mode,
                questions = selected
            )
        }
    }

    fun startVignetteQuiz(mode: QuizMode = QuizMode.PRACTICE) {
        viewModelScope.launch {
            val vignettes = repository.getQuestionsByDifficulty(Difficulty.VIGNETTE)
            startQuizSession(
                title = "Autopsy & Clinical Vignettes",
                category = ForensicCategory.AUTOPSY_CASES,
                isDailyQuiz = false,
                mode = mode,
                questions = vignettes.shuffled()
            )
        }
    }

    fun startRapidFireQuiz(count: Int = 10, mode: QuizMode = QuizMode.PRACTICE) {
        viewModelScope.launch {
            val allQuestions = repository.getAllQuestions().shuffled().take(count)
            startQuizSession(
                title = "Rapid Fire Mix ($count Questions)",
                category = null,
                isDailyQuiz = false,
                mode = mode,
                questions = allQuestions
            )
        }
    }

    fun startMistakesQuiz(mode: QuizMode = QuizMode.PRACTICE) {
        viewModelScope.launch {
            val mistakes = incorrectQuestions.value
            val questionsToUse = if (mistakes.isNotEmpty()) {
                mistakes.shuffled().take(10)
            } else {
                repository.getAllQuestions().shuffled().take(5)
            }

            startQuizSession(
                title = if (mistakes.isNotEmpty()) "Review Weak Areas" else "Targeted Practice",
                category = null,
                isDailyQuiz = false,
                mode = mode,
                questions = questionsToUse
            )
        }
    }

    fun startCustomQuestionsQuiz(mode: QuizMode = QuizMode.PRACTICE) {
        viewModelScope.launch {
            val customs = customQuestions.value.map { it.toForensicQuestion() }
            if (customs.isNotEmpty()) {
                startQuizSession(
                    title = "My Imported Questions (${customs.size} Qs)",
                    category = null,
                    isDailyQuiz = false,
                    mode = mode,
                    questions = customs
                )
            }
        }
    }

    private fun startQuizSession(
        title: String,
        category: ForensicCategory?,
        isDailyQuiz: Boolean,
        mode: QuizMode,
        questions: List<ForensicQuestion>
    ) {
        timerJob?.cancel()
        _activeQuizState.value = ActiveQuizState(
            isActive = true,
            quizTitle = title,
            category = category,
            isDailyQuiz = isDailyQuiz,
            mode = mode,
            questions = questions,
            currentIndex = 0,
            selectedAnswers = emptyMap(),
            isCompleted = false,
            timeElapsedSeconds = 0,
            completedAttemptId = null
        )

        timerJob = viewModelScope.launch {
            while (_activeQuizState.value.isActive && !_activeQuizState.value.isCompleted) {
                delay(1000)
                _activeQuizState.update { it.copy(timeElapsedSeconds = it.timeElapsedSeconds + 1) }
            }
        }
    }

    fun selectOption(optionIndex: Int) {
        val currentState = _activeQuizState.value
        if (currentState.isCompleted) return

        if (currentState.mode == QuizMode.PRACTICE && currentState.selectedAnswers.containsKey(currentState.currentIndex)) {
            return
        }

        _activeQuizState.update {
            val newAnswers = it.selectedAnswers.toMutableMap()
            newAnswers[it.currentIndex] = optionIndex
            it.copy(selectedAnswers = newAnswers)
        }
    }

    fun nextQuestion() {
        val currentState = _activeQuizState.value
        if (currentState.currentIndex < currentState.totalQuestions - 1) {
            _activeQuizState.update { it.copy(currentIndex = it.currentIndex + 1) }
        } else {
            finishQuiz()
        }
    }

    fun previousQuestion() {
        val currentState = _activeQuizState.value
        if (currentState.currentIndex > 0) {
            _activeQuizState.update { it.copy(currentIndex = it.currentIndex - 1) }
        }
    }

    fun jumpToQuestion(index: Int) {
        val currentState = _activeQuizState.value
        if (index in 0 until currentState.totalQuestions) {
            _activeQuizState.update { it.copy(currentIndex = index) }
        }
    }

    fun finishQuiz() {
        timerJob?.cancel()
        val state = _activeQuizState.value
        if (!state.isActive || state.isCompleted) return

        val resultsMap = mutableMapOf<String, Pair<Int, Boolean>>()
        state.questions.forEachIndexed { index, question ->
            val selected = state.selectedAnswers[index] ?: -1
            val isCorrect = selected == question.correctOptionIndex
            resultsMap[question.id] = Pair(selected, isCorrect)
        }

        viewModelScope.launch {
            val attemptId = repository.recordQuizCompletion(
                quizTitle = state.quizTitle,
                categoryName = state.category?.name,
                isDailyQuiz = state.isDailyQuiz,
                totalQuestions = state.totalQuestions,
                correctAnswers = state.correctCount,
                timeTakenSeconds = state.timeElapsedSeconds,
                questionResults = resultsMap
            )

            _activeQuizState.update {
                it.copy(
                    isCompleted = true,
                    completedAttemptId = attemptId
                )
            }
        }
    }

    fun exitQuiz() {
        timerJob?.cancel()
        _activeQuizState.value = ActiveQuizState()
    }

    fun toggleBookmark(questionId: String) {
        viewModelScope.launch {
            repository.toggleBookmark(questionId)
        }
    }

    fun saveBookmarkNote(questionId: String, notes: String) {
        viewModelScope.launch {
            repository.saveBookmarkNotes(questionId, notes)
        }
    }

    fun isQuestionBookmarked(questionId: String): Boolean {
        return dailyHubUiState.value.bookmarkedIds.contains(questionId)
    }

    fun getCategoryMastery(category: ForensicCategory): Float {
        val count = ForensicQuestionBank.getQuestionsByCategory(category).size
        return if (count > 0) 0.85f else 0f
    }

    // ==================== CUSTOM QUESTIONS IMPORT / MANAGEMENT ====================

    fun saveParsedQuestions(questions: List<ForensicQuestion>, onComplete: (Int) -> Unit) {
        viewModelScope.launch {
            repository.insertCustomQuestions(questions)
            onComplete(questions.size)
        }
    }

    fun deleteCustomQuestion(id: String) {
        viewModelScope.launch {
            repository.deleteCustomQuestion(id)
        }
    }

    fun deleteAllCustomQuestions() {
        viewModelScope.launch {
            repository.deleteAllCustomQuestions()
        }
    }

    fun parseRawText(text: String): ParseResult {
        return QuestionDocParser.parseDocument(text)
    }

    fun parseFromUri(context: Context, uri: Uri): ParseResult {
        val text = QuestionDocParser.readTextFromUri(context, uri)
        return QuestionDocParser.parseDocument(text)
    }
}
