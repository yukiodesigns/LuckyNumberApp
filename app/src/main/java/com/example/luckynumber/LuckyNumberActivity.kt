package com.example.luckynumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

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

        //Random Number
        var random_num = randomNum()
        luck.setText(""+random_num)

        //Sharing
        b2.setOnClickListener(){
            shareResults(user_name, random_num)
        }

    }

    //Getting username
    fun receiveUser():String{
        var bundle:Bundle? = intent.extras
        var username = bundle?.get("name").toString()
        return username
    }

    //Random Number
    fun randomNum():Int{
        val random = Random.nextInt(1000)
        return random
    }

    //Share results
    fun shareResults(username:String, num:Int){
        //Implicit
        var i = Intent(Intent.ACTION_SEND)
        i.setType("text/plain")
        i.putExtra(Intent.EXTRA_SUBJECT, "$username is lucky today")
        i.putExtra(Intent.EXTRA_TEXT, "His lucky number is $num")
        startActivity(i)
    }
}