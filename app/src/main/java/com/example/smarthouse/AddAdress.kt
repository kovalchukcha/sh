package com.example.smarthouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AddAdress : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_adress)

                val editTextAddress: EditText = findViewById(R.id.editTextHome)
                val buttonSave: Button = findViewById(R.id.buttonSave)

                buttonSave.setOnClickListener {
                    val inputText = editTextAddress.text.toString()
                    val regex = Regex("""^.*\s*,\s*ul\.\s*.*\s*,\s*d\.\s*\d+$""")

                    if (regex.matches(inputText)) {

                        val address = editTextAddress.text.toString()
                        val intent = Intent(this, FirstPage::class.java)
                        intent.putExtra("address", address)
                        startActivity(intent)

                        startActivity(intent)
                    } else {

                        Toast.makeText(
                            this,
                            "Неверный формат адреса. Введите адрес в формате:\nГород, ul. Улица, d. Номер дома",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
            }
        }
