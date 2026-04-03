package com.example.navigationexample.navigation

import kotlinx.serialization.Serializable
sealed interface NavigationRoute {

    @Serializable
    data object Screen1 : NavigationRoute
    @Serializable data object Screen2 : NavigationRoute
    @Serializable data object Screen3 : NavigationRoute
}