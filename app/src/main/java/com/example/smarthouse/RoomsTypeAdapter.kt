package com.example.smarthouse

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlin.io.path.fileVisitor

class RoomsTypeAdapter(private val rooms:List<Room>) : RecyclerView.Adapter<RoomsTypeAdapter.RoomViewHolder>() {

    class RoomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val typeback : LinearLayout =  itemView.findViewById(R.id.backType)
        val nameType : TextView =  itemView.findViewById(R.id.nameType)
        val imageType : ImageView =  itemView.findViewById(R.id.imageType)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.typeitem,parent,false)
        return RoomViewHolder(view)
    }

    override fun getItemCount(): Int = rooms.size

    override fun onBindViewHolder(holder: RoomViewHolder, position: Int) {
     val room = rooms[position]
        holder.nameType.text =room.type

        GlideApp.with(holder.itemView.context).load(room.icon).into(holder.imageType)
        Log.d("ImageLoader", "Loading image from URL: $room.iconUrl")

    }

}