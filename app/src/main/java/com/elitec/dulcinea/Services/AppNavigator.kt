package com.elitec.dulcinea.Services

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.elitec.dulcinea.UIScreens.InitialScreen
import com.elitec.dulcinea.UIScreens.SplashScreen

@Composable
fun AppNavigator() {
	val navController= rememberNavController()
	NavHost(navController = navController, startDestination = "SplashScreen") {
		composable(route = AppScreens.SplashScreen.route) {
			SplashScreen(navController = navController)
		}
		composable(route = AppScreens.InitialScreen.route) {
			InitialScreen(navController = navController)
		}
	}
}