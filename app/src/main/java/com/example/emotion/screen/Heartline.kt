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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.emotion.R
import com.example.emotion.data.Person
import com.example.emotion.data.people
import com.example.emotion.ui.theme.Search
import com.example.emotion.ui.theme.p1

@Composable
fun Heartline(onBackClick: () -> Unit) {
    var numberTab by remember { mutableIntStateOf(0) }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(p1)
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp, vertical = 30.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                IconButton(onClick = onBackClick) {
                    Image(
                        painter = painterResource(id = R.drawable.leftb), // Replace with your image resource ID
                        contentDescription = "Backspace",
                        modifier = Modifier
                            .size(25.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Fit
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.heartline), // Replace with your image resource ID
                    contentDescription = "Backspace",
                    modifier = Modifier
                        .padding(start = 80.dp)
                        .size(30.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Fit
                )
                Text(
                    text = "Heartline",
                    modifier = Modifier.padding(5.dp),
                    fontSize = 20.sp,
                    color = Color.Black,
                )
                Spacer(modifier = Modifier.width(5.dp))
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp),
                shape = RoundedCornerShape(15.dp),
                colors = CardDefaults.cardColors(Search)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 5.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.search1),  // Replace with your image
                        contentDescription = "Backspace",
                        modifier = Modifier.size(25.dp),
                        contentScale = ContentScale.Fit,
                    )
                }
            }
            Spacer(modifier = Modifier.height(50.dp))
            Card(
                modifier = Modifier.fillMaxSize(), shape = RectangleShape,
                colors = CardDefaults.cardColors(Color.White)
            ) {
                TabRow(selectedTabIndex = numberTab, containerColor = Color.White) {
                    Tab(selected = numberTab == 0, onClick = { numberTab = 0 }) {
                        Text("ALL", modifier = Modifier.padding(vertical = 16.dp))
                    }
                    Tab(selected = numberTab == 1, onClick = { numberTab = 1 }) {
                        Text("Psychiatrist", modifier = Modifier.padding(vertical = 16.dp))
                    }
                    Tab(selected = numberTab == 2, onClick = { numberTab = 2 }) {
                        Text("Consultant", modifier = Modifier.padding(vertical = 16.dp))
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                PeopleList(people)
            }
        }
    }
}

@Preview
@Composable
fun HeartlinePreview() {
    Heartline(onBackClick = {})
}

@Composable
fun PeopleList(people: List<Person>) {
    val scrollState = rememberLazyListState()

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(20.dp),  // Spaces items evenly (may add extra space at ends)
        state = scrollState,
        modifier = Modifier.fillMaxSize()
    ) {
        items(people) { person ->  // Corrected variable name from 'people' to 'person'

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),  // Applies background color to the row // Spaces elements evenly across the row
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = person.img),  // Uses 'person.img' instead of 'people.img'
                    modifier = Modifier
                        .wrapContentHeight()
                        .size(50.dp)
                        .clip(CircleShape),  // Clips the image to a circle
                    contentDescription = "Profile",  // Consider using a more descriptive string, e.g., person.name
                    contentScale = ContentScale.Fit
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = person.name,  // Uses 'person.name' instead of 'people.name'
                    fontSize = 20.sp,
                    modifier = Modifier.weight(1f),
                    color = Color.Black
                )
                Text(
                    text = person.rating,  // Uses 'person.name' instead of 'people.name'
                    fontSize = 20.sp,
                    color = Color.Black
                )
                Image(
                    painter = painterResource(id = R.drawable.star),  // Assumes 'star' drawable exists
                    modifier = Modifier
                        .padding(start = 4.dp, end = 4.dp)
                        .size(20.dp),
                    contentDescription = "Rating"  // Consider updating to something like "star icon"
                )
            }
        }
    }
}

