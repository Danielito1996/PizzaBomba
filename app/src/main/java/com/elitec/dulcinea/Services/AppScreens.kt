package com.elitec.dulcinea.Services

sealed class AppScreens (val route: String) {
	object SplashScreen : AppScreens("SplashScreen")
	object InitialScreen : AppScreens("InitialScreen")
}