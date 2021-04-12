package com.vagrok.myartkingdom.db

import androidx.room.TypeConverter
import com.vagrok.myartkingdom.Models.Source

class Converters {
    @TypeConverter
    fun FromSource(source: Source): String {

        return source.name
    }

    @TypeConverter
    fun toSource(name: String):Source {
        return Source(name , name)
    }
}