package com.example.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material.icons.outlined.Lightbulb
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.Difficulty
import com.example.data.model.ForensicQuestion
import com.example.ui.theme.CorrectGreen
import com.example.ui.theme.ForensicsAmber
import com.example.ui.theme.ImmersiveAmber
import com.example.ui.theme.ImmersiveBorder
import com.example.ui.theme.ImmersiveCardBg
import com.example.ui.theme.ImmersiveCoral
import com.example.ui.theme.ImmersiveCyan
import com.example.ui.theme.ImmersiveEmerald
import com.example.ui.theme.ImmersiveTextPrimary
import com.example.ui.theme.ImmersiveTextSecondary
import com.example.ui.theme.IncorrectRed
import com.example.ui.theme.StreakFireStart

@Composable
fun StreakBadge(
    streakCount: Int,
    isCompletedToday: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Surface(
        modifier = modifier
            .clip(RoundedCornerShape(20.dp))
            .clickable { onClick() }
            .testTag("streak_badge"),
        color = if (streakCount > 0) Color(0xFF232A38) else MaterialTheme.colorScheme.surfaceVariant,
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(
            1.dp,
            if (isCompletedToday) ImmersiveAmber.copy(alpha = 0.8f) else ImmersiveBorder
        )
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Icon(
                imageVector = Icons.Default.LocalFireDepartment,
                contentDescription = "Daily Streak",
                tint = if (streakCount > 0) StreakFireStart else MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f),
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = "$streakCount ${if (streakCount == 1) "day" else "days"}",
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                color = if (streakCount > 0) ImmersiveTextPrimary else ImmersiveTextSecondary
            )
        }
    }
}

@Composable
fun DifficultyBadge(
    difficulty: Difficulty,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier,
        color = difficulty.badgeColor.copy(alpha = 0.15f),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, difficulty.badgeColor.copy(alpha = 0.5f))
    ) {
        Text(
            text = difficulty.label,
            color = difficulty.badgeColor,
            fontSize = 11.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
        )
    }
}

@Composable
fun OptionItem(
    optionLetter: String,
    optionText: String,
    isSelected: Boolean,
    isCorrectOption: Boolean?, // null if not revealed yet
    isUserSelected: Boolean,
    isEnabled: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val backgroundColor by animateColorAsState(
        targetValue = when {
            isCorrectOption == true -> Color(0xFF064E3B).copy(alpha = 0.6f)
            isUserSelected && isCorrectOption == false -> Color(0xFF7F1D1D).copy(alpha = 0.6f)
            isSelected -> Color(0xFF1E3A5F)
            else -> ImmersiveCardBg
        },
        animationSpec = tween(durationMillis = 200),
        label = "option_bg"
    )

    val borderColor by animateColorAsState(
        targetValue = when {
            isCorrectOption == true -> ImmersiveEmerald
            isUserSelected && isCorrectOption == false -> ImmersiveCoral
            isSelected -> ImmersiveCyan
            else -> ImmersiveBorder
        },
        animationSpec = tween(durationMillis = 200),
        label = "option_border"
    )

    val textColor = when {
        isCorrectOption == true -> Color(0xFF86EFAC)
        isUserSelected && isCorrectOption == false -> Color(0xFFFCA5A5)
        isSelected -> ImmersiveTextPrimary
        else -> ImmersiveTextPrimary
    }

    val badgeColor = when {
        isCorrectOption == true -> ImmersiveEmerald
        isUserSelected && isCorrectOption == false -> ImmersiveCoral
        isSelected -> ImmersiveCyan
        else -> Color(0xFF283142)
    }

    val badgeTextColor = when {
        isCorrectOption == true || (isUserSelected && isCorrectOption == false) -> Color.White
        isSelected -> Color(0xFF0B132B)
        else -> ImmersiveTextSecondary
    }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(14.dp))
            .clickable(enabled = isEnabled) { onClick() }
            .testTag("option_$optionLetter"),
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        border = BorderStroke(if (isSelected || isCorrectOption != null) 1.5.dp else 1.dp, borderColor),
        elevation = CardDefaults.cardElevation(defaultElevation = if (isSelected) 2.dp else 0.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Letter Badge (A, B, C, D)
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape)
                    .background(badgeColor),
                contentAlignment = Alignment.Center
            ) {
                if (isCorrectOption == true) {
                    Icon(
                        imageVector = Icons.Outlined.Check,
                        contentDescription = "Correct",
                        tint = Color.White,
                        modifier = Modifier.size(18.dp)
                    )
                } else if (isUserSelected && isCorrectOption == false) {
                    Icon(
                        imageVector = Icons.Outlined.Close,
                        contentDescription = "Incorrect",
                        tint = Color.White,
                        modifier = Modifier.size(18.dp)
                    )
                } else {
                    Text(
                        text = optionLetter,
                        color = badgeTextColor,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                }
            }

            Spacer(modifier = Modifier.width(12.dp))

            Text(
                text = optionText,
                color = textColor,
                fontSize = 15.sp,
                fontWeight = if (isSelected || isCorrectOption == true) FontWeight.Medium else FontWeight.Normal,
                lineHeight = 20.sp,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun ExplanationBox(
    question: ForensicQuestion,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF191F2B)
        ),
        border = BorderStroke(1.dp, ImmersiveBorder)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Clinical Pearl Callout
            Surface(
                color = ForensicsAmber.copy(alpha = 0.12f),
                shape = RoundedCornerShape(12.dp),
                border = BorderStroke(1.dp, ForensicsAmber.copy(alpha = 0.4f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(12.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Lightbulb,
                        contentDescription = "Key Pearl",
                        tint = ForensicsAmber,
                        modifier = Modifier.size(20.dp)
                    )
                    Column {
                        Text(
                            text = "High-Yield Forensic Pearl",
                            fontWeight = FontWeight.Bold,
                            fontSize = 12.sp,
                            color = ForensicsAmber
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = question.clinicalPearl,
                            fontSize = 13.sp,
                            lineHeight = 18.sp,
                            fontWeight = FontWeight.Medium,
                            color = ImmersiveTextPrimary
                        )
                    }
                }
            }

            // Explanation Header
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.MenuBook,
                    contentDescription = "Explanation",
                    tint = ImmersiveCyan,
                    modifier = Modifier.size(18.dp)
                )
                Text(
                    text = "Detailed Explanation",
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    color = ImmersiveCyan
                )
            }

            Text(
                text = question.explanation,
                fontSize = 14.sp,
                lineHeight = 21.sp,
                color = ImmersiveTextSecondary
            )

            // Textbook Reference Tag
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = "Ref: ${question.reference}",
                    fontSize = 11.sp,
                    color = ImmersiveTextSecondary.copy(alpha = 0.7f),
                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                )
            }
        }
    }
}

@Composable
fun ScoreGauge(
    percentage: Int,
    correctCount: Int,
    totalCount: Int,
    modifier: Modifier = Modifier
) {
    val animatedProgress by animateFloatAsState(
        targetValue = percentage / 100f,
        animationSpec = tween(durationMillis = 1000),
        label = "score_gauge"
    )

    val gaugeColor = when {
        percentage >= 80 -> ImmersiveEmerald
        percentage >= 50 -> ImmersiveAmber
        else -> ImmersiveCoral
    }

    Box(
        modifier = modifier.size(160.dp),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            progress = { 1f },
            modifier = Modifier.size(160.dp),
            color = Color(0xFF1E2634),
            strokeWidth = 12.dp,
            trackColor = Color(0xFF1E2634),
        )
        CircularProgressIndicator(
            progress = { animatedProgress },
            modifier = Modifier.size(160.dp),
            color = gaugeColor,
            strokeWidth = 12.dp,
            trackColor = Color.Transparent,
            strokeCap = ProgressIndicatorDefaults.CircularDeterminateStrokeCap
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "$percentage%",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 32.sp,
                color = ImmersiveTextPrimary
            )
            Text(
                text = "$correctCount / $totalCount Correct",
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                color = ImmersiveTextSecondary
            )
        }
    }
}
