package com.vagrok.myartkingdom.UI

import androidx.lifecycle.ViewModel
import com.vagrok.myartkingdom.Repository.NewsRepository

class NewsViewModel (
        val newsRepository : NewsRepository
        ): ViewModel() {

}