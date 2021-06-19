package com.kumbri.android_components_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    val TAG = "Lifecycle : "
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(TAG, "SecondActivity " + "onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "SecondActivity " + "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "SecondActivity " + "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "SecondActivity " + "onPause")
    }


    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "SecondActivity " + "onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "SecondActivity " + "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "SecondActivity " + "onDestroy")
    }
}