package com.example.emotion.data

data class SurfaceItem(
    val id: Int,
    val imageRes: Int,
    val title: String,
    val onClick: () -> Unit = {}
)