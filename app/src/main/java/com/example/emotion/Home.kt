package com.example.emotion

import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.emotion.ui.theme.Skin
import com.example.emotion.ui.theme.b1
import com.example.emotion.ui.theme.card
import com.example.emotion.ui.theme.test1
import com.example.emotion.ui.theme.test2
import com.example.emotion.ui.theme.test3
import com.example.emotion.ui.theme.text
import com.exyte.animatednavbar.AnimatedNavigationBar
import com.exyte.animatednavbar.animation.balltrajectory.Parabolic
import com.exyte.animatednavbar.animation.indendshape.Height
import com.exyte.animatednavbar.animation.indendshape.shapeCornerRadius
import com.exyte.animatednavbar.utils.noRippleClickable

@Composable
fun Bottom() {
    val navigationBarItems = remember { NavigationBarItems.values() }
    var selectedIndex by remember { mutableStateOf(0) }
    Scaffold(
        modifier = Modifier.background(Skin), bottomBar = {
            AnimatedNavigationBar(
                modifier = Modifier.height(64.dp),
                selectedIndex = selectedIndex,
                cornerRadius = shapeCornerRadius(cornerRadius = 34.dp),
                ballAnimation = Parabolic(tween(300)),
                indentAnimation = Height(tween(300)),
                barColor = test3,
                ballColor = b1,
            ) {
                navigationBarItems.forEach { item ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .noRippleClickable { selectedIndex = item.ordinal },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            modifier = Modifier.size(26.dp),
                            painter = painterResource(item.icon),
                            contentDescription = "Bottom Bar icons",
                            tint = if (selectedIndex == item.ordinal) b1
                            else b1
                        )
                    }
                }
            }
        }) {
        it
        Home()
    }
}

enum class NavigationBarItems(val icon: Int) {
    Home(icon = R.drawable.home_24), Call(icon = R.drawable.profile), Fav(icon = R.drawable.heart)
}

fun Modifier.noRippleClickable(onClick: () -> Unit): Modifier = composed {
    clickable(
        indication = null, interactionSource = remember { MutableInteractionSource() }) {
        onClick()
    }
}

@Composable
fun Header(
    userName: String = "Paul", onNotificationClick: () -> Unit = {}
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(
            onClick = onNotificationClick,
        ) {
            Image(
                painter = painterResource(id = R.drawable.user), // Replace with your image resource ID
                contentDescription = "Notifications",
                modifier = Modifier.size(70.dp),
                contentScale = ContentScale.Fit

            )
        }

        Text(
            "Jenna Coleman", color = Color.White, fontSize = 20.sp
        )

        // Right Side: Notification Icon (bell)
        IconButton(
            onClick = onNotificationClick,
        ) {
            Image(
                painter = painterResource(id = R.drawable.bell), // Replace with your image resource ID
                contentDescription = "Notifications",
                modifier = Modifier.size(30.dp),
                contentScale = ContentScale.Fit

            )
        }
    }
}


@Composable
fun Home() {
    Box(
        modifier = Modifier.fillMaxSize()

    ) {
        Image(
            painter = painterResource(id = R.drawable.splash), // Replace with your actual image resource ID
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop, // Ensures the image fills the screen by cropping if necessary
            alignment = Alignment.Center
        )
        Header()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 100.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,

            ) {
            Card(
                modifier = Modifier.weight(1f),
                elevation = CardDefaults.cardElevation(defaultElevation = 50.dp),
                colors = CardDefaults.cardColors(containerColor = test1),

                ) {
                Column(modifier = Modifier
                    .wrapContentSize()){
                    Text(
                        "Nature",
                        modifier = Modifier.fillMaxWidth(),
                        color = card,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(120.dp))
                    Text(
                        "Nature",
                        modifier = Modifier.fillMaxWidth(),
                        color = card,
                        textAlign = TextAlign.End
                    )
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            Card(
                modifier = Modifier.weight(1f),
                elevation = CardDefaults.cardElevation(defaultElevation = 50.dp),
                colors = CardDefaults.cardColors(containerColor = card),

                ) {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    ) {
                    Text(
                        "Tushar",
                        color = test1,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(120.dp))
                    Text(
                        "Nature",
                        modifier = Modifier.fillMaxWidth(),
                        color = test1,
                        textAlign = TextAlign.End
                    )
                }
            }
        }
        ElevatedCard(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 300.dp),
            shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 50.dp),
            colors = CardDefaults.cardColors(containerColor = test2)
        ) {
        }
    }
}

@Preview
@Composable
fun BottomPreview() {
    Bottom()
}