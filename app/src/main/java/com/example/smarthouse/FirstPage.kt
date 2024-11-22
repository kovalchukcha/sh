package com.example.smarthouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        val datasetDevices = arrayOf("Спальня", "Ванная", "Зал", "Гостиная")
       val datasetopDevices = arrayOf("Скорость", "мощность", "Яркость", "Теплота")
        val datasetDeviceType = arrayOf(1, 2, 3, 4)

        val recyclerViewDevices: RecyclerView = findViewById(R.id.recyclerViewRoom)
        recyclerViewDevices.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,true)

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