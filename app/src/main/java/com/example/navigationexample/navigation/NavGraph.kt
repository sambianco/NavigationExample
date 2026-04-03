package com.example.navigationexample.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavigationRoute.Screen1
    ) {
        composable<NavigationRoute.Screen1> {
            Screen1(navController)
        }
        composable<NavigationRoute.Screen2> {
            NavigationRoute.Screen2(navController)
        }
        composable<NavigationRoute.Screen3> {
            Screen3(navController)
        }
    }
}