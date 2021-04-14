package com.vagrok.myartkingdom.UI.Fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.vagrok.myartkingdom.UI.MainActivity
import com.vagrok.myartkingdom.UI.NewsViewModel
import com.vagrok.myartkingdom.Utility.Resource
import com.vagrok.myartkingdom.adapters.NewsAdapter
import kotlinx.android.synthetic.main.fragment_breaking_news.*

class BreakingNewsFragments : Fragment() {

    lateinit var viewModel: NewsViewModel
    lateinit var newsAdapter: NewsAdapter
        var TAG = " breakingNewsFragment"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as MainActivity).viewModel
        //view model update with data
        viewModel.breakingNews.observe(viewLifecycleOwner , Observer {
            //when the response is a success
            response -> when (response) {
                is Resource.Success -> {
                    hideProgressbar()
                    //test if the response isn't null
                    response.data?.let {newsResponse ->
                    newsAdapter.differ.submitList(newsResponse.articles)

                    }
                }
            //when the response didn't reach or there is a problem : error
                is Resource.Error -> {
                    hideProgressbar()
                    //test if the response isn't null
                    response.message?.let {message ->
                   Toast.makeText( context ,"an error occured please redo this again $message", Toast.LENGTH_LONG ).show()
                        Log.e(TAG , "an error occured please redo this again $message"  )
                    }
                }
            //when the response is loading
            is Resource.Loading -> {
                showProgressbar()

            }

            }
        })
    }

    fun hideProgressbar(){
        paginationProgressBar.visibility = View.INVISIBLE
    }

    fun showProgressbar(){
        paginationProgressBar.visibility = View.VISIBLE
    }
    private fun setRecycleView(){
        newsAdapter = NewsAdapter()
        rvBreakingNews.apply {
            adapter = newsAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
}