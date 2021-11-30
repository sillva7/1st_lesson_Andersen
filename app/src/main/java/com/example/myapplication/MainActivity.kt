package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textViewTest:TextView = findViewById(R.id.tVTest)
        textViewTest.text = "1st lesson"
        textViewTest.textSize = 20F // first commit
    }
}