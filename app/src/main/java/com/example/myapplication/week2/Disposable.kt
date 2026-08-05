package com.example.myapplication.week2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

class Disposable : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           // Disposablefunction()
        }
    }
}

/**
 * <---   Disposable view -->
 *     ondispose important
 *
 */
/*
@Composable
fun Disposablefunction() {
    Scaffold(
        topBar = {

        }
    ) {

    }
}*/