package com.example.smarthouse

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button  = findViewById(R.id.mButton)
        button.setOnClickListener{
            val intent = Intent(this, Code::class.java)
            startActivity(intent)
        }

        val button2 : Button = findViewById(R.id.buttonReg)
        button2.setOnClickListener{
            val intent2 = Intent(this, Registration::class.java)
            startActivity(intent2)
        }

    }
}