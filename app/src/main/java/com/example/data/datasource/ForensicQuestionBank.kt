package com.example.data.datasource

import com.example.data.datasource.categories.AsphyxiaQuestions
import com.example.data.datasource.categories.AutopsyVignetteQuestions
import com.example.data.datasource.categories.BallisticsQuestions
import com.example.data.datasource.categories.IdentificationQuestions
import com.example.data.datasource.categories.JurisprudenceQuestions
import com.example.data.datasource.categories.ThanatologyQuestions
import com.example.data.datasource.categories.ToxicologyQuestions
import com.example.data.datasource.categories.TraumatologyQuestions
import com.example.data.model.Difficulty
import com.example.data.model.ForensicCategory
import com.example.data.model.ForensicQuestion

object ForensicQuestionBank {

    val staticQuestions: List<ForensicQuestion> = 
        ThanatologyQuestions.all +
        TraumatologyQuestions.all +
        BallisticsQuestions.all +
        AsphyxiaQuestions.all +
        ToxicologyQuestions.all +
        IdentificationQuestions.all +
        JurisprudenceQuestions.all +
        AutopsyVignetteQuestions.all

    val questions: List<ForensicQuestion>
        get() = staticQuestions

    // Select daily 5 questions deterministically based on date string (YYYY-MM-DD)
    fun getDailyQuizQuestions(dateString: String): List<ForensicQuestion> {
        val hash = dateString.hashCode().let { if (it < 0) -it else it }
        val shuffled = staticQuestions.sortedBy { (it.id + dateString).hashCode() }
        
        // Ensure diverse representation of categories in daily quiz
        val selected = mutableListOf<ForensicQuestion>()
        val categoriesSeen = mutableSetOf<ForensicCategory>()

        for (q in shuffled) {
            if (q.category !in categoriesSeen) {
                selected.add(q)
                categoriesSeen.add(q.category)
                if (selected.size == 5) break
            }
        }

        // Fill up to 5 if needed
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

    fun getQuestionsByCategory(category: ForensicCategory): List<ForensicQuestion> {
        return staticQuestions.filter { it.category == category }
    }

    fun getQuestionsByDifficulty(difficulty: Difficulty): List<ForensicQuestion> {
        return staticQuestions.filter { it.difficulty == difficulty }
    }
}
