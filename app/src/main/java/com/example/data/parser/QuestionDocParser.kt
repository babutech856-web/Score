package com.example.data.parser

import android.content.Context
import android.net.Uri
import com.example.data.model.Difficulty
import com.example.data.model.ForensicCategory
import com.example.data.model.ForensicQuestion
import org.json.JSONArray
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.util.UUID
import java.util.zip.ZipInputStream

data class ParseResult(
    val questions: List<ForensicQuestion>,
    val errors: List<String>,
    val rawCount: Int,
    val categoryCounts: Map<ForensicCategory, Int> = emptyMap()
)

object QuestionDocParser {

    /**
     * Reads text from an input Uri (supports plain text, .docx, .json, .csv)
     */
    fun readTextFromUri(context: Context, uri: Uri): String {
        val contentResolver = context.contentResolver
        val mimeType = contentResolver.getType(uri) ?: ""
        
        return try {
            contentResolver.openInputStream(uri)?.use { stream ->
                // Check if it's a DOCX file (ZIP archive containing word/document.xml)
                if (mimeType.contains("wordprocessingml") || uri.toString().endsWith(".docx", ignoreCase = true)) {
                    extractTextFromDocx(stream) ?: readPlainText(stream)
                } else {
                    readPlainText(stream)
                }
            } ?: ""
        } catch (e: Exception) {
            e.printStackTrace()
            ""
        }
    }

    private fun readPlainText(stream: InputStream): String {
        return BufferedReader(InputStreamReader(stream, Charsets.UTF_8)).use { it.readText() }
    }

    /**
     * Extract textual paragraphs from DOCX XML stream without external heavy libraries
     */
    private fun extractTextFromDocx(stream: InputStream): String? {
        return try {
            val zip = ZipInputStream(stream)
            var entry = zip.nextEntry
            var docxXml: String? = null
            while (entry != null) {
                if (entry.name == "word/document.xml") {
                    docxXml = BufferedReader(InputStreamReader(zip, Charsets.UTF_8)).readText()
                    break
                }
                entry = zip.nextEntry
            }
            docxXml?.let { xml ->
                // Strip XML tags, converting </w:p> to newlines
                val withNewlines = xml.replace("</w:p>", "\n").replace("</w:tr>", "\n")
                // Replace any XML tags <...> with empty string
                val cleanText = withNewlines.replace(Regex("<[^>]+>"), "")
                // Decode standard XML entities
                cleanText.replace("&amp;", "&")
                    .replace("&lt;", "<")
                    .replace("&gt;", ">")
                    .replace("&quot;", "\"")
                    .replace("&apos;", "'")
            }
        } catch (e: Exception) {
            null
        }
    }

    /**
     * Main parser entry point: Auto-detects whether the input is JSON, CSV, or Structured Text
     */
    fun parseDocument(rawContent: String): ParseResult {
        val trimmed = rawContent.trim()
        if (trimmed.isEmpty()) {
            return ParseResult(emptyList(), listOf("The provided document content is empty."), 0)
        }

        // 1. Try JSON Array
        if (trimmed.startsWith("[") && trimmed.endsWith("]")) {
            val jsonResult = tryParseJson(trimmed)
            if (jsonResult.questions.isNotEmpty()) return jsonResult
        }

        // 2. Try CSV if multiple commas and header line detected
        if (isLikelyCsv(trimmed)) {
            val csvResult = tryParseCsv(trimmed)
            if (csvResult.questions.isNotEmpty()) return csvResult
        }

        // 3. Fallback to Structured Question Text Parser (Docs / Word / Text format)
        return parseStructuredText(trimmed)
    }

    private fun isLikelyCsv(text: String): Boolean {
        val firstLine = text.lines().firstOrNull()?.trim() ?: ""
        return firstLine.contains(",") && (
            firstLine.contains("Question", ignoreCase = true) ||
            firstLine.contains("Option", ignoreCase = true) ||
            firstLine.contains("Category", ignoreCase = true)
        )
    }

