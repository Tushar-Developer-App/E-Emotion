package com.example.emotion.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import kotlinx.coroutines.delay
import android.view.animation.OvershootInterpolator
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.emotion.R

@Composable
fun SplashScreen(navController : NavHostController) {
    val scale = remember { Animatable(0f) } // Starts at 0 scale[1]

    // Animation launch
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 1f, // Scale to full size
            animationSpec = tween(
                durationMillis = 800,
                easing = { OvershootInterpolator(4f).getInterpolation(it) } // Bouncy effect[1]
            )
        )
        delay(2000L) // Adjust delay for animation + hold time (e.g., 2 seconds)[4]
        navController.navigate("main") { popUpTo("splash") { inclusive = true } } // Navigate and clear backstack
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.splash), // Replace with your actual image resource ID
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop, // Ensures the image fills the screen by cropping if necessary
            alignment = Alignment.Center
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(60.dp))
            Text("E-emotion", color = Color.White, fontSize = 50.sp,
                fontWeight = FontWeight.Bold,)
            Spacer(modifier = Modifier.height(15.dp))
            Text("AN EMOTIONAL EXPERIENCE PLATFORM", color = Color.White, fontSize = 15.sp,
                fontWeight = FontWeight.Bold)


        }
    }
}


@Preview
@Composable
fun Preview1(){
    val navController = rememberNavController()
    SplashScreen(navController)
}