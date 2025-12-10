package com.example.lab33

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNav()
        }
    }
}

@Composable
fun AppNav() {
    val nav = rememberNavController()
    NavHost(navController = nav, startDestination = "home") {

        composable("home") {
            HomeScreen(
                openA = { nav.navigate("a") },
                openB = { nav.navigate("b") },
                openC = { nav.navigate("c") }
            )
        }

        composable("a") { ScreenA(onBack = { nav.popBackStack() }) }
        composable("b") { ScreenB(onBack = { nav.popBackStack() }) }
        composable("c") { ScreenC(onBack = { nav.popBackStack() }) }
    }
}
