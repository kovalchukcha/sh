package com.example.smarthouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Account : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val button : Button = findViewById(R.id.mButton)
        button.setOnClickListener{
            val intent2 = Intent(this, FirstPage::class.java)
            startActivity(intent2)}
    }
}