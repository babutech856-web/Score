package com.example.ui.screens

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.BookmarkBorder
import androidx.compose.material.icons.outlined.ChevronLeft
import androidx.compose.material.icons.outlined.ChevronRight
import androidx.compose.material.icons.outlined.Timer
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.QuizMode
import com.example.ui.components.DifficultyBadge
import com.example.ui.components.ExplanationBox
import com.example.ui.components.OptionItem
import com.example.ui.theme.ForensicsAmber
import com.example.ui.theme.ForensicsCyan
import com.example.ui.viewmodel.ActiveQuizState

@Composable
fun QuizPlayScreen(
    state: ActiveQuizState,
    isBookmarked: Boolean,
    onSelectOption: (Int) -> Unit,
    onNextQuestion: () -> Unit,
    onPreviousQuestion: () -> Unit,
    onFinishQuiz: () -> Unit,
    onToggleBookmark: () -> Unit,
    onExitQuiz: () -> Unit,
    modifier: Modifier = Modifier
) {
    var showExitDialog by remember { mutableStateOf(false) }

    val currentQuestion = state.currentQuestion ?: return
    val selectedOptionIndex = state.currentSelectedOption
    val hasAnswered = selectedOptionIndex != null

    val minutes = state.timeElapsedSeconds / 60
    val seconds = state.timeElapsedSeconds % 60
    val timerString = String.format("%02d:%02d", minutes, seconds)

    if (showExitDialog) {
        AlertDialog(
            onDismissRequest = { showExitDialog = false },
            title = { Text("Quit Current Quiz?") },
            text = { Text("Your current progress will not be saved.") },
            confirmButton = {
                Button(
                    onClick = {
                        showExitDialog = false
                        onExitQuiz()
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)
                ) {
                    Text("Quit Quiz")
                }
            },
            dismissButton = {
                TextButton(onClick = { showExitDialog = false }) {
                    Text("Continue")
                }
            }
        )
    }

    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .testTag("quiz_play_screen"),
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = { showExitDialog = true },
                        modifier = Modifier.testTag("quiz_close_btn")
                    ) {
                        Icon(imageVector = Icons.Default.Close, contentDescription = "Close Quiz")
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = state.quizTitle,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "Question ${state.currentIndex + 1} of ${state.totalQuestions}",
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                    Surface(
                        color = MaterialTheme.colorScheme.surfaceVariant,
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.Timer,
                                contentDescription = "Timer",
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier.size(16.dp)
                            )
                            Text(
                                text = timerString,
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                // Progress Bar
                LinearProgressIndicator(
                    progress = { (state.currentIndex + 1).toFloat() / state.totalQuestions },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp)
                        .clip(RoundedCornerShape(3.dp)),
                    color = MaterialTheme.colorScheme.primary,
                    trackColor = MaterialTheme.colorScheme.surfaceVariant
                )
            }
        },
        bottomBar = {
            Surface(
                modifier = Modifier.fillMaxWidth(),
                tonalElevation = 8.dp,
                shadowElevation = 8.dp,
                color = MaterialTheme.colorScheme.surface
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Previous Button
                    OutlinedButton(
                        onClick = onPreviousQuestion,
                        enabled = state.currentIndex > 0,
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier.testTag("quiz_prev_btn")
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.ChevronLeft,
                            contentDescription = "Previous"
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("Prev")
                    }

                    // Next / Finish Button
                    val isLastQuestion = state.currentIndex == state.totalQuestions - 1
                    Button(
                        onClick = {
                            if (isLastQuestion) onFinishQuiz() else onNextQuestion()
                        },
                        enabled = hasAnswered || state.mode == QuizMode.EXAM,
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (isLastQuestion) ForensicsAmber else MaterialTheme.colorScheme.primary
                        ),
                        modifier = Modifier.testTag("quiz_next_btn")
                    ) {
                        Text(
                            text = if (isLastQuestion) "Finish & Review" else "Next Question",
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(
                            imageVector = Icons.Outlined.ChevronRight,
                            contentDescription = "Next"
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        AnimatedContent(
            targetState = state.currentIndex,
            transitionSpec = {
                if (targetState > initialState) {
                    (slideInHorizontally(animationSpec = tween(280)) { it / 2 } + fadeIn(animationSpec = tween(280)))
                        .togetherWith(slideOutHorizontally(animationSpec = tween(280)) { -it / 2 } + fadeOut(animationSpec = tween(280)))
                } else {
                    (slideInHorizontally(animationSpec = tween(280)) { -it / 2 } + fadeIn(animationSpec = tween(280)))
                        .togetherWith(slideOutHorizontally(animationSpec = tween(280)) { it / 2 } + fadeOut(animationSpec = tween(280)))
                }
            },
            label = "question_change_anim",
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) { _ ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                contentPadding = PaddingValues(top = 16.dp, bottom = 24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Category & Difficulty Chips + Bookmark
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                color = currentQuestion.category.accentColor.copy(alpha = 0.15f),
                                shape = RoundedCornerShape(8.dp)
                            ) {
                                Text(
                                    text = currentQuestion.category.shortName,
                                    color = currentQuestion.category.accentColor,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }

                            DifficultyBadge(difficulty = currentQuestion.difficulty)
                        }

                        IconButton(
                            onClick = onToggleBookmark,
                            modifier = Modifier.testTag("quiz_bookmark_btn")
                        ) {
                            Icon(
                                imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Outlined.BookmarkBorder,
                                contentDescription = "Bookmark Question",
                                tint = if (isBookmarked) ForensicsAmber else MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }

                // Question Text
                item {
                    Text(
                        text = currentQuestion.question,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.SemiBold,
                        lineHeight = 24.sp,
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.testTag("question_text")
                    )
                }

                // Options List
                item {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        val letters = listOf("A", "B", "C", "D", "E")
                        currentQuestion.options.forEachIndexed { index, optionText ->
                            val letter = letters.getOrElse(index) { "${index + 1}" }
                            val isSelected = selectedOptionIndex == index

                            // Determine reveal state for practice mode
                            val isCorrectOption: Boolean? = if (hasAnswered && state.mode == QuizMode.PRACTICE) {
                                index == currentQuestion.correctOptionIndex
                            } else null

                            OptionItem(
                                optionLetter = letter,
                                optionText = optionText,
                                isSelected = isSelected,
                                isCorrectOption = isCorrectOption,
                                isUserSelected = isSelected,
                                isEnabled = !hasAnswered || state.mode == QuizMode.EXAM,
                                onClick = { onSelectOption(index) }
                            )
                        }
                    }
                }

                // Explanation Box (In Practice Mode, revealed after answering)
                if (hasAnswered && state.mode == QuizMode.PRACTICE) {
                    item {
                        AnimatedVisibility(
                            visible = true,
                            enter = fadeIn() + slideInVertically(initialOffsetY = { 40 })
                        ) {
                            ExplanationBox(question = currentQuestion)
                        }
                    }
                }
            }
        }
    }
}
