package com.example.emotion

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Bar(
    userName: String = "Paul",
    onNotificationClick: () -> Unit = {}
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
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



