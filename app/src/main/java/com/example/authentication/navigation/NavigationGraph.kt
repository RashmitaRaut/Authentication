package com.example.authentication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.authentication.presentation.layer.login_screen.SignInScreen
import com.example.authentication.presentation.layer.signup_screen.SignUpScreen

@Composable
fun NavigationGraph(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = Screens.SignUpScreen.route
    ) {
        composable(route = Screens.SignInScreen.route) {
                SignInScreen()
        }
        composable(route = Screens.SignUpScreen.route) {
                SignUpScreen()
        }
    }

}