package com.example.luckynumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LuckyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)

        val b2 = findViewById<Button>(R.id.btnLucky)
        val txt1 = findViewById<TextView>(R.id.text1)
        val luck = findViewById<TextView>(R.id.luckyNum)
    }
}