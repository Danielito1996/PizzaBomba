package com.elitec.dulcinea.UIScreens.IndividualComponents

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextoGenerico(message: String, size: Float, modifier: Modifier = Modifier) {
	Text(text = message,
		modifier = modifier.padding(16.dp),
		fontSize = size.sp,
		textAlign = TextAlign.Justify)
}
