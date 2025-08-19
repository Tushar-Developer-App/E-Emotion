package com.example.emotion.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
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
fun SenseSpace() {
    Column(
        modifier = Modifier
            .background(Color(0xFFF9F5F0))
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .background(
                    Color(0xFFF4E5B3),
                    RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp)
                )
                .fillMaxWidth()
                .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    "Your Program\nIs Ready!",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "Just 30 minutes a day to change your life.",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    textAlign = TextAlign.Center
                )
            }
        }

        Spacer(modifier = Modifier.height(18.dp))
        Text(
            "Sense Space",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 20.sp,
        )
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Card() {
                Box(
                    modifier = Modifier.size(width = 180.dp, height = 280.dp),
                    contentAlignment = Alignment.Center
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.med2),
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop,
                        contentDescription = ""
                    )
                    Text(
                        text = "Guided\nMeditation",  // Replace with your text
                        color = Color.Black,  // White for visibility on images; adjust as needed
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(8.dp)  // Optional padding for spacing
                            .align(Alignment.TopCenter)
                    )
                }

            }
            Column() {
                Card() {
                    Box(modifier = Modifier.size(width = 180.dp, 135.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.ex),
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds,
                            contentDescription = ""
                        )
                        Text(
                            text = "Breathing\nExcercise",  // Replace with your text
                            color = Color.Black,  // White for visibility on images; adjust as needed
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(8.dp)  // Optional padding for spacing
                                .align(Alignment.TopCenter)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Card() {
                    Box(Modifier.size(width = 180.dp, 135.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.b6),
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillWidth,
                            contentDescription = ""
                        )
                        Text(
                            text = "Recipe",  // Replace with your text
                            color = Color.Black,  // White for visibility on images; adjust as needed
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(8.dp)  // Optional padding for spacing
                                .align(Alignment.TopCenter)
                        )
                    }
                }

            }
        }
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom=20.dp, start = 10.dp, end = 10.dp),
        ) {
            Card(
            ) {
                Box(modifier = Modifier.fillMaxWidth().padding()) {
                    Image(
                        painter = painterResource(id = R.drawable.yoga2),
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentScale = ContentScale.Crop,
                        contentDescription = ""
                    )
                    Text(
                        text = "Yoga\nClasses",  // Replace with your text
                        color = Color.Black,  // White for visibility on images; adjust as needed
                        fontSize = 25.sp,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier
                            .padding(end = 60.dp, top =10.dp)  // Optional padding for spacing
                            .align(Alignment.TopEnd)
                    )
                }
            }

        }
    }
}

@Preview
@Composable
fun SenseSpacePreview() {
    SenseSpace()
}