    private fun tryParseJson(jsonString: String): ParseResult {
        val list = mutableListOf<ForensicQuestion>()
        val errors = mutableListOf<String>()

        try {
            val jsonArray = JSONArray(jsonString)
            for (i in 0 until jsonArray.length()) {
                try {
                    val obj = jsonArray.getJSONObject(i)
                    val qText = obj.optString("question", "").ifEmpty { obj.optString("q", "") }
                    if (qText.isBlank()) {
                        errors.add("Item #$i skipped: Missing 'question' text.")
                        continue
                    }

                    val options = mutableListOf<String>()
                    val optsArray = obj.optJSONArray("options")
                    if (optsArray != null) {
                        for (j in 0 until optsArray.length()) {
                            options.add(optsArray.getString(j))
                        }
                    } else {
                        // Check opt1, opt2...
                        listOf("optionA", "optionB", "optionC", "optionD", "optA", "optB", "optC", "optD").forEach { key ->
                            if (obj.has(key)) options.add(obj.getString(key))
                        }
                    }

                    if (options.size < 2) {
                        errors.add("Item #$i ($qText): Less than 2 options provided.")
                        continue
                    }

                    var correctIndex = obj.optInt("correctOptionIndex", -1)
                    if (correctIndex == -1) {
                        val ansStr = obj.optString("answer", "").ifEmpty { obj.optString("ans", "") }
                        correctIndex = parseAnswerIndex(ansStr, options)
                    }

                    val catStr = obj.optString("category", "AUTOPSY_CASES")
                    val category = matchCategory(catStr)

                    val diffStr = obj.optString("difficulty", "STANDARD")
                    val difficulty = matchDifficulty(diffStr)

                    val exp = obj.optString("explanation", "Verified clinical explanation.")
                    val pearl = obj.optString("clinicalPearl", obj.optString("pearl", "High-yield forensic pearl."))
                    val ref = obj.optString("reference", "Imported Question Bank")

                    val id = "imported_${System.currentTimeMillis()}_${UUID.randomUUID().toString().take(6)}"
                    list.add(
                        ForensicQuestion(
                            id = id,
                            category = category,
                            question = qText,
                            options = options,
                            correctOptionIndex = correctIndex.coerceIn(0, options.size - 1),
                            explanation = exp,
                            clinicalPearl = pearl,
                            difficulty = difficulty,
                            reference = ref
                        )
                    )
                } catch (e: Exception) {
                    errors.add("Item #$i parse error: ${e.localizedMessage}")
                }
            }
        } catch (e: Exception) {
            errors.add("JSON format error: ${e.localizedMessage}")
        }

        val catMap = list.groupingBy { it.category }.eachCount()
        return ParseResult(list, errors, list.size + errors.size, catMap)
    }

    private fun tryParseCsv(csvString: String): ParseResult {
        val list = mutableListOf<ForensicQuestion>()
        val errors = mutableListOf<String>()
        val lines = csvString.lines().filter { it.isNotBlank() }

        if (lines.isEmpty()) return ParseResult(emptyList(), listOf("Empty CSV"), 0)

        // Skip header if line 0 has keywords
        val startIndex = if (isLikelyCsv(lines[0])) 1 else 0

        for (i in startIndex until lines.size) {
            val line = lines[i]
            val tokens = parseCsvLine(line)
            if (tokens.size < 6) {
                errors.add("Line ${i + 1} skipped: Expected at least 6 columns (Category, Question, A, B, C, D, Answer, Exp).")
                continue
            }

            try {
                val catStr = tokens[0]
                val qText = tokens[1]
                val optA = tokens[2]
                val optB = tokens[3]
                val optC = tokens.getOrNull(4) ?: ""
                val optD = tokens.getOrNull(5) ?: ""
                val ansStr = tokens.getOrNull(6) ?: "A"
                val exp = tokens.getOrNull(7) ?: "Clinical explanation."
                val pearl = tokens.getOrNull(8) ?: "High-yield forensic takeaway."
                val ref = tokens.getOrNull(9) ?: "Imported CSV"

                val options = listOf(optA, optB, optC, optD).filter { it.isNotBlank() }
                if (options.size < 2) {
                    errors.add("Line ${i + 1}: At least 2 options required.")
                    continue
                }

                val correctIdx = parseAnswerIndex(ansStr, options)
                val cat = matchCategory(catStr)
                val id = "imported_${System.currentTimeMillis()}_${UUID.randomUUID().toString().take(6)}"

                list.add(
                    ForensicQuestion(
                        id = id,
                        category = cat,
                        question = qText,
                        options = options,
                        correctOptionIndex = correctIdx.coerceIn(0, options.size - 1),
                        explanation = exp,
                        clinicalPearl = pearl,
                        difficulty = Difficulty.STANDARD,
                        reference = ref
                    )
                )
            } catch (e: Exception) {
                errors.add("Line ${i + 1} parse error: ${e.localizedMessage}")
            }
        }

        val catMap = list.groupingBy { it.category }.eachCount()
        return ParseResult(list, errors, list.size + errors.size, catMap)
    }

    private fun parseCsvLine(line: String): List<String> {
        val tokens = mutableListOf<String>()
        val sb = StringBuilder()
        var inQuotes = false

        for (ch in line) {
            when {
                ch == '\"' -> inQuotes = !inQuotes
                ch == ',' && !inQuotes -> {
                    tokens.add(sb.toString().trim())
                    sb.setLength(0)
                }
                else -> sb.append(ch)
            }
        }
        tokens.add(sb.toString().trim())
        return tokens
    }

    /**
     * Parses human-written documents from Word / Docs / Notepad
     */
    private fun parseStructuredText(text: String): ParseResult {
        val list = mutableListOf<ForensicQuestion>()
        val errors = mutableListOf<String>()

        // Split text into individual question blocks using common dividers
        val rawBlocks = splitIntoQuestionBlocks(text)

        for ((index, blockText) in rawBlocks.withIndex()) {
            if (blockText.isBlank()) continue

            var category = ForensicCategory.AUTOPSY_CASES
            var difficulty = Difficulty.STANDARD
            var questionText = ""
            val options = mutableListOf<String>()
            var answerStr = ""
            var explanation = ""
            var clinicalPearl = ""
            var reference = "User Imported Question"

            var currentField: String? = null
            val fieldBuffers = mutableMapOf<String, StringBuilder>()

            fun appendToField(field: String, content: String) {
                val sb = fieldBuffers.getOrPut(field) { StringBuilder() }
                if (sb.isNotEmpty()) sb.append(" ")
                sb.append(content)
            }

            val lines = blockText.lines()
            for (rawLine in lines) {
                val line = rawLine.trim()
                if (line.isEmpty()) continue

                // Check for Category tag
                val catMatch = Regex("^(?:Category|Subject|Topic|Specialty)\\s*[:=-]\\s*(.*)$", RegexOption.IGNORE_CASE).find(line)
                if (catMatch != null) {
                    category = matchCategory(catMatch.groupValues[1].trim())
                    currentField = null
                    continue
                }

                // Check for Difficulty tag
                val diffMatch = Regex("^(?:Difficulty|Level)\\s*[:=-]\\s*(.*)$", RegexOption.IGNORE_CASE).find(line)
                if (diffMatch != null) {
                    difficulty = matchDifficulty(diffMatch.groupValues[1].trim())
                    currentField = null
                    continue
                }

                // Check for Question tag or Question start
                val qMatch = Regex("^(?:Question|Q|Q\\d+|\\d+)\\s*[:.)-]\\s*(.*)$", RegexOption.IGNORE_CASE).find(line)
                if (qMatch != null && questionText.isEmpty() && options.isEmpty()) {
                    currentField = "Q"
                    appendToField("Q", qMatch.groupValues[1].trim())
                    continue
                }

                // Check for Option pattern: A), B), C), D) or 1), 2), 3), 4)
                val optMatch = Regex("^(?:[A-Da-d]|[1-4])\\s*[:.)\\]-]\\s*(.*)$").find(line)
                if (optMatch != null && (currentField == "Q" || currentField?.startsWith("OPT_") == true || options.isNotEmpty())) {
                    val optText = optMatch.groupValues[1].trim()
                    options.add(optText)
                    currentField = "OPT_${options.size}"
                    continue
                }

                // Check for Answer tag
                val ansMatch = Regex("^(?:Answer|Ans|Correct|Correct Answer|Key)\\s*[:=-]\\s*(.*)$", RegexOption.IGNORE_CASE).find(line)
                if (ansMatch != null) {
                    answerStr = ansMatch.groupValues[1].trim()
                    currentField = "ANS"
                    continue
                }

                // Check for Explanation tag
                val expMatch = Regex("^(?:Explanation|Exp|Reason|Rationale)\\s*[:=-]\\s*(.*)$", RegexOption.IGNORE_CASE).find(line)
                if (expMatch != null) {
                    currentField = "EXP"
                    appendToField("EXP", expMatch.groupValues[1].trim())
                    continue
                }

                // Check for Clinical Pearl / Mnemonic tag
                val pearlMatch = Regex("^(?:Pearl|Clinical Pearl|Mnemonic|High-Yield|Takeaway|Key Point)\\s*[:=-]\\s*(.*)$", RegexOption.IGNORE_CASE).find(line)
                if (pearlMatch != null) {
                    currentField = "PEARL"
                    appendToField("PEARL", pearlMatch.groupValues[1].trim())
                    continue
                }

                // Check for Reference tag
                val refMatch = Regex("^(?:Reference|Ref|Source|Book)\\s*[:=-]\\s*(.*)$", RegexOption.IGNORE_CASE).find(line)
                if (refMatch != null) {
                    currentField = "REF"
                    appendToField("REF", refMatch.groupValues[1].trim())
                    continue
                }

                // Continuation lines
                when (currentField) {
                    "Q" -> appendToField("Q", line)
                    "EXP" -> appendToField("EXP", line)
                    "PEARL" -> appendToField("PEARL", line)
                    "REF" -> appendToField("REF", line)
                    else -> {
                        if (questionText.isEmpty() && options.isEmpty()) {
                            appendToField("Q", line)
                            currentField = "Q"
                        } else if (currentField?.startsWith("OPT_") == true && options.isNotEmpty()) {
                            // Append to last added option
                            val lastIdx = options.size - 1
                            options[lastIdx] = options[lastIdx] + " " + line
                        }
                    }
                }
            }

            questionText = fieldBuffers["Q"]?.toString()?.trim() ?: ""
            explanation = fieldBuffers["EXP"]?.toString()?.trim() ?: "Comprehensive clinical rationale."
            clinicalPearl = fieldBuffers["PEARL"]?.toString()?.trim() ?: "Essential forensic learning takeaway."
            reference = fieldBuffers["REF"]?.toString()?.trim() ?: "Imported Question Bank"

            if (questionText.isBlank()) {
                // If options found, maybe the first line was the question
                val firstNonEmpty = lines.firstOrNull { it.isNotBlank() } ?: ""
                if (firstNonEmpty.isNotBlank() && options.isNotEmpty()) {
                    questionText = firstNonEmpty
                } else {
                    errors.add("Question #${index + 1} skipped: Could not identify question prompt.")
                    continue
                }
            }

            if (options.size < 2) {
                errors.add("Question #${index + 1} ('${questionText.take(30)}...'): Found only ${options.size} options (Minimum 2 required: A, B, C, D).")
                continue
            }

            val correctIdx = parseAnswerIndex(answerStr, options)
            val id = "imported_${System.currentTimeMillis()}_${UUID.randomUUID().toString().take(6)}"

            list.add(
                ForensicQuestion(
                    id = id,
                    category = category,
                    question = questionText,
                    options = options,
                    correctOptionIndex = correctIdx.coerceIn(0, options.size - 1),
                    explanation = explanation,
                    clinicalPearl = clinicalPearl,
                    difficulty = difficulty,
                    reference = reference
                )
            )
        }

        val catMap = list.groupingBy { it.category }.eachCount()
        return ParseResult(list, errors, rawBlocks.size, catMap)
    }

    private fun splitIntoQuestionBlocks(text: String): List<String> {
        // Try splitting by explicit delimiters first (--- or === or ***)
        if (text.contains(Regex("\n\\s*[-=_*]{3,}\\s*\n"))) {
            return text.split(Regex("\n\\s*[-=_*]{3,}\\s*\n")).map { it.trim() }.filter { it.isNotBlank() }
        }

        // Otherwise split by double newlines or numbered patterns
        val blocks = mutableListOf<String>()
        val currentBlock = StringBuilder()
        val lines = text.lines()

        for (line in lines) {
            val isStartOfNewQuestion = Regex("^(?:Question|Q\\d+|\\d+)\\s*[:.)-]\\s*", RegexOption.IGNORE_CASE).containsMatchIn(line) ||
                    Regex("^Category\\s*[:=-]", RegexOption.IGNORE_CASE).containsMatchIn(line)

            if (isStartOfNewQuestion && currentBlock.isNotBlank() && currentBlock.contains(Regex("^(?:Answer|Ans|Correct)\\s*[:=-]", setOf(RegexOption.MULTILINE, RegexOption.IGNORE_CASE)))) {
                blocks.add(currentBlock.toString().trim())
                currentBlock.setLength(0)
            }

            currentBlock.appendLine(line)
        }

        if (currentBlock.isNotBlank()) {
            blocks.add(currentBlock.toString().trim())
        }

        return if (blocks.size > 1) blocks else text.split(Regex("\n\\s*\n\\s*\n")).map { it.trim() }.filter { it.isNotBlank() }
    }

    fun matchCategory(text: String): ForensicCategory {
        val lower = text.lowercase()
        return when {
            lower.contains("thanato") || lower.contains("postmortem") || lower.contains("rigor") || lower.contains("livor") || lower.contains("algor") || lower.contains("pmi") -> ForensicCategory.THANATOLOGY
            lower.contains("trauma") || lower.contains("injury") || lower.contains("wound") || lower.contains("fracture") || lower.contains("laceration") || lower.contains("contusion") || lower.contains("bruise") -> ForensicCategory.TRAUMATOLOGY
            lower.contains("ballistic") || lower.contains("firearm") || lower.contains("bullet") || lower.contains("gunshot") || lower.contains("shotgun") || lower.contains("rifling") -> ForensicCategory.BALLISTICS
            lower.contains("asphyx") || lower.contains("hanging") || lower.contains("strangulation") || lower.contains("drowning") || lower.contains("smother") || lower.contains("choking") -> ForensicCategory.ASPHYXIA
            lower.contains("toxic") || lower.contains("poison") || lower.contains("antidote") || lower.contains("venom") || lower.contains("snake") || lower.contains("metal") || lower.contains("overdose") -> ForensicCategory.TOXICOLOGY
            lower.contains("ident") || lower.contains("anthropology") || lower.contains("fingerprint") || lower.contains("dactyl") || lower.contains("dental") || lower.contains("gustafson") || lower.contains("dna") -> ForensicCategory.IDENTIFICATION
            lower.contains("juris") || lower.contains("legal") || lower.contains("law") || lower.contains("court") || lower.contains("inquest") || lower.contains("bolam") || lower.contains("negligence") || lower.contains("pocso") || lower.contains("ethics") -> ForensicCategory.JURISPRUDENCE
            else -> ForensicCategory.AUTOPSY_CASES
        }
    }

    private fun matchDifficulty(text: String): Difficulty {
        val lower = text.lowercase()
        return when {
            lower.contains("vignette") || lower.contains("case") || lower.contains("clinical") -> Difficulty.VIGNETTE
            lower.contains("adv") || lower.contains("hard") || lower.contains("difficult") -> Difficulty.ADVANCED
            else -> Difficulty.STANDARD
        }
    }

    private fun parseAnswerIndex(answerStr: String, options: List<String>): Int {
        val trimmed = answerStr.trim().uppercase()
        if (trimmed.isEmpty()) return 0

        // Check if answer is letter A, B, C, D
        if (trimmed.startsWith("A") || trimmed.contains("OPTION A") || trimmed == "A") return 0
        if (trimmed.startsWith("B") || trimmed.contains("OPTION B") || trimmed == "B") return 1
        if (trimmed.startsWith("C") || trimmed.contains("OPTION C") || trimmed == "C") return 2
        if (trimmed.startsWith("D") || trimmed.contains("OPTION D") || trimmed == "D") return 3

        // Check if answer is number 1, 2, 3, 4
        if (trimmed.startsWith("1")) return 0
        if (trimmed.startsWith("2")) return 1
        if (trimmed.startsWith("3")) return 2
        if (trimmed.startsWith("4")) return 3

        // Check if answer string matches the text of any option
        for (i in options.indices) {
            if (options[i].equals(answerStr.trim(), ignoreCase = true) || 
                options[i].contains(answerStr.trim(), ignoreCase = true)) {
                return i
            }
        }

        return 0
    }

    // ==================== SAMPLE TEMPLATES GENERATOR ====================

    fun getSampleTextFormat(): String {
        return """
Category: Toxicology
Difficulty: Standard
Question: What is the specific antidote for acute paracetamol (acetaminophen) poisoning?
A) Atropine sulfate
B) N-acetylcysteine (NAC)
C) Pralidoxime (2-PAM)
D) Naloxone
Answer: B
Explanation: N-acetylcysteine replenishes hepatic glutathione stores and binds directly to the toxic metabolite NAPQI, preventing liver necrosis.
Pearl: NAC is most effective when administered within 8 hours of paracetamol ingestion.
Reference: Parikh's Textbook of Medical Jurisprudence & Toxicology

---

Category: Thanatology
Difficulty: Standard
Question: According to Nysten's law, in which group of muscles does rigor mortis first become clinically noticeable?
A) Lower limbs and calf muscles
B) Small muscles of the eyelids, face, and jaw
C) Abdominal rectus muscles
D) Upper limbs and forearms
Answer: B
Explanation: Nysten's law describes the cranial-to-caudal progression of rigor mortis starting in the eyelids and lower jaw.
Pearl: Disappearance of rigor follows the exact same cranial-to-caudal sequence.
Reference: Reddy's Essentials of Forensic Medicine

---

Category: Traumatology
Difficulty: Advanced
Question: Which key pathological finding definitively distinguishes a blunt laceration from a sharp incised wound?
A) Length exceeding wound depth
B) Tissue bridging (intact blood vessels and nerves across the wound base)
C) Everted, non-abraded skin margins
D) Complete absence of marginal bruising
Answer: B
Explanation: Lacerations are caused by crushing/tearing and characteristically show tissue bridges crossing the floor.
Pearl: Tissue bridging is the cardinal diagnostic sign of a blunt force laceration.
Reference: Knight's Forensic Pathology
""".trimIndent()
    }

    fun getSampleJsonFormat(): String {
        return """
[
  {
    "category": "TOXICOLOGY",
    "difficulty": "STANDARD",
    "question": "What is the specific antidote for acute paracetamol (acetaminophen) poisoning?",
    "options": [
      "Atropine sulfate",
      "N-acetylcysteine (NAC)",
      "Pralidoxime (2-PAM)",
      "Naloxone"
    ],
    "correctOptionIndex": 1,
    "explanation": "N-acetylcysteine replenishes intracellular hepatic glutathione stores.",
    "clinicalPearl": "Most effective within 8 hours of ingestion.",
    "reference": "Parikh's Medical Jurisprudence"
  },
  {
    "category": "ASPHYXIA",
    "difficulty": "STANDARD",
    "question": "Paltauf's hemorrhages observed at postmortem examination are characteristic of:",
    "options": [
      "Subpleural hemorrhages in antemortem drowning",
      "Manual strangulation",
      "Judicial hanging",
      "Smothering with a soft pillow"
    ],
    "correctOptionIndex": 0,
    "explanation": "Paltauf's spots are subpleural ecchymoses produced by alveolar tearing in drowning.",
    "clinicalPearl": "Found in emphysema aquosum (hyperinflated wet lungs).",
    "reference": "Reddy's Essentials of Forensic Medicine"
  }
]
""".trimIndent()
    }

    fun getSampleCsvFormat(): String {
        return """
Category,Question,Option A,Option B,Option C,Option D,Answer,Explanation,Pearl,Reference
Toxicology,Specific antidote for acute paracetamol overdose?,Atropine,N-acetylcysteine,Pralidoxime,Naloxone,B,Replenishes glutathione stores,Most effective within 8 hrs,Parikh's Toxicology
Ballistics,Soot and smudging around bullet hole indicates?,Hard contact,Close range firing (~30 cm),Distant range (> 100 m),Ricochet,B,Soot travels up to 30-45 cm,Soot wipes off easily,Knight's Pathology
""".trimIndent()
    }
}
