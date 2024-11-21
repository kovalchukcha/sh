package com.example.smarthouse

import android.annotation.SuppressLint
import android.content.Intent
import android.net.http.HttpResponseCache.install
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest

class MainActivity : AppCompatActivity() {

    val supabase = createSupabaseClient(
        supabaseUrl = "https://jmsevptmyawvjbpyrxkn.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imptc2V2cHRteWF3dmpicHlyeGtuIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MzE1Njk4MTYsImV4cCI6MjA0NzE0NTgxNn0.9vG7AHxnn5tGcjNsZv3HxtmyfpaQDKc3rMoAoeniu3A"
    ) {
        install(Auth)
        install(Postgrest)
        //install other modules


    }
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton:  Button
    private lateinit var errorTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailEditText = findViewById(R.id.email)
        passwordEditText = findViewById(R.id.password)

            val emailEditText = findViewById<EditText>(R.id.email)
            val passwordEditText = findViewById<EditText>(R.id.password)
            val loginButton = findViewById<Button>(R.id.mButton)
            val registerButton = findViewById<Button>(R.id.buttonReg)

            loginButton.setOnClickListener {
                val email = emailEditText.text.toString().trim()
                val password = passwordEditText.text.toString().trim()

                if (isValidEmail(email) && isValidPassword(password)) {

                    Toast.makeText(this, "Вход выполнен!", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, Code::class.java)
                    startActivity(intent)
                } else {

                    Toast.makeText(this, "Неверный email или пароль", Toast.LENGTH_SHORT).show()
                }
            }

            registerButton.setOnClickListener {

                val intent = Intent(this, Registration::class.java)
                startActivity(intent)
            }
        }

        private fun isValidEmail(email: String): Boolean {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }

        private fun isValidPassword(password: String): Boolean {
            return password.length >= 6

        }


    }

