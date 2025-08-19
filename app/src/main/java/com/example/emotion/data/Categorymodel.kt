package com.example.emotion.data

import com.example.emotion.R

data class SurfaceItem(
    val id: Int,
    val imageRes: Int,
    val title: String,
    val onClick: () -> Unit = {}
)

data class Person(val name: String, val img: Int, val rating: String)

val people = listOf(
    Person("Alex", R.drawable.men, "4.5"),
    Person("Amy Richardson", R.drawable.female, "4.8"),
    Person("Adam Wilson", R.drawable.men2, "4.2"),
    Person("Andrew Scott", R.drawable.men3, "3.9"),
    Person("Alex Turner", R.drawable.men4, "4.5"),
    Person("Brian Carter", R.drawable.men5, "4.0"),
    Person("Benjamin Taylor", R.drawable.female3, "4.7"),
    Person("Bianca Torres", R.drawable.female2, "4.9"),
    Person("Charlotte Wilson", R.drawable.female, "4.6"),
    Person("David Johnson", R.drawable.men3, "3.8"),
    Person("Evelyn Smith", R.drawable.female2, "4.4"),
    Person("Frank Harris", R.drawable.men, "3.7"),
    Person("Grace Lee", R.drawable.female, "4.9"),
    Person("Henry Brown", R.drawable.men2, "4.1"),
    Person("Isabelle Clark", R.drawable.female2, "4.8"),
    Person("Jack Wilson", R.drawable.men4, "4.0"),
    Person("Katherine Evans", R.drawable.female, "4.7"),
    Person("Liam White", R.drawable.men6, "3.9"),
    Person("Bella James", R.drawable.female, "4.3"),

    )

data class PowerYogaClass(
    val title: String,
    val subtitle: String,
    val imageRes: Int,  // Resource ID for the background image (e.g., R.drawable.power_yoga)
    val onArrowClick: () -> Unit = {}  // Lambda for handling the arrow button click
)


val sampleYogaClass = listOf(
    PowerYogaClass(
        title = "Power Yoga",
        subtitle = "High-intensity power yoga",
        imageRes = R.drawable.y1,
        onArrowClick = { }
    ),
    PowerYogaClass(
        title = "Relaxing Yoga",
        subtitle = "Unwind and de-stress",
        imageRes = R.drawable.y2,
        onArrowClick = {  }
    )
    // Add more as needed
)
val powerYogaClasses = listOf(sampleYogaClass)