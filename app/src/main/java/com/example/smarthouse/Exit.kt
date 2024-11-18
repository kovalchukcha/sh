package com.example.smarthouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Exit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exit)

        val button : Button = findViewById(R.id.buttonExit)
        button.setOnClickListener{
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)

    }
}
}