package com.example.smarthouse

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.TextView

class Code : AppCompatActivity() {

    private val numbers= mutableListOf<Int>()
    private lateinit var dot1: EditText
    private lateinit var dot2: EditText
    private lateinit var dot3: EditText
    private lateinit var dot4: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code)

        dot1 = findViewById(R.id.dot1)
        dot2 = findViewById(R.id.dot2)
        dot3 = findViewById(R.id.dot3)
        dot4 = findViewById(R.id.dot4)

        dot1.isFocusable=false
        dot2.isFocusable=false
        dot3.isFocusable=false
        dot4.isFocusable=false

        val buttons= listOf<Button>(
            findViewById(R.id.button1),
            findViewById(R.id.button2),
            findViewById(R.id.button3),
            findViewById(R.id.button4),
            findViewById(R.id.button5),
            findViewById(R.id.button6),
            findViewById(R.id.button7),
            findViewById(R.id.button8),
            findViewById(R.id.button9),
           )

        buttons.forEach{button -> button.setOnClickListener{
            if(numbers.size<4)
            {
                val number = button.text.toString().toInt()
                numbers.add(number)
                updateDots()
            }
            if(numbers.size==4)
            {
                val intent = Intent (this,AddAdress::class.java)
                startActivity(intent)
            }
        } }

    }

    private fun updateDots() {
       val dotDrawable = resources.getDrawable(R.drawable.dot, null)
        when (numbers.size){
        1 -> dot1.setBackground(dotDrawable)
            2->dot2.setBackground(dotDrawable)
                3-> dot3.setBackground(dotDrawable)
                    4->dot3.setBackground(dotDrawable)

        }
    }




}