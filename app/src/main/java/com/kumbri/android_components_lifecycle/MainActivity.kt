package com.kumbri.android_components_lifecycle

import FragmentOne
import FragmentTwo
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val TAG = "Lifecycle : "
    val manager = supportFragmentManager
    var isFragmentOneLoaded = true

   override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            Log.d(TAG, "MainActivity " + "onCreate")

            val callActivity = findViewById<Button>(R.id.btn_call_second_activity)
            val change = findViewById<Button>(R.id.btn_fragment_change)
            ShowFragmentOne()

            callActivity.setOnClickListener { launchIntent() }

            change.setOnClickListener {
                if (isFragmentOneLoaded)
                    ShowFragmentTwo()
                else
                    ShowFragmentOne()
            }
        }

        fun launchIntent() {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        fun ShowFragmentOne() {
            val transaction = manager.beginTransaction()
            val fragment = FragmentOne()
            transaction.add(R.id.fragment_container, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
            isFragmentOneLoaded = true
        }

        fun ShowFragmentTwo() {
            val transaction = manager.beginTransaction()
            val fragment = FragmentTwo()
            transaction.add(R.id.fragment_container, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
            isFragmentOneLoaded = false
        }

        override fun onStart() {
            super.onStart()
            Log.d(TAG, "MainActivity " + "onStart")

        }

        override fun onResume() {
            super.onResume()
            Log.d(TAG, "MainActivity " + "onResume")

        }

        override fun onPause() {
            super.onPause()
            Log.d(TAG, "MainActivity " + "onPause")
        }


        override fun onRestart() {
            super.onRestart()
            Log.d(TAG, "MainActivity " + "onRestart")
        }

        override fun onStop() {
            super.onStop()
            Log.d(TAG, "MainActivity " + "onStop")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d(TAG, "MainActivity " + "onDestroy")
        }
    }