package com.elitec.dulcinea.UIScreens

import android.app.AlertDialog
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.elitec.dulcinea.Data.Models.Platos
import com.elitec.dulcinea.R
import com.elitec.dulcinea.Services.Colors.GetColor
import com.elitec.dulcinea.Services.ViewModels.PresentacionViewModel
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewModelComponent
import kotlinx.coroutines.delay

@Composable
fun InitialScreen(navController: NavController) {
	val viewModel:PresentacionViewModel= hiltViewModel()
	viewModel.LlenarLista()

	Box(modifier = Modifier
		.fillMaxSize()
		.background(GetColor().background)) {
		Column {
			Box(modifier = Modifier
				.weight(2f)
				.fillMaxWidth()) {
				TargetaSuperior()
			}
			Box(contentAlignment = Alignment.Center,
				modifier = Modifier
					.weight(1f)
					.fillMaxWidth()) {
				TituloCentral()
			}
			Box(contentAlignment = Alignment.Center,
				modifier = Modifier
					.weight(3f)
					.fillMaxWidth()) {
				Column(modifier = Modifier
					.fillMaxWidth()
					.padding(15.dp)
					.background(Color(0xFFD89B5A), shape = RoundedCornerShape(10.dp))) {
					PromocionesYOfertas()
					MejoresPlatos()
				}
			}
			Box(modifier = Modifier.weight(3f)) {
				ProductosPreferidos(listaProductos = viewModel.productosPreferidos, modifier = Modifier.fillMaxWidth())
			}
			Box(modifier = Modifier.weight(1f)) {
				BarraInferior()
			}
		}
	}
}


@Composable
fun MejoresPlatos() {
	Surface(shadowElevation = 7.dp, tonalElevation = 5.dp,shape = RoundedCornerShape(10.dp),
		color = Color(0xFF2a2929),
		modifier = Modifier
			.padding(20.dp)
			.background(color = Color(0xFFD89B5A), shape = RoundedCornerShape(15.dp))) {
		
	}
}

@Composable
fun PromocionesYOfertas() {
	Surface(shadowElevation = 7.dp, tonalElevation = 5.dp,shape = RoundedCornerShape(10.dp),
		color = Color(0xFF2a2929),
		modifier = Modifier
			.padding(20.dp)
			.background(color = Color(0xFFD89B5A), shape = RoundedCornerShape(15.dp))) {

		Row(horizontalArrangement = Arrangement.Center,
			verticalAlignment = Alignment.CenterVertically,
			modifier = Modifier
				.background(color = Color(0xffD89B5A), shape = RoundedCornerShape(10.dp))
				.padding(15.dp, 2.dp, 15.dp, 5.dp)) {
			Column(modifier = Modifier
				.weight(7f)
				.padding(5.dp)
				.background(color = Color.Transparent)) {
				Row(modifier = Modifier.background(color = Color.Transparent)){
					Icon(imageVector = Icons.Filled.Star, contentDescription = null, modifier = Modifier.padding(3.dp))
					Icon(imageVector = Icons.Filled.Star, contentDescription = null, modifier = Modifier.padding(3.dp))
					Icon(imageVector = Icons.Filled.Star, contentDescription = null, modifier = Modifier.padding(3.dp))
					Icon(imageVector = Icons.Filled.Star, contentDescription = null, modifier = Modifier.padding(3.dp))
					Icon(imageVector = Icons.Filled.Star, contentDescription = null, modifier = Modifier.padding(3.dp))
				}
				Text(
					textAlign = TextAlign.Justify,
					fontFamily = FontFamily.Serif,
					text = stringResource(id = R.string.TextoDescuento),
					modifier = Modifier.padding(0.dp,0.dp,10.dp,0.dp)

				)
			}
			Image(contentScale = ContentScale.Crop,painter = painterResource(id = R.drawable.imagenpromocion),
				contentDescription = null,
				modifier = Modifier
					.weight(3f)
					.size(100.dp)
					.clip(shape = RoundedCornerShape(15.dp)))
		}
	}
}


@Composable
fun BarraInferior() {
	Surface(
		shape = RoundedCornerShape(10.dp),
		modifier = Modifier
			.fillMaxWidth()
			.padding(15.dp, 10.dp, 15.dp, 20.dp),
		color = Color(0xFFD89B5A)  // Cambia el color de fondo a amarillo
	) {
		Box(
			modifier = Modifier.fillMaxSize(),  // Asegúrate de que el Box cubra todo el espacio disponible
			contentAlignment = Alignment.Center  // Centra el contenido en el Box
		) {
			Row {
				Text( fontFamily = FontFamily.Serif,
					text = "COMIENCE A DISFRUTAR\nJusto aqui",  // Combina los dos Text en uno
					fontSize = 16.sp,
					textAlign = TextAlign.Center  // Centra el texto horizontalmente
				)
			}
		}
	}
}


@Composable
fun TituloCentral() {
	Column(horizontalAlignment = Alignment.CenterHorizontally) {
		Text(text = "PIZZA BOMBA",
			color = GetColor().onBackground,
			fontSize = 40.sp,
			fontFamily = FontFamily.Serif,
			fontWeight = FontWeight.Bold
		)
		Text(text = "...disfruta de un servicio de la mejor calidad...",
			color = GetColor().onBackground,
			fontWeight = FontWeight.Normal,
			fontFamily = FontFamily.Cursive,
			fontSize = 20.sp)
	}
}

@Composable
fun TargetaSuperior( ) {
	Box(contentAlignment = Alignment.BottomCenter,modifier = Modifier.fillMaxWidth()) {
		Surface(shape = RoundedCornerShape(15.dp),
			modifier = Modifier
				.fillMaxWidth()
				.padding(15.dp, 10.dp, 15.dp, 40.dp)) {
				Image(contentScale = ContentScale.Crop,
					painter = painterResource(id = R.drawable.foto3),
					contentDescription = null)


		}
		Box(modifier = Modifier.background(color = GetColor().tertiary, shape = CircleShape)) {
			Image(painter = painterResource(id = R.drawable.log),
				contentDescription = null,
				modifier = Modifier
					.size(100.dp)
					.padding(17.dp, 10.dp, 10.dp, 17.dp))
		}
	}
}

@Composable
fun TargetaSuperiorPreview() {
	TargetaSuperior()
}


@Composable
fun ProductosPreferidos(listaProductos:List<Platos>,modifier: Modifier) {
	val context = LocalContext.current
	val indexador= remember {
		mutableStateOf(0)
	}
	var seleccionado= remember {
		mutableStateOf<Platos>(listaProductos[0])
	}
	LaunchedEffect(key1 = true ) {
		while (true) {
			delay(2000)
			indexador.value=(indexador.value+1)%listaProductos.size
			seleccionado.value=listaProductos[indexador.value]
		}
	}
	val platos =Platos(id = 1, descripcion = "HOLA", precio = 2.3,
		foto = painterResource(id = R.drawable.foto2))
	Box(
		modifier = Modifier
			.fillMaxWidth()
			.padding(15.dp)
			.background(color = Color(0xFFD89B5A), shape = RoundedCornerShape(10.dp))) {
		Surface(tonalElevation = 3.dp,
			shadowElevation = 5.dp,
			shape = RoundedCornerShape(10.dp),
			color = Color(0xFFD89B5A),
			modifier= Modifier
				.fillMaxWidth()
				.padding(10.dp)) {

			if(platos.foto!=null&&platos.precio!=null&&platos.descripcion!=null&&platos.id!=null)
			{
				val foto:Painter= platos.foto!!
				Column(verticalArrangement = Arrangement.Center,
					horizontalAlignment = Alignment.CenterHorizontally) {
					Image(painter = foto,
						contentDescription = null,
						contentScale = ContentScale.Crop,
						modifier = Modifier.fillMaxWidth())
					Row(verticalAlignment = Alignment.CenterVertically,
						horizontalArrangement = Arrangement.SpaceBetween,
						modifier = Modifier
							.fillMaxWidth()
							.padding(5.dp)) {
						Text(fontSize = 20.sp, fontFamily = FontFamily.SansSerif,text = platos.descripcion)
						Text(fontSize = 21.sp, fontWeight = FontWeight.Bold,text = platos.precio.toString()+" $")
					}
				}
			}
		}
	}
}


@Preview
@Composable
fun ProductosPreview() {
	val list= listOf(
		Platos(id = 1, descripcion = "PIZZA 1", precio = 24.0, foto = painterResource(id = R.drawable.foto1)),
		Platos(id = 2, descripcion = "Pizza2", precio = 34.2, foto = painterResource(id = R.drawable.foto1))
	)
	ProductosPreferidos(listaProductos = list, modifier = Modifier.fillMaxWidth())
}

@Composable
fun InitialPagePReview() {
	val navController= rememberNavController()
	InitialScreen(navController = navController)
}