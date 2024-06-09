package com.elitec.dulcinea.Data.Models

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.elitec.dulcinea.Data.IEntity
import com.elitec.dulcinea.R

data class Platos(
	override val id: Int?=null,
	var descripcion: String = "",
	var precio: Double = 0.0,
	var foto: Painter?= null):IEntity
