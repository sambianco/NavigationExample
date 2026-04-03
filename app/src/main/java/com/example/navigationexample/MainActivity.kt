package com.example.navigationexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.navigationexample.navigation.NavGraph
import com.example.navigationexample.screen.ScreenOne
import com.example.navigationexample.screen.ScreenThree
import com.example.navigationexample.screen.ScreenTwo
import com.example.navigationexample.ui.theme.NavigationExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationExampleTheme {
                // 1. Inizializza il NavController
                val navController = rememberNavController()
                // 2. Passa il navController al NavGraph
                NavGraph(navController = navController)

            }
        }
    }
}
