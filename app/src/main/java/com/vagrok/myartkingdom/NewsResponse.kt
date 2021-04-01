package com.vagrok.myartkingdom

import com.vagrok.myartkingdom.Models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)