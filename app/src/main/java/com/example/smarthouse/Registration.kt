package com.example.smarthouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Registration : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton:  Button
    private lateinit var usernameEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val usernameEditText = findViewById<EditText>(R.id.user)
        val emailEditText = findViewById<EditText>(R.id.userEmail)
        val passwordEditText = findViewById<EditText>(R.id.password1)
        val registerButton = findViewById<Button>(R.id.materialButton2)
        val loginButton = findViewById<Button>(R.id.mButton3)

        registerButton.setOnClickListener {
            val username = usernameEditText.text.toString().trim()
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (isValidUsername(username) && isValidEmail(email) && isValidPassword(password)) {
                Toast.makeText(this, "Регистрация прошла успешно!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Code::class.java)
                startActivity(intent)
            } else {

                Toast.makeText(this, "Введены некорректные данные!", Toast.LENGTH_SHORT).show()
            }
        }

        loginButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    private fun isValidUsername(username: String): Boolean {
        return username.length >= 3
    }

    private fun isValidEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun isValidPassword(password: String): Boolean {
        return password.length >= 6
    }
}