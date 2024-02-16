package com.example.luckynumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LuckyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)

        val b2 = findViewById<Button>(R.id.btnLucky)
        val txt1 = findViewById<TextView>(R.id.text1)
        val luck = findViewById<TextView>(R.id.luckyNum)

        //Receive via function
        var user_name = receiveUser()
        Toast.makeText(this, "" + user_name, Toast.LENGTH_LONG).show()
    }

    fun receiveUser():String{
        var bundle:Bundle? = intent.extras
        var username = bundle?.get("name").toString()
        return username
    }
}