package com.elitec.dulcinea.Data.Models.Factory

import com.elitec.dulcinea.Data.Models.Platos
import javax.inject.Inject

class FactoryMap @Inject constructor() {
	val factoryMap = mapOf(
		"Platos" to { Platos() }
	)
}