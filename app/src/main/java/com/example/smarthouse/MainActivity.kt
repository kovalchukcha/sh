package com.example.smarthouse

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton:  Button
    private lateinit var errorTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailEditText = findViewById(R.id.email)
        passwordEditText = findViewById(R.id.password)
       // loginButton = findViewById(R.id.mButton)

    //    loginButton.setOnClickListener{ validateInput()}

        val button : Button = findViewById(R.id.mButton)
        button.setOnClickListener{
            val intent2 = Intent(this, Code::class.java)
            startActivity(intent2)
        }

        val button2 : Button = findViewById(R.id.buttonReg)
        button2.setOnClickListener{
            val intent2 = Intent(this, Registration::class.java)
            startActivity(intent2)
        }

    }

 /*   private fun validateInput() {
        val email=emailEditText.text.toString().trim()
        val password = passwordEditText.text.toString().trim()
        if (email.isEmpty()|| password.isEmpty())
        {
            showError ("Заполните все поля")
            return
        }

      //  if (isValidEmail(email))
        {
            showError ("Неккоректный адрес электронной почты")
        }

        val intent = Intent(this, Code::class.java)
        startActivity(intent)

    }

    private fun showError(message: String) {
        errorTextView.text = message
        errorTextView.visibility = View.VISIBLE

    }

   private fun isValidEmail(email: String) {
        return
        Patterns.EMAIL_ADDRESS.matcher(email).matches() && email.all{it.isLowerCase()||it.isDigit() }
    }
*/
}