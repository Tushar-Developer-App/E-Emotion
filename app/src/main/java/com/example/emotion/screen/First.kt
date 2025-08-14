package com.example.emotion.screen


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.emotion.R
import com.example.emotion.data.SurfaceItem


// Reusable item composable from previous code
@Composable
fun ClickableSurfaceItem(
    item: SurfaceItem,
    onItemClick: (SurfaceItem) -> Unit
) {
    Surface(
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, Color(0xFFE8E9F3)),
        color = Color.White,
        shadowElevation = 8.dp,
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(vertical = 4.dp)
            .clickable { onItemClick(item) }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 18.dp, end = 14.dp)
        ) {
            Image(
                painter = painterResource(item.imageRes),
                contentDescription = "${item.title} icon",
                modifier = Modifier.size(60.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = item.title,
                color = Color(0xFF1F2343),
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.weight(1f)
            )
            Icon(
                painter = painterResource(R.drawable.arow),
                contentDescription = "Navigate to ${item.title}",
                tint = Color(0xFFB0B3C7),
                modifier = Modifier.size(30.dp)
            )
        }
    }
}

@Composable
fun MainScreen(navController: NavController) {  // Added NavController parameter
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.splash),
                contentDescription = "Background image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(70.dp))
                Text(
                    "How are you feeling?",
                    fontSize = 30.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 20.dp)
                        .align(Alignment.Start)
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(R.drawable.happy),
                            contentDescription = "Happy emotion icon",
                            modifier = Modifier.size(60.dp)
                        )
                        Text(
                            text = "Happy",
                            fontSize = 16.sp,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(R.drawable.anixous),  // Assuming typo; change to correct resource if needed
                            contentDescription = "Anxious emotion icon",
                            modifier = Modifier.size(60.dp)
                        )
                        Text(
                            text = "Anxious",
                            color = Color.White,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(R.drawable.joyless),
                            contentDescription = "Joyless emotion icon",
                            modifier = Modifier.size(60.dp)
                        )
                        Text(
                            text = "Joyless",
                            color = Color.White,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(R.drawable.sad),
                            contentDescription = "Sad emotion icon",
                            modifier = Modifier.size(60.dp)
                        )
                        Text(
                            text = "Sad",
                            color = Color.White,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(R.drawable.angry),
                            contentDescription = "Angry emotion icon",
                            modifier = Modifier.size(60.dp)
                        )
                        Text(
                            text = "Angry",
                            color = Color.White,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(45.dp))
                // Integrated YourScreen's list here
                val surfaceItems = listOf(
                    SurfaceItem(1, R.drawable.feelstream3, "FeelStream"),
                    SurfaceItem(2, R.drawable.heartline, "Heartline"),
                    SurfaceItem(3, R.drawable.sensespace1, "Sense Space"),
                    SurfaceItem(4, R.drawable.moodscape2, "Moodscape")
                )
                LazyVerticalGrid(
                    columns = GridCells.Fixed(1),
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    contentPadding = PaddingValues(horizontal = 10.dp, vertical = 8.dp)
                ) {
                    items(surfaceItems) { item ->
                        ClickableSurfaceItem(
                            item = item,
                            onItemClick = { clickedItem ->
                                when (clickedItem.id) {
                                    1 -> navController.navigate("feelstream_screen")
                                    2 -> navController.navigate("heartline_screen")
                                    3 -> navController.navigate("sensespace_screen")
                                    4 -> navController.navigate("moodscape_screen")
                                }
                            }
                        )
                    }
                }
                Spacer(modifier = Modifier.height(60.dp))
            }
        }
    }
}

@Preview
@Composable
fun Preview() {
    // For preview, provide a mock NavController (navigation won't work in preview)
    val mockNavController =
        rememberNavController()  // Requires import androidx.navigation.compose.rememberNavController
    MainScreen(navController = mockNavController)
}
