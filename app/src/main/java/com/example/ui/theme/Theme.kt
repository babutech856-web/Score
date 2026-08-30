package com.example.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val ImmersiveDarkColorScheme = darkColorScheme(
    primary = ImmersiveCyan,
    onPrimary = ImmersiveOnPrimary,
    primaryContainer = ImmersivePrimaryContainer,
    onPrimaryContainer = ImmersiveIceBlue,
    secondary = ImmersiveAccent,
    onSecondary = ImmersiveOnPrimary,
    secondaryContainer = Color(0xFF1E2838),
    onSecondaryContainer = ImmersiveIceBlue,
    tertiary = ImmersiveAmber,
    onTertiary = Color.Black,
    tertiaryContainer = ImmersiveAmberContainer,
    onTertiaryContainer = Color(0xFFFDE68A),
    background = ImmersiveBg,
    onBackground = ImmersiveTextPrimary,
    surface = ImmersiveSurface,
    onSurface = ImmersiveTextPrimary,
    surfaceVariant = ImmersiveCardBg,
    onSurfaceVariant = ImmersiveTextSecondary,
    outline = ImmersiveBorder,
    outlineVariant = Color(0xFF1E2430),
    error = ImmersiveCoral,
    onError = Color.White,
    errorContainer = ImmersiveCoralContainer,
    onErrorContainer = Color(0xFFFECACA)
)

private val ImmersiveLightColorScheme = lightColorScheme(
    primary = Color(0xFF0284C7),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFE0F2FE),
    onPrimaryContainer = Color(0xFF0369A1),
    secondary = Color(0xFF2563EB),
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFDBEAFE),
    onSecondaryContainer = Color(0xFF1E40AF),
    tertiary = Color(0xFFD97706),
    onTertiary = Color.White,
    tertiaryContainer = Color(0xFFFEF3C7),
    onTertiaryContainer = Color(0xFF92400E),
    background = Color(0xFF0F1115), // Unified immersive dark aesthetic
    onBackground = ImmersiveTextPrimary,
    surface = ImmersiveSurface,
    onSurface = ImmersiveTextPrimary,
    surfaceVariant = ImmersiveCardBg,
    onSurfaceVariant = ImmersiveTextSecondary,
    outline = ImmersiveBorder,
    outlineVariant = Color(0xFF1E2430),
    error = ImmersiveCoral,
    onError = Color.White,
    errorContainer = ImmersiveCoralContainer,
    onErrorContainer = Color(0xFFFECACA)
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit,
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> ImmersiveDarkColorScheme
        else -> ImmersiveLightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
