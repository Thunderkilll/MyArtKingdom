package com.vagrok.myartkingdom

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)