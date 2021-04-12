package com.vagrok.myartkingdom.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.vagrok.myartkingdom.Models.Article

@Database(
        entities = [Article::class],
        version = 1
)
//add type converter because the room read only basic type classes not custom classes
@TypeConverters(Converters::class)

abstract class ArticleDatabase : RoomDatabase() {
    abstract fun getArticleDao(): ArticleDAO

    companion object{
        @Volatile
        private  var instance: ArticleDatabase? = null

        private val LOCK = Any()

        operator fun invoke(context: Context) = instance?: synchronized(LOCK){
            instance ?: createDatabase(context).also { instance = it }
        }
        private fun createDatabase(context: Context) =
                Room.databaseBuilder(
                        context.applicationContext ,
                        ArticleDatabase::class.java,
                        "article_db.db"
                ).build()
    }
}