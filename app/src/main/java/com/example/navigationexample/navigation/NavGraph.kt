package com.example.navigationexample.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigationexample.screen.ScreenOne
import com.example.navigationexample.screen.ScreenThree
import com.example.navigationexample.screen.ScreenTwo

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavigationRoute.Screen1
    ) {
        composable<NavigationRoute.Screen1> {
            ScreenOne(onNavigateToSecond = { navController.navigate(NavigationRoute.Screen2) })
        }
        composable<NavigationRoute.Screen2> {
            ScreenTwo(
                onNavigateToFirst = { navController.navigate(NavigationRoute.Screen1) },
                onNavigateToThird = { navController.navigate(NavigationRoute.Screen3) }
            )
        }
        composable<NavigationRoute.Screen3> {
            ScreenThree(onNavigateToSecond = { navController.navigate(NavigationRoute.Screen2) })
        }
    }
}