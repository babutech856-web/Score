package com.example

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.example.data.datasource.ForensicQuestionBank
import com.example.data.model.ForensicCategory
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class ExampleRobolectricTest {

  @Test
  fun `read string from context`() {
    val context = ApplicationProvider.getApplicationContext<Context>()
    val appName = context.getString(R.string.app_name)
    assertEquals("Forensic Medicine Quiz", appName)
  }

  @Test
  fun `verify daily quiz question bank integrity`() {
    val dailyQuestions = ForensicQuestionBank.getDailyQuizQuestions("2026-08-30")
    assertEquals(5, dailyQuestions.size)
    assertTrue(ForensicQuestionBank.questions.isNotEmpty())
  }
}
