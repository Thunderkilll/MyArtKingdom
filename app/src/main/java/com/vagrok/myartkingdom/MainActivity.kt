package com.vagrok.myartkingdom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.Delay
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Coroutines
        GlobalScope.launch {
            Log.d(TAG , "this  coroutine opened a new thread : ${Thread.currentThread().name}")
            delay(1000L)
            Log.d(TAG , "After 3 seconds delay this coroutine is back from sleep mode")
        }
        Log.d(TAG , "another thread opened by the name : ${Thread.currentThread().name}")
    }



    //suspension function for coroutines

    suspend fun doNetworkCall():String {
        delay(1000L)
        return "thread has been delayed by 1 second"
    }
}