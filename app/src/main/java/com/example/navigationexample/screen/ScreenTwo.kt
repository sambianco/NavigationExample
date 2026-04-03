package com.example.navigationexample.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.navigationexample.composable.AppBar

@Composable
fun ScreenTwo(
    onNavigateToFirst: () -> Unit, // <-- Parametro 1
    onNavigateToThird: () -> Unit  // <-- Parametro 2
){
    Scaffold(
        topBar = { AppBar("Screen Two") }
    ) { contentPAdding ->
        Surface(
            modifier = Modifier
                .padding(contentPAdding)

        ) {
            Row(
                modifier = Modifier.fillMaxSize().background(color = MaterialTheme.colorScheme.secondaryContainer),
                horizontalArrangement = Arrangement.Center, // Centra orizzontalmente
                verticalAlignment = Alignment.CenterVertically // Centra verticalmente
            ) {
                Button(onClick = { onNavigateToFirst() }) {
                    Text("to first screen")
                }

                Spacer(modifier = Modifier.width(16.dp)) // Un po' di spazio tra i due

                Button(onClick = { onNavigateToThird() }) {
                    Text("to third screen")
                }
            }
        }
    }
}