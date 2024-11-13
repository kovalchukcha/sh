package com.example.smarthouse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.LinearLayout

class Code : AppCompatActivity() {

    private var numberCount = 0
    private lateinit var dotsContainer: GridLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code)



    }
    public fun onClick(view: View){
        val button : Button = findViewById(view.id)
        val number = button.text
        Log.e("!", number.toString())
        numberCount ++

/*        val dotView = View(this)
        val params = LinearLayout.LayoutParams(20,20)
        dotView.layoutParams=params
        dotView.setBackgroundResource(R.drawable.dot)
        dotsContainer.addView(dotView)*/

/*        val button : Button = view.id
        for (i in 1..9){
            if (button.text == i.toString()){
                addNumber(i)
            }

*//*            val buttonId = resources.getIdentifier("button_$i", "id", "packageName")
            val button: Button = findViewById(buttonId)
            button.setOnClickListener{addNumber(i)}*//*
        }*/
    }

/*    private fun addNumber(number: Int) {
        numberCount ++
        val dotView = View(this)
        val params = LinearLayout.LayoutParams(20,20)
        dotView.layoutParams=params
        dotView.setBackgroundResource(R.drawable.dot)
        dotsContainer.addView(dotView)

    }*/
}