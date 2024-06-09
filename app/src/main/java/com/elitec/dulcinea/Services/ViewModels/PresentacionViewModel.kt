package com.elitec.dulcinea.Services.ViewModels

import android.text.Editable.Factory
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.viewModelFactory
import com.elitec.dulcinea.Data.Models.Factory.FactoryMap
import com.elitec.dulcinea.Data.Models.Platos
import com.elitec.dulcinea.R
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PresentacionViewModel @Inject constructor( factory: FactoryMap):ViewModel() {

	val productosPreferidos = mutableListOf<Platos>()
	private val factory=factory

	@Composable
	fun LlenarLista() {
		val producto1=factory.factoryMap["Platos"]?.invoke()
		producto1?.foto= painterResource(id = R.drawable.foto3)
		producto1?.precio=100.0
		producto1?.descripcion="Pizza dinamita"
		val producto2=factory.factoryMap["Platos"]?.invoke()
		producto2?.foto= painterResource(id = R.drawable.foto1)
		producto2?.precio=140.0
		producto2?.descripcion="Pizza nuclear"
		val producto3=factory.factoryMap["Platos"]?.invoke()
		producto3?.foto= painterResource(id = R.drawable.foto2)
		producto3?.precio=120.0
		producto3?.descripcion="Pizza termobarica"
		if (producto1!= null&&producto2!=null&&producto3!=null) {
			productosPreferidos.add(producto1)
			productosPreferidos.add(producto2)
			productosPreferidos.add(producto3)
		}
	}
	 /*init {
	 	val product1: Platos?=factory.factoryMap["Platos"]
		 product1?.descripcion= "Pizza dinamita"
		 product1?.precio= 100.0
		 product1?.foto= painterResource(id = R.drawable.foto1)
	 }*/

}