package com.example.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccessTime
import androidx.compose.material.icons.outlined.Air
import androidx.compose.material.icons.outlined.Fingerprint
import androidx.compose.material.icons.outlined.Gavel
import androidx.compose.material.icons.outlined.Healing
import androidx.compose.material.icons.outlined.MedicalServices
import androidx.compose.material.icons.outlined.MyLocation
import androidx.compose.material.icons.outlined.Science
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

enum class ForensicCategory(
    val title: String,
    val shortName: String,
    val description: String,
    val icon: ImageVector,
    val accentColor: Color
) {
    THANATOLOGY(
        title = "Thanatology & Postmortem Interval",
        shortName = "Thanatology",
        description = "Algor, Rigor & Livor mortis, putrefaction, adipocere, PMI estimation",
        icon = Icons.Outlined.AccessTime,
        accentColor = Color(0xFF6366F1)
    ),
    TRAUMATOLOGY(
        title = "Traumatology & Mechanical Injuries",
        shortName = "Traumatology",
        description = "Abrasions, contusions, lacerations, incised, stab & defense wounds",
        icon = Icons.Outlined.Healing,
        accentColor = Color(0xFFEC4899)
    ),
    BALLISTICS(
        title = "Forensic Ballistics & Firearms",
        shortName = "Ballistics",
        description = "Entrance/exit wounds, tattooing, stippling, firearm mechanisms",
        icon = Icons.Outlined.MyLocation,
        accentColor = Color(0xFFF97316)
    ),
    ASPHYXIA(
        title = "Asphyxial Deaths & Hypoxia",
        shortName = "Asphyxia",
        description = "Hanging, strangulation, throttling, drowning, diatom analysis",
        icon = Icons.Outlined.Air,
        accentColor = Color(0xFF06B6D4)
    ),
    TOXICOLOGY(
        title = "Forensic Toxicology & Poisons",
        shortName = "Toxicology",
        description = "Heavy metals, OP poisoning, snake venom, plant poisons, antidotes",
        icon = Icons.Outlined.Science,
        accentColor = Color(0xFF10B981)
    ),
    IDENTIFICATION(
        title = "Personal Identification & Anthropology",
        shortName = "Identification",
        description = "Dactylography, Gustafson dental aging, skull sutures, cheiloscopy",
        icon = Icons.Outlined.Fingerprint,
        accentColor = Color(0xFF8B5CF6)
    ),
    JURISPRUDENCE(
        title = "Medical Jurisprudence & Legal Procedure",
        shortName = "Jurisprudence",
        description = "Inquests, dying declaration, consent, Bolam test, medical negligence",
        icon = Icons.Outlined.Gavel,
        accentColor = Color(0xFFEAB308)
    ),
    AUTOPSY_CASES(
        title = "Autopsy & Clinical Vignettes",
        shortName = "Case Vignettes",
        description = "Complex case scenarios and forensic deductive pathology questions",
        icon = Icons.Outlined.MedicalServices,
        accentColor = Color(0xFF14B8A6)
    )
}

enum class Difficulty(val label: String, val badgeColor: Color) {
    STANDARD("Standard", Color(0xFF10B981)),
    ADVANCED("Advanced", Color(0xFFF59E0B)),
    VIGNETTE("Case Vignette", Color(0xFF8B5CF6))
}

data class ForensicQuestion(
    val id: String,
    val category: ForensicCategory,
    val question: String,
    val options: List<String>,
    val correctOptionIndex: Int,
    val explanation: String,
    val clinicalPearl: String,
    val difficulty: Difficulty = Difficulty.STANDARD,
    val reference: String = "Forensic Medicine & Toxicology Reference"
)

data class ForensicFlashcard(
    val id: String,
    val category: ForensicCategory,
    val title: String,
    val summary: String,
    val keyPoints: List<String>,
    val mnemonicsOrPearl: String
)

data class DailyStreakInfo(
    val currentStreak: Int = 0,
    val maxStreak: Int = 0,
    val isCompletedToday: Boolean = false,
    val lastCompletedDate: String = "",
    val totalCompletedQuizzes: Int = 0
)

enum class QuizMode {
    PRACTICE, // Instant explanation reveal on selection
    EXAM      // Submit all at end
}
