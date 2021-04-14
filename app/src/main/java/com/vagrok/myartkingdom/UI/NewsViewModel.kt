package com.vagrok.myartkingdom.UI

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vagrok.myartkingdom.Utility.Resource
import com.vagrok.myartkingdom.NewsResponse
import com.vagrok.myartkingdom.Repository.NewsRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class NewsViewModel (
        val newsRepository : NewsRepository
        ): ViewModel() {
//live data object for fragment to subscribe
      val breakingNews: MutableLiveData<Resource<NewsResponse>> = MutableLiveData()
      val breakingNewsPage = 1

init {
    getBreakingNews("us")
}

        fun getBreakingNews(countryCode: String)= viewModelScope.launch {

                  breakingNews.postValue(Resource.Loading())
                val response = newsRepository.getbreakingNews(countryCode , breakingNewsPage)
                breakingNews.postValue(handleBreakingNewsResponse(response))
        }
// handle the response from the api and return the status of the response

        private fun handleBreakingNewsResponse(response: Response<NewsResponse>) : Resource<NewsResponse>{
                if (response.isSuccessful)
                        response.body()?.let {
                                resultResponse ->
                                return Resource.Success(resultResponse)
                        }
                return Resource.Error(response.message())
        }
}