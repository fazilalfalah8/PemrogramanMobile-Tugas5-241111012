package com.utama.satwalaya.data

data class ServiceItem(
    val id: Int,
    val name: String,
    val description: String,
    val price: String,
    val iconRes: Int
)

data class RecommendItem(
    val id: Int,
    val title: String,
    val price: String,
    val imageRes: Int
)

data class HistoryItem(
    val id: Int,
    val serviceName: String,
    val date: String,
    val status: String
)

data class ReviewItem(
    val id: Int,
    val reviewerName: String,
    val rating: Float,
    val content: String
)