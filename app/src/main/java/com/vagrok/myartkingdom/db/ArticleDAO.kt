package com.vagrok.myartkingdom.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.vagrok.myartkingdom.Models.Article

//data access object
@Dao
interface ArticleDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article :Article): Long


}