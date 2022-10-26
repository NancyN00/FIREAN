package com.example.firean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class Offer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_offer)
        Log.i("MYTAG", "Offer ; OnCreate")
        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)
        val message = "$userName , you will get free access for all month"
        textView.text = message
    }
    override fun onStart() {
        super.onStart()

        Log.i("MYTAG", "Offer ; OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MYTAG", "Offer ; OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MYTAG", "Offer ; OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MYTAG", "Offer ; OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAG", "Offer ; OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAG", "Offer ; OnRestart")
    }

}