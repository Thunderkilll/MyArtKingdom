package com.vagrok.myartkingdom.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.vagrok.myartkingdom.adapters.ArtAdapter
import com.vagrok.myartkingdom.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {


    private lateinit var artAdapter: ArtAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            setContentView(R.layout.activity_main)
            bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())



    }


/*
       //Coroutines : main thread for UI
        GlobalScope.launch(Dispatchers.Main) {

        }
        //Coroutines IO for networking and data operation
        GlobalScope.launch(Dispatchers.IO) {

            withContext(Dispatchers.Main){

            }
        }


        runBlocking {

        }

  //Coroutines : Default to populate lists big calculations
        GlobalScope.launch(Dispatchers.Default) {
            Log.d(TAG , "this  coroutine opened a new thread : ${Thread.currentThread().name} \n for calculations")



        }
        //Coroutines
        GlobalScope.launch(newSingleThreadContext("Testing thread")) {
            Log.d(TAG , "this  coroutine opened a new thread : ${Thread.currentThread().name}")

        }*/
    //suspension function for coroutines

    suspend fun doNetworkCall():String {
        delay(1000L)
        return "Main thread has been delayed by 1 second"
    }
}