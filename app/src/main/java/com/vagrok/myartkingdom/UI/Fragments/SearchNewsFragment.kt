package com.vagrok.myartkingdom.UI.Fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.vagrok.myartkingdom.R
import com.vagrok.myartkingdom.UI.MainActivity
import com.vagrok.myartkingdom.UI.NewsViewModel

class SearchNewsFragment : Fragment(R.layout.fragment_search_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as MainActivity).viewModel
    }

}