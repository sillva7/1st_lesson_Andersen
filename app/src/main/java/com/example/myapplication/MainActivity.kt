package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewTest:TextView = findViewById(R.id.tVTest)
        val button:Button = findViewById(R.id.button)// for new branch

        textViewTest.text = "1st lesson"
        textViewTest.textSize = 20F // first commit

        button.text = "Knopa"
        button.setBackgroundColor(Color.GREEN)// first commit for button_branch
        button.setTextColor(Color.RED)// 2nd commit in button branch

        button.text = "New branch" // 3rd branch

    }
}