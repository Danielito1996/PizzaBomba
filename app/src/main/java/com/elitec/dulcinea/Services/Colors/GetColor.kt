package com.elitec.dulcinea.Services.Colors

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

@Composable
fun GetColor(): ColorScheme {
	return if (isSystemInDarkTheme()) {
		darkColorScheme()
	}
	else {
		lightColorScheme()
	}
}