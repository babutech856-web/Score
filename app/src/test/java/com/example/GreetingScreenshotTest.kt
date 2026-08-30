package com.example

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import com.example.ui.screens.DailyHomeScreen
import com.example.ui.theme.MyApplicationTheme
import com.example.ui.viewmodel.DailyHubUiState
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@Config(qualifiers = RobolectricDeviceQualifiers.Pixel8, sdk = [36])
class GreetingScreenshotTest {

  @get:Rule val composeTestRule = createComposeRule()

  @Test
  fun home_screen_renders() {
    composeTestRule.setContent {
      MyApplicationTheme {
        DailyHomeScreen(
          state = DailyHubUiState(
            todayFormatted = "Sunday, August 30",
            streak = 3,
            maxStreak = 5,
            isDailyCompletedToday = false
          ),
          onStartDailyQuiz = {},
          onStartRapidFire = {},
          onStartVignettes = {},
          onStartMistakes = {},
          onSelectCategory = {},
          onOpenFlashcards = {},
          onOpenBookmarks = {}
        )
      }
    }

    composeTestRule.onRoot().captureRoboImage(filePath = "src/test/screenshots/greeting.png")
  }
}
