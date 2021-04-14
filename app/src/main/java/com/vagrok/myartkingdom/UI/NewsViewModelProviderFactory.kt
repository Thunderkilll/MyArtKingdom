package com.vagrok.myartkingdom.UI

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vagrok.myartkingdom.Repository.NewsRepository

class NewsViewModelProviderFactory (
        val newsRepository: NewsRepository
):  ViewModelProvider.Factory{



    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository ) as T
    }


}