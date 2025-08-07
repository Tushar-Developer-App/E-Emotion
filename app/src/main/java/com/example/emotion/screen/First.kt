package com.example.emotion.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import com.example.emotion.R


@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()

        ) {Image(
            painter = painterResource(id = R.drawable.splash), // Replace with your actual image resource ID
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop, // Ensures the image fills the screen by cropping if necessary
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
                    "How are you feeling ?",
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
                            contentDescription = "Logo",
                            modifier = Modifier
                                .size(60.dp)
                        )
                        Text(
                            text = "Happy",
                            fontSize = 16.sp,
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(top = 4.dp)  // Small space between image and text
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(R.drawable.anixous),
                            contentDescription = "Logo",
                            modifier = Modifier
                                .size(60.dp)
                        )
                        Text(
                            text = "Anxious",
                            color = Color.White,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(top = 4.dp)  // Small space between image and text
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(R.drawable.joyless),
                            contentDescription = "Logo",
                            modifier = Modifier
                                .size(60.dp)
                        )
                        Text(
                            text = "Joyless",
                            color = Color.White,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(top = 4.dp)  // Small space between image and text
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(R.drawable.sad), contentDescription = "Logo",
                            modifier = Modifier
                                .size(60.dp)
                        )
                        Text(
                            text = "Sad",
                            color = Color.White,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(top = 4.dp)  // Small space between image and text
                        )
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(R.drawable.angry),
                            contentDescription = "Logo",
                            modifier = Modifier
                                .size(60.dp)
                        )
                        Text(
                            text = "Angry",
                            color = Color.White,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(top = 4.dp)  // Small space between image and text
                        )
                    }
                }
                Spacer(modifier = Modifier.height(45.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding()
                ) {
                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        border = BorderStroke(1.dp, Color(0xFFE8E9F3)),
                        color = Color.White,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(vertical = 4.dp, horizontal = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(start = 18.dp, end = 14.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.feelstream3),
                                contentDescription = "Logo",
                                modifier = Modifier
                                    .size(60.dp)
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                            Text(
                                text = "FeelStream",
                                color = Color(0xFF1F2343),
                                fontSize = 18.sp,
                                modifier = Modifier.weight(1f)
                            )
                            Icon(
                                painter = painterResource(R.drawable.arow), // Or a custom chevron vector
                                contentDescription = null,
                                tint = Color(0xFFB0B3C7),
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding()
                ) {
                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        border = BorderStroke(1.dp, Color(0xFFE8E9F3)),
                        color = Color.White,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(vertical = 4.dp, horizontal = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(start = 18.dp, end = 14.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.heartline),
                                contentDescription = "Logo",
                                modifier = Modifier
                                    .size(60.dp)
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                            Text(
                                text = "Heartline",
                                color = Color(0xFF1F2343),
                                fontSize = 18.sp,
                                modifier = Modifier.weight(1f)
                            )
                            Icon(
                                painter = painterResource(R.drawable.arow),// Or a custom chevron vector
                                contentDescription = null,
                                tint = Color(0xFFB0B3C7),
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    }

                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding()
                ) {
                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        border = BorderStroke(1.dp, Color(0xFFE8E9F3)),
                        color = Color.White,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(vertical = 4.dp, horizontal = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(start = 18.dp, end = 14.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.sensespace1),
                                contentDescription = "Logo",
                                modifier = Modifier
                                    .size(60.dp)
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                            Text(
                                text = "Sense Space",
                                color = Color(0xFF1F2343),
                                fontSize = 18.sp,
                                modifier = Modifier.weight(1f)
                            )
                            Icon(
                                painter = painterResource(R.drawable.arow), // Or a custom chevron vector
                                contentDescription = null,
                                tint = Color(0xFFB0B3C7),
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding()
                ) {
                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        border = BorderStroke(1.dp, Color(0xFFE8E9F3)),
                        color = Color.White,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(vertical = 4.dp, horizontal = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(start = 18.dp, end = 14.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.moodscape2),
                                contentDescription = "Logo",
                                modifier = Modifier
                                    .size(60.dp)
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                            Text(
                                text = "Moods Cape",
                                color = Color(0xFF1F2343),
                                fontSize = 18.sp,
                                modifier = Modifier.weight(1f)
                            )
                            Icon(
                                painter = painterResource(R.drawable.arow), // Or a custom chevron vector
                                contentDescription = null,
                                tint = Color(0xFFB0B3C7),
                                modifier = Modifier.size(30.dp)
                            )
                        }
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
    MainScreen()
}