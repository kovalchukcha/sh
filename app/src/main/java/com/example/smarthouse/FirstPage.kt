package com.example.smarthouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        val button : Button = findViewById(R.id.button11)
        button.setOnClickListener{
            val intent2 = Intent(this, AccountUser::class.java)
            startActivity(intent2)
        }

            val button12 : Button = findViewById(R.id.button12)
            button12.setOnClickListener{
                val intent12 = Intent(this, AddRoom::class.java)
                startActivity(intent12)
        }
    }
}
