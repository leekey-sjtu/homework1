package com.bytedance.jstu.homework

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvHello = findViewById<TextView>(R.id.tv_hello)
        tvHello.setOnClickListener {
            //tvHello.text = "Try to click me!"
            tvHello.text = "Click again!"
            Log.d("MainActivity", "You Clicked me!")
        }
        Log.d( "MainActivity", "App Start")
    }
}