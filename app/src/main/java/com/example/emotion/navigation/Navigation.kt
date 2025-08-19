package com.example.emotion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.emotion.screen.Bottom
import com.example.emotion.screen.Heartline
import com.example.emotion.screen.MainScreen
import com.example.emotion.screen.SenseSpace
import com.example.emotion.screen.SplashScreen

@Composable
fun AppNavigation() {
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("main") { MainScreen(navController) }
        composable("feelstream_screen") {
            // Add your FeelStreamScreen here
            // FeelStreamScreen(navController)
            Bottom()
        }
        composable("heartline_screen") {
            // Add your HeartlineScreen here
            // HeartlineScreen(navController)
            Heartline(onBackClick = { navController.popBackStack() })
        }
        composable("sensespace_screen") {
            // Add your SenseSpaceScreen here
            SenseSpace()

        }
        composable("moodscape_screen") {
            // Add your MoodscapeScreen here
            // MoodscapeScreen(navController)
        }
    }
}