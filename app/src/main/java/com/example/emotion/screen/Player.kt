package com.example.emotion.screen

import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.emotion.R
import com.example.emotion.screen.MusicBar


@Composable
fun Bar(
    userName: String = "Paul", onNotificationClick: () -> Unit = {}
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.player), // Replace with your actual image resource ID
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop, // Ensures the image fills the screen by cropping if necessary
            alignment = Alignment.Center
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Left Side: Backspace Icon
                IconButton(
                    onClick = onNotificationClick,  // Ensure this variable is defined
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.backspace),  // Replace with your image resource ID
                        contentDescription = "Backspace",
                        modifier = Modifier
                            .size(25.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Fit
                    )
                }

                // Center: Corrected "Nature" Text
                Column(
                    modifier = Modifier.wrapContentSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally  // Added for better centering
                ) {
                    Text(
                        text = "Nature",
                        color = Color.White,
                        fontSize = 25.sp,  // Corrected to scale the font size properly
                        style = LocalTextStyle.current  // Optional: Use current theme style
                    )
                }

                // Right Side: Notification Icon (bell)
                IconButton(
                    onClick = onNotificationClick,  // Ensure this variable is defined
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bellplayer),  // Replace with your image resource ID
                        contentDescription = "Notifications",
                        modifier = Modifier.size(30.dp),
                        contentScale = ContentScale.Fit
                    )
                }
            }

            // Player UI
            PlayerUI(true, 0.1f, {}, {}, {}, {}, modifier = Modifier.weight(0.1f))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlayerUI(
    isPlaying: Boolean,
    progress: Float,
    onPlayPauseClick: () -> Unit,
    onNextClick: () -> Unit,
    onBackClick: () -> Unit,
    onSeek: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth(),

        ) {
        Spacer(modifier = Modifier.height(565.dp))
        MusicBar()
        Spacer(modifier = Modifier.height(20.dp))

        // Controls
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.fillMaxHeight()) {
                Spacer(modifier = Modifier.height(20.dp))
                IconButton(onClick = onBackClick) {
                    Image(
                        modifier = modifier.size(45.dp),
                        painter = painterResource(id = R.drawable.left),
                        contentDescription = "Replay"
                    )
                }
            }
            IconButton(
                onClick = onPlayPauseClick,
                modifier = Modifier.size(80.dp) // Apply size here to increase the button (and icon) overall
            ) {
                Image(
                    painter = if (isPlaying) painterResource(id = R.drawable.pause1) else painterResource(
                        id = R.drawable.play
                    ),
                    contentDescription = if (isPlaying) "Pause" else "Play",
                    contentScale = ContentScale.Fit, // Ensures the image scales to fit the button without distortion
                    modifier = Modifier.fillMaxSize() // Fills the entire IconButton space
                )
            }
            Column(modifier = Modifier.fillMaxHeight()) {
                Spacer(modifier = Modifier.height(20.dp))
                IconButton(onClick = onBackClick) {
                    Image(
                        modifier = modifier.size(45.dp),
                        painter = painterResource(id = R.drawable.right),
                        contentDescription = "Replay"
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PlayerPreview() {
    Bar()
}


