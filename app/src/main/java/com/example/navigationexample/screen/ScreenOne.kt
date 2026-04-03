package com.example.navigationexample.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.navigationexample.composable.AppBar

@Composable
fun ScreenOne(onNavigateToSecond: ()-> Unit){
    Scaffold(
        topBar = { AppBar("Screen One") }
    ) { contentPAdding ->
        Surface(
            modifier = Modifier
                .padding(contentPAdding)

        ) {
            Box(
                modifier = Modifier.fillMaxSize().background(color = MaterialTheme.colorScheme.primaryContainer),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = {onNavigateToSecond()},
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("to Second Screen")
                }
            }
        }

    }
}