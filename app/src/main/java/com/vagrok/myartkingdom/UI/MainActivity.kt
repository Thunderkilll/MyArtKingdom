package com.vagrok.myartkingdom.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.vagrok.myartkingdom.ArtAdapter
import com.vagrok.myartkingdom.R
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"
    private lateinit var artAdapter: ArtAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Coroutines : main thread for UI
        GlobalScope.launch(Dispatchers.Main) {



        }
        //Coroutines IO for networking and data operation
        GlobalScope.launch(Dispatchers.IO) {

            Log.d(TAG , "this  coroutine opened a new thread : ${Thread.currentThread().name} \nFor Networking and data operation")
            val answer = doNetworkCall()

            withContext(Dispatchers.Main){

            }
        }


        runBlocking {
            Log.d(TAG , "Before run blocking ")
        }


    }



/*
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