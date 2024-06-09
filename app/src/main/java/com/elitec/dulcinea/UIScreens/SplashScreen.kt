package com.elitec.dulcinea.UIScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.elitec.dulcinea.R
import com.elitec.dulcinea.Services.AppScreens
import com.elitec.dulcinea.Services.Colors.GetColor
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
	LaunchedEffect(key1 = true) {
		delay(2000)
		navController.popBackStack()//Esto es para que no se pueda navegar hacia atras
		navController.navigate(AppScreens.InitialScreen.route)
	}
	Splash()
}

@Composable
fun Splash() {
	Box(contentAlignment = Alignment.Center, modifier = Modifier
		.fillMaxSize()
		.background(color = GetColor().background)) {
		Image(painter = painterResource(id = R.drawable.splash)
			, contentDescription ="Splash"
			, modifier = Modifier.size(150.dp))
	}
}

@Preview
@Composable
fun SplashScreenViewPreview() {
	val navController= rememberNavController()
	SplashScreen(navController = navController)
}