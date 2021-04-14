package com.vagrok.myartkingdom.Repository

import com.vagrok.myartkingdom.UI.API.RetrofitInstance
import com.vagrok.myartkingdom.db.ArticleDatabase
/*
Repository modules handle data operations. They provide a clean API so that the rest of the app can retrieve this data easily.
 They know where to get the data from and what API calls to make when data is updated.
 */
class NewsRepository(
        val db : ArticleDatabase
) {

    suspend fun getbreakingNews(countryCode: String , pageNumber: Int ) =
            RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)
}