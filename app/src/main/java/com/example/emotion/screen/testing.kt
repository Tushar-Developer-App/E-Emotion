package com.example.emotion.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.emotion.R

// Data class (unchanged)
data class PowerYogaClass(
    val title: String,
    val subtitle: String,
    val imageRes: Int,
    val onArrowClick: () -> Unit = {}
)

// Sample data (unchanged, defined outside for preview and row usage)
val sampleYogaClass = listOf(
    PowerYogaClass(
        title = "Power Yoga",
        subtitle = "High-intensity power yoga",
        imageRes = R.drawable.y1,  // Replace with your actual drawable
        onArrowClick = { /* Action */ }
    ),
    PowerYogaClass(
        title = "Relaxing Yoga",
        subtitle = "Unwind and de-stress",
        imageRes = R.drawable.y2,  // Replace with your actual drawable
        onArrowClick = { /* Action */ }
    ),
    PowerYogaClass(
        title = "Morning Stretch",
        subtitle = "Start your day right",
        imageRes = R.drawable.y3,  // Replace with your actual drawable
        onArrowClick = { /* Action */ }
    ),
    PowerYogaClass(
        title = "Meditation Flow",
        subtitle = "Focus and breathe",
        imageRes = R.drawable.y4,  // Replace with your actual drawable
        onArrowClick = { /* Action */ }
    )
    // Add even more here if needed
)

val powerYogaClasses = sampleYogaClass  // Fixed: Direct assignment, no extra list wrapping

@Composable
fun PowerYogaCard(
    yogaClass: PowerYogaClass, cardWidth: Dp = 220.dp,     // <-- new default
    cardHeight: Dp = 220.dp
) {
    Box(
        Modifier
            .clip(RoundedCornerShape(24.dp))
            .size(cardWidth, cardHeight)
            .clickable { yogaClass.onArrowClick() }
    ) {
        Image(
            painter = painterResource(yogaClass.imageRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Box(
            Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color.Transparent, Color(0xAA000000)),
                        startY = 100f, endY = 250f
                    )
                )
        )
        Column(
            Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                text = yogaClass.title,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Spacer(Modifier.height(4.dp))
            Text(
                text = yogaClass.subtitle,
                color = Color.White.copy(alpha = 0.8f),
                fontSize = 13.sp
            )
            Spacer(Modifier.height(6.dp))
            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier.fillMaxWidth()
            ) {
                IconButton(
                    onClick = yogaClass.onArrowClick,
                    modifier = Modifier
                        .size(32.dp)
                        .background(Color.White, CircleShape)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.arow),  // Assuming this is your drawable; fix name if needed
                        contentDescription = "Arrow",
                        tint = Color(0xFF915A36),
                        modifier = Modifier.size(22.dp)
                    )
                }
            }
        }
    }
}

// Scrollable row composable (fixed typo in items)
@Composable
fun PowerYogaRow() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(powerYogaClasses) { yogaClass ->
            PowerYogaCard(yogaClass)  // Fixed: Pass the lambda variable correctly
        }
    }
}

@Preview
@Composable
fun PowerYogaScreenPreview() {
    PowerYogaRow()
}
