package com.example.smarthouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddRoom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_room)

        val button : Button = findViewById(R.id.button10)
        button.setOnClickListener {
            val intent2 = Intent(this, FirstPage::class.java)
            startActivity(intent2)
        }
    }
}