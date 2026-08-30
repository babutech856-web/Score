package com.example.ui.screens

import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.CheckCircleOutline
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.ContentPaste
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.FileOpen
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.UploadFile
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.PrimaryTabRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.ForensicQuestion
import com.example.data.model.QuizMode
import com.example.data.parser.ParseResult
import com.example.data.parser.QuestionDocParser
import com.example.ui.viewmodel.ForensicQuizViewModel
import kotlinx.coroutines.launch

enum class UpdateScreenTab(val title: String) {
    UPLOAD_DOC("Upload & Paste"),
    SAMPLE_FORMAT("Sample Guide"),
    MANAGE_CUSTOM("My Questions")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UpdateQuestionsScreen(
    viewModel: ForensicQuizViewModel,
    onNavigateBack: () -> Unit,
    onStartQuiz: () -> Unit
) {
    val context = LocalContext.current
    val clipboardManager = LocalClipboardManager.current
    val scope = rememberCoroutineScope()

    var selectedTab by remember { mutableStateOf(UpdateScreenTab.UPLOAD_DOC) }
    var rawInputText by remember { mutableStateOf("") }
    var parseResult by remember { mutableStateOf<ParseResult?>(null) }
    var isImporting by remember { mutableStateOf(false) }

    val customQuestions by viewModel.customQuestions.collectAsState()

    // File picker launcher for docs, text, json, csv
    val fileLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri ->
        if (uri != null) {
            try {
                val parsed = viewModel.parseFromUri(context, uri)
                parseResult = parsed
                if (parsed.questions.isNotEmpty()) {
                    Toast.makeText(context, "Parsed ${parsed.questions.size} questions successfully!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "No valid questions found in file.", Toast.LENGTH_LONG).show()
                }
            } catch (e: Exception) {
                Toast.makeText(context, "Error reading file: ${e.localizedMessage}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = "Add / Update Questions",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Import docs, text, JSON, or CSV format",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                },
                navigationIcon = {
                    IconButton(
                        onClick = onNavigateBack,
                        modifier = Modifier.testTag("back_button")
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            PrimaryTabRow(
                selectedTabIndex = selectedTab.ordinal,
                containerColor = MaterialTheme.colorScheme.surface
            ) {
                UpdateScreenTab.values().forEach { tab ->
                    Tab(
                        selected = selectedTab == tab,
                        onClick = { selectedTab = tab },
                        text = {
                            Text(
                                text = if (tab == UpdateScreenTab.MANAGE_CUSTOM && customQuestions.isNotEmpty()) {
                                    "${tab.title} (${customQuestions.size})"
                                } else {
                                    tab.title
                                },
                                fontWeight = if (selectedTab == tab) FontWeight.Bold else FontWeight.Normal,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    )
                }
            }

            when (selectedTab) {
                UpdateScreenTab.UPLOAD_DOC -> {
                    UploadAndPasteTab(
                        rawText = rawInputText,
                        onTextChange = {
                            rawInputText = it
                            if (it.isBlank()) parseResult = null
                        },
                        onPickFile = {
                            fileLauncher.launch("*/*")
                        },
                        onPasteClipboard = {
                            val clip = clipboardManager.getText()?.text
                            if (!clip.isNullOrBlank()) {
                                rawInputText = clip
                                val parsed = viewModel.parseRawText(clip)
                                parseResult = parsed
                                Toast.makeText(context, "Pasted & parsed ${parsed.questions.size} questions", Toast.LENGTH_SHORT).show()
                            } else {
                                Toast.makeText(context, "Clipboard is empty", Toast.LENGTH_SHORT).show()
                            }
                        },
                        onParseText = {
                            if (rawInputText.isNotBlank()) {
                                val parsed = viewModel.parseRawText(rawInputText)
                                parseResult = parsed
                                if (parsed.questions.isEmpty()) {
                                    Toast.makeText(context, "Could not identify questions. Check Sample Guide.", Toast.LENGTH_LONG).show()
                                }
                            }
                        },
                        onLoadSample = {
                            val sample = QuestionDocParser.getSampleTextFormat()
                            rawInputText = sample
                            val parsed = viewModel.parseRawText(sample)
                            parseResult = parsed
                            Toast.makeText(context, "Loaded sample questions", Toast.LENGTH_SHORT).show()
                        },
                        onClear = {
                            rawInputText = ""
                            parseResult = null
                        },
                        parseResult = parseResult,
                        isImporting = isImporting,
                        onSaveQuestions = {
                            parseResult?.questions?.let { questions ->
                                isImporting = true
                                viewModel.saveParsedQuestions(questions) { count ->
                                    isImporting = false
                                    Toast.makeText(context, "Successfully added $count questions to your bank!", Toast.LENGTH_LONG).show()
                                    rawInputText = ""
                                    parseResult = null
                                    selectedTab = UpdateScreenTab.MANAGE_CUSTOM
                                }
                            }
                        },
                        onViewSampleTab = {
                            selectedTab = UpdateScreenTab.SAMPLE_FORMAT
                        }
                    )
                }

                UpdateScreenTab.SAMPLE_FORMAT -> {
                    SampleGuideTab(
                        onCopySample = { sample ->
                            clipboardManager.setText(AnnotatedString(sample))
                            Toast.makeText(context, "Sample copied to clipboard!", Toast.LENGTH_SHORT).show()
                        },
                        onLoadSampleIntoEditor = { sample ->
                            rawInputText = sample
                            val parsed = viewModel.parseRawText(sample)
                            parseResult = parsed
                            selectedTab = UpdateScreenTab.UPLOAD_DOC
                            Toast.makeText(context, "Sample loaded into editor!", Toast.LENGTH_SHORT).show()
                        }
                    )
                }

                UpdateScreenTab.MANAGE_CUSTOM -> {
                    ManageCustomQuestionsTab(
                        viewModel = viewModel,
                        onStartCustomQuiz = {
                            viewModel.startCustomQuestionsQuiz(QuizMode.PRACTICE)
                            onStartQuiz()
                        },
                        onAddNew = {
                            selectedTab = UpdateScreenTab.UPLOAD_DOC
                        }
                    )
                }
            }
        }
    }
}

@Composable
private fun UploadAndPasteTab(
    rawText: String,
    onTextChange: (String) -> Unit,
    onPickFile: () -> Unit,
    onPasteClipboard: () -> Unit,
    onParseText: () -> Unit,
    onLoadSample: () -> Unit,
    onClear: () -> Unit,
    parseResult: ParseResult?,
    isImporting: Boolean,
    onSaveQuestions: () -> Unit,
    onViewSampleTab: () -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Upload Action Card
        item {
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.5f)
                ),
                shape = RoundedCornerShape(16.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(MaterialTheme.colorScheme.primary),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.UploadFile,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.onPrimary
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "Upload Questions Document",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Select .docx, .doc, .txt, .json, or .csv file",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Button(
                            onClick = onPickFile,
                            modifier = Modifier
                                .weight(1f)
                                .testTag("pick_file_button"),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Icon(Icons.Default.FileOpen, contentDescription = null, modifier = Modifier.size(18.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Select File")
                        }

                        OutlinedButton(
                            onClick = onViewSampleTab,
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Icon(Icons.Default.HelpOutline, contentDescription = null, modifier = Modifier.size(18.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("View Sample")
                        }
                    }
                }
            }
        }

        // Paste or Write Text Box
        item {
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f))
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Or Paste Questions Directly",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold
                        )

                        Row {
                            IconButton(onClick = onPasteClipboard) {
                                Icon(Icons.Default.ContentPaste, contentDescription = "Paste Clipboard")
                            }
                            if (rawText.isNotBlank()) {
                                IconButton(onClick = onClear) {
                                    Icon(Icons.Default.Clear, contentDescription = "Clear")
                                }
                            }
                        }
                    }

                    OutlinedTextField(
                        value = rawText,
                        onValueChange = onTextChange,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .testTag("questions_text_input"),
                        placeholder = {
                            Text(
                                "Category: Toxicology\nQuestion: What is the antidote for paracetamol?\nA) Atropine\nB) N-acetylcysteine\nAnswer: B\nExplanation: Replenishes glutathione.\n---",
                                style = MaterialTheme.typography.bodySmall,
                                fontFamily = FontFamily.Monospace,
                                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f)
                            )
                        },
                        textStyle = MaterialTheme.typography.bodySmall.copy(fontFamily = FontFamily.Monospace),
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = MaterialTheme.colorScheme.primary,
                            unfocusedBorderColor = MaterialTheme.colorScheme.outlineVariant
                        )
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Button(
                            onClick = onParseText,
                            enabled = rawText.isNotBlank(),
                            modifier = Modifier
                                .weight(1f)
                                .testTag("parse_text_button"),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Icon(Icons.Default.CheckCircleOutline, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(6.dp))
                            Text("Parse & Preview")
                        }

                        OutlinedButton(
                            onClick = onLoadSample,
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Text("Load Sample", style = MaterialTheme.typography.labelMedium)
                        }
                    }
                }
            }
        }

        // Parse Results & Verification
        if (parseResult != null) {
            val result = parseResult
            item {
                Card(
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = if (result.questions.isNotEmpty()) {
                            MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.5f)
                        } else {
                            MaterialTheme.colorScheme.errorContainer.copy(alpha = 0.5f)
                        }
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = if (result.questions.isNotEmpty()) Icons.Default.CheckCircle else Icons.Default.Warning,
                                    contentDescription = null,
                                    tint = if (result.questions.isNotEmpty()) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.error
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = if (result.questions.isNotEmpty()) {
                                        "Found ${result.questions.size} Valid Questions"
                                    } else {
                                        "Parsing Failed"
                                    },
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            if (result.questions.isNotEmpty()) {
                                Button(
                                    onClick = onSaveQuestions,
                                    enabled = !isImporting,
                                    modifier = Modifier.testTag("save_questions_button"),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = MaterialTheme.colorScheme.primary
                                    ),
                                    shape = RoundedCornerShape(10.dp)
                                ) {
                                    Icon(Icons.Default.Add, contentDescription = null, modifier = Modifier.size(16.dp))
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text(if (isImporting) "Saving..." else "Add to Bank")
                                }
                            }
                        }

                        // Category breakdown chips
                        if (result.categoryCounts.isNotEmpty()) {
                            Spacer(modifier = Modifier.height(10.dp))
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .horizontalScroll(rememberScrollState()),
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                result.categoryCounts.forEach { (cat, count) ->
                                    Box(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(8.dp))
                                            .background(cat.accentColor.copy(alpha = 0.2f))
                                            .padding(horizontal = 8.dp, vertical = 4.dp)
                                    ) {
                                        Text(
                                            text = "${cat.shortName}: $count",
                                            style = MaterialTheme.typography.labelSmall,
                                            fontWeight = FontWeight.Bold,
                                            color = cat.accentColor
                                        )
                                    }
                                }
                            }
                        }

                        // Display Errors if any
                        if (result.errors.isNotEmpty()) {
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Warnings (${result.errors.size}):",
                                style = MaterialTheme.typography.labelMedium,
                                color = MaterialTheme.colorScheme.error,
                                fontWeight = FontWeight.Bold
                            )
                            result.errors.take(3).forEach { err ->
                                Text(
                                    text = "• $err",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.error
                                )
                            }
                        }
                    }
                }
            }

            // Preview Parsed Questions
            if (result.questions.isNotEmpty()) {
                item {
                    Text(
                        text = "Previewing Parsed Questions:",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                }

                itemsIndexed(result.questions) { index, q ->
                    ParsedQuestionPreviewCard(index = index + 1, question = q)
                }
            }
        }
    }
}

@Composable
private fun ParsedQuestionPreviewCard(index: Int, question: ForensicQuestion) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f), RoundedCornerShape(12.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(6.dp))
                        .background(question.category.accentColor.copy(alpha = 0.15f))
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text(
                        text = question.category.shortName,
                        style = MaterialTheme.typography.labelSmall,
                        color = question.category.accentColor,
                        fontWeight = FontWeight.Bold
                    )
                }

                Text(
                    text = "Q$index",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = question.question,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Options
            question.options.forEachIndexed { optIdx, optText ->
                val isCorrect = optIdx == question.correctOptionIndex
                val label = ('A' + optIdx).toString()
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 2.dp)
                        .clip(RoundedCornerShape(6.dp))
                        .background(
                            if (isCorrect) MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.4f)
                            else Color.Transparent
                        )
                        .padding(horizontal = 6.dp, vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "$label) ",
                        fontWeight = FontWeight.Bold,
                        color = if (isCorrect) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        text = optText,
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = if (isCorrect) FontWeight.Bold else FontWeight.Normal,
                        color = if (isCorrect) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface
                    )
                    if (isCorrect) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = "✓ Correct",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            if (question.explanation.isNotBlank()) {
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Explanation: ${question.explanation}",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

@Composable
private fun SampleGuideTab(
    onCopySample: (String) -> Unit,
    onLoadSampleIntoEditor: (String) -> Unit
) {
    var sampleFormatIndex by remember { mutableIntStateOf(0) }
    val formats = listOf("Docs / Text", "JSON", "CSV")

    val currentSampleCode = when (sampleFormatIndex) {
        0 -> QuestionDocParser.getSampleTextFormat()
        1 -> QuestionDocParser.getSampleJsonFormat()
        else -> QuestionDocParser.getSampleCsvFormat()
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "How to Format Questions in Docs / Files",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = "You can write or save questions in any Word document, Google Doc, Notepad (.txt), JSON, or Excel (.csv). The app automatically parses questions, choices A/B/C/D, answers, explanations, and pearls.",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }

        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                formats.forEachIndexed { idx, label ->
                    FilterChip(
                        selected = sampleFormatIndex == idx,
                        onClick = { sampleFormatIndex = idx },
                        label = { Text(label) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = MaterialTheme.colorScheme.primary,
                            selectedLabelColor = MaterialTheme.colorScheme.onPrimary
                        )
                    )
                }
            }
        }

        item {
            Card(
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "${formats[sampleFormatIndex]} Template",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold
                        )

                        Row {
                            IconButton(onClick = { onCopySample(currentSampleCode) }) {
                                Icon(Icons.Default.ContentCopy, contentDescription = "Copy Sample")
                            }
                            Button(
                                onClick = { onLoadSampleIntoEditor(currentSampleCode) },
                                shape = RoundedCornerShape(8.dp),
                                contentPadding = ButtonDefaults.TextButtonContentPadding
                            ) {
                                Text("Load in Editor", style = MaterialTheme.typography.labelSmall)
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(10.dp))
                            .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f))
                            .padding(12.dp)
                    ) {
                        Text(
                            text = currentSampleCode,
                            fontFamily = FontFamily.Monospace,
                            style = MaterialTheme.typography.bodySmall,
                            lineHeight = 18.sp
                        )
                    }
                }
            }
        }

        item {
            Card(
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.3f))
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Supported Categories:",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "• Thanatology (Postmortem changes, Rigor, Livor, Algor mortis, PMI)\n" +
                               "• Traumatology (Wounds, Mechanical injuries, Fractures)\n" +
                               "• Ballistics (Firearms, Bullet wounds, Stippling, Rifling)\n" +
                               "• Asphyxia (Hanging, Strangulation, Drowning, Diatoms)\n" +
                               "• Toxicology (Poisons, Snake venom, OP poisoning, Antidotes)\n" +
                               "• Identification (Fingerprints, Gustafson dental aging, Bones)\n" +
                               "• Jurisprudence (Inquests, Dying declaration, Bolam test, POCSO)\n" +
                               "• Autopsy Cases (Case vignettes, Clinical forensic scenarios)",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        lineHeight = 20.sp
                    )
                }
            }
        }
    }
}

@Composable
private fun ManageCustomQuestionsTab(
    viewModel: ForensicQuizViewModel,
    onStartCustomQuiz: () -> Unit,
    onAddNew: () -> Unit
) {
    val customQuestions by viewModel.customQuestions.collectAsState()
    val context = LocalContext.current

    if (customQuestions.isEmpty()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Description,
                    contentDescription = null,
                    modifier = Modifier.size(64.dp),
                    tint = MaterialTheme.colorScheme.primary.copy(alpha = 0.6f)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "No Custom Questions Added Yet",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Upload a Word document, JSON file, or paste text to build your own personal forensic question collection.",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = onAddNew,
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Icon(Icons.Default.Add, contentDescription = null, modifier = Modifier.size(18.dp))
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Add Questions Now")
                }
            }
        }
    } else {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            item {
                Card(
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.5f))
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(
                                text = "My Question Collection",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "${customQuestions.size} Custom Questions Saved",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }

                        Button(
                            onClick = onStartCustomQuiz,
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Icon(Icons.Default.PlayArrow, contentDescription = null, modifier = Modifier.size(18.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Practice (${customQuestions.size})")
                        }
                    }
                }
            }

            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Imported Questions List",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold
                    )

                    OutlinedButton(
                        onClick = {
                            viewModel.deleteAllCustomQuestions()
                            Toast.makeText(context, "Deleted all custom questions", Toast.LENGTH_SHORT).show()
                        },
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = MaterialTheme.colorScheme.error)
                    ) {
                        Icon(Icons.Default.Delete, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("Delete All", style = MaterialTheme.typography.labelSmall)
                    }
                }
            }

            items(customQuestions, key = { it.id }) { item ->
                val q = item.toForensicQuestion()
                Card(
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f), RoundedCornerShape(12.dp))
                ) {
                    Column(modifier = Modifier.padding(14.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(q.category.accentColor.copy(alpha = 0.15f))
                                    .padding(horizontal = 6.dp, vertical = 2.dp)
                            ) {
                                Text(
                                    text = q.category.shortName,
                                    style = MaterialTheme.typography.labelSmall,
                                    color = q.category.accentColor,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            IconButton(
                                onClick = {
                                    viewModel.deleteCustomQuestion(item.id)
                                    Toast.makeText(context, "Question removed", Toast.LENGTH_SHORT).show()
                                }
                            ) {
                                Icon(
                                    Icons.Default.Delete,
                                    contentDescription = "Delete",
                                    tint = MaterialTheme.colorScheme.error.copy(alpha = 0.7f),
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(6.dp))

                        Text(
                            text = q.question,
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.SemiBold
                        )

                        Spacer(modifier = Modifier.height(6.dp))

                        val correctOpt = q.options.getOrNull(q.correctOptionIndex) ?: ""
                        Text(
                            text = "Correct: $correctOpt",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}
