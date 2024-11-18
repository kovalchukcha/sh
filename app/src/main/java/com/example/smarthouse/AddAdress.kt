package com.example.smarthouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddAdress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_adress)

        val button : Button = findViewById(R.id.buttonSave)
        button.setOnClickListener{
            val intent2 = Intent(this, FirstPage::class.java)
            startActivity(intent2)}
    }
}