package com.example.luckynumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1 = findViewById<Button>(R.id.btn)
        val txt = findViewById<TextView>(R.id.textView)
        val editTxt = findViewById<EditText>(R.id.editText)

        //Passing Data with Explicit
        b1.setOnClickListener(){
            var username = editTxt.text

            var i :Intent = Intent(this, LuckyNumberActivity::class.java)
            //Pass data
            i.putExtra("name", username)
            startActivity(i)
        }
    }
}