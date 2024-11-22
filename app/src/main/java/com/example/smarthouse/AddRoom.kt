package com.example.smarthouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.postgrest.from
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class AddRoom : AppCompatActivity() {


  val supabase = createSupabaseClient(
          supabaseUrl = "https://jmsevptmyawvjbpyrxkn.supabase.co",
    supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imptc2V2cHRteWF3dmpicHlyeGtuIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MzE1Njk4MTYsImV4cCI6MjA0NzE0NTgxNn0.9vG7AHxnn5tGcjNsZv3HxtmyfpaQDKc3rMoAoeniu3A"
    ) {
        install(Postgrest)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_room)
        val addRec : RecyclerView = findViewById(R.id.addRec)
        val button : Button = findViewById(R.id.button10)
        button.setOnClickListener {
            val intent2 = Intent(this, FirstPage::class.java)
            startActivity(intent2)

        }
        MainScope().launch {
            val city = supabase.from("room_types").select().decodeList<Room>()
            addRec.layoutManager = GridLayoutManager(this@AddRoom, 3)
            addRec.adapter=RoomsTypeAdapter(city)
        }
    }

}