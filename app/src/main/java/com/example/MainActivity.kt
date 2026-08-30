package com.example

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.Leaderboard
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.Today
import androidx.compose.material.icons.outlined.BookmarkBorder
import androidx.compose.material.icons.outlined.Category
import androidx.compose.material.icons.outlined.Leaderboard
import androidx.compose.material.icons.outlined.Lightbulb
import androidx.compose.material.icons.outlined.Today
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.data.model.QuizMode
import com.example.ui.screens.AnalyticsScreen
import com.example.ui.screens.BookmarksReviewScreen
import com.example.ui.screens.DailyHomeScreen
import com.example.ui.screens.FlashcardsScreen
import com.example.ui.screens.QuizPlayScreen
import com.example.ui.screens.QuizSummaryScreen
import com.example.ui.screens.TopicQuizzesScreen
import com.example.ui.screens.UpdateQuestionsScreen
import com.example.ui.theme.MyApplicationTheme
import com.example.ui.viewmodel.ForensicQuizViewModel

enum class MainNavigationTab(
    val title: String,
    val selectedIcon: androidx.compose.ui.graphics.vector.ImageVector,
    val unselectedIcon: androidx.compose.ui.graphics.vector.ImageVector
) {
    DAILY("Daily Hub", Icons.Default.Today, Icons.Outlined.Today),
    TOPICS("Specialties", Icons.Default.Category, Icons.Outlined.Category),
    PEARLS("Pearls", Icons.Default.Lightbulb, Icons.Outlined.Lightbulb),
    VAULT("Vault", Icons.Default.Bookmark, Icons.Outlined.BookmarkBorder),
    ANALYTICS("Analytics", Icons.Default.Leaderboard, Icons.Outlined.Leaderboard)
}

class MainActivity : ComponentActivity() {

    private val viewModel: ForensicQuizViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        hideSystemBars()

        setContent {
            MyApplicationTheme {
                ForensicQuizApp(viewModel = viewModel)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        hideSystemBars()
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            hideSystemBars()
        }
    }

    private fun hideSystemBars() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        val insetsController = WindowCompat.getInsetsController(window, window.decorView)
        insetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        insetsController.hide(WindowInsetsCompat.Type.systemBars())
    }
}

@Composable
fun ForensicQuizApp(viewModel: ForensicQuizViewModel) {
    val activeQuizState by viewModel.activeQuizState.collectAsStateWithLifecycle()
    val dailyHubState by viewModel.dailyHubUiState.collectAsStateWithLifecycle()
    val bookmarks by viewModel.allBookmarks.collectAsStateWithLifecycle()
    val incorrectQuestions by viewModel.incorrectQuestions.collectAsStateWithLifecycle()

    var selectedTab by remember { mutableStateOf(MainNavigationTab.DAILY) }
    var isUpdateQuestionsOpen by remember { mutableStateOf(false) }

    when {
        // Quiz is in active playing mode
        activeQuizState.isActive && !activeQuizState.isCompleted -> {
            val currentQuestion = activeQuizState.currentQuestion
            val isCurrentBookmarked = currentQuestion?.let {
                dailyHubState.bookmarkedIds.contains(it.id)
            } ?: false

            QuizPlayScreen(
                state = activeQuizState,
                isBookmarked = isCurrentBookmarked,
                onSelectOption = { viewModel.selectOption(it) },
                onNextQuestion = { viewModel.nextQuestion() },
                onPreviousQuestion = { viewModel.previousQuestion() },
                onFinishQuiz = { viewModel.finishQuiz() },
                onToggleBookmark = {
                    currentQuestion?.let { viewModel.toggleBookmark(it.id) }
                },
                onExitQuiz = { viewModel.exitQuiz() }
            )
        }

        // Quiz is completed -> Summary Screen
        activeQuizState.isActive && activeQuizState.isCompleted -> {
            QuizSummaryScreen(
                state = activeQuizState,
                bookmarkedIds = dailyHubState.bookmarkedIds,
                onToggleBookmark = { viewModel.toggleBookmark(it) },
                onPlayAgain = {
                    if (activeQuizState.isDailyQuiz) {
                        viewModel.startDailyQuiz(activeQuizState.mode)
                    } else if (activeQuizState.category != null) {
                        viewModel.startTopicQuiz(activeQuizState.category!!, activeQuizState.totalQuestions, activeQuizState.mode)
                    } else {
                        viewModel.startRapidFireQuiz(activeQuizState.totalQuestions, activeQuizState.mode)
                    }
                },
                onBackHome = { viewModel.exitQuiz() }
            )
        }

        // Add / Update Questions Screen
        isUpdateQuestionsOpen -> {
            BackHandler {
                isUpdateQuestionsOpen = false
            }
            UpdateQuestionsScreen(
                viewModel = viewModel,
                onNavigateBack = { isUpdateQuestionsOpen = false },
                onStartQuiz = { isUpdateQuestionsOpen = false }
            )
        }

        // Main Navigation Shell
        else -> {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                bottomBar = {
                    NavigationBar(
                        modifier = Modifier.testTag("main_bottom_nav"),
                        containerColor = MaterialTheme.colorScheme.surface
                    ) {
                        MainNavigationTab.values().forEach { tab ->
                            val isSelected = selectedTab == tab
                            NavigationBarItem(
                                selected = isSelected,
                                onClick = { selectedTab = tab },
                                icon = {
                                    Icon(
                                        imageVector = if (isSelected) tab.selectedIcon else tab.unselectedIcon,
                                        contentDescription = tab.title
                                    )
                                },
                                label = {
                                    Text(
                                        text = tab.title,
                                        fontSize = 11.sp,
                                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                                    )
                                },
                                modifier = Modifier.testTag("nav_tab_${tab.name.lowercase()}")
                            )
                        }
                    }
                }
            ) { innerPadding ->
                Crossfade(
                    targetState = selectedTab,
                    label = "tab_transition",
                    modifier = Modifier.padding(innerPadding)
                ) { tab ->
                    when (tab) {
                        MainNavigationTab.DAILY -> {
                            DailyHomeScreen(
                                state = dailyHubState,
                                onStartDailyQuiz = { viewModel.startDailyQuiz(QuizMode.PRACTICE) },
                                onStartRapidFire = { viewModel.startRapidFireQuiz(10, QuizMode.PRACTICE) },
                                onStartVignettes = { viewModel.startVignetteQuiz(QuizMode.PRACTICE) },
                                onStartMistakes = { viewModel.startMistakesQuiz(QuizMode.PRACTICE) },
                                onSelectCategory = { category ->
                                    viewModel.startTopicQuiz(category, 10, QuizMode.PRACTICE)
                                },
                                onOpenFlashcards = { selectedTab = MainNavigationTab.PEARLS },
                                onOpenBookmarks = { selectedTab = MainNavigationTab.VAULT },
                                onOpenUpdateQuestions = { isUpdateQuestionsOpen = true }
                            )
                        }
                        MainNavigationTab.TOPICS -> {
                            TopicQuizzesScreen(
                                onStartTopicQuiz = { category, count, mode ->
                                    viewModel.startTopicQuiz(category, count, mode)
                                },
                                onOpenUpdateQuestions = { isUpdateQuestionsOpen = true }
                            )
                        }
                        MainNavigationTab.PEARLS -> {
                            FlashcardsScreen(flashcards = viewModel.flashcards)
                        }
                        MainNavigationTab.VAULT -> {
                            BookmarksReviewScreen(
                                bookmarks = bookmarks,
                                incorrectQuestions = incorrectQuestions,
                                onToggleBookmark = { viewModel.toggleBookmark(it) }
                            )
                        }
                        MainNavigationTab.ANALYTICS -> {
                            AnalyticsScreen(state = dailyHubState)
                        }
                    }
                }
            }
        }
    }
}
