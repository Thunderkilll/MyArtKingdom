package com.vagrok.myartkingdom.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.vagrok.myartkingdom.Models.Article

//data access object
@Dao
interface ArticleDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article :Article): Long

    @Query("SELECT * FROM articles")
    fun getAllArticles() : LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}