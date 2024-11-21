package com.example.smarthouse

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView


class FirstClassAdapter (private val data: Array<String>, private val dataopis: Array<String>, private val typeData:Array<Int>) : RecyclerView.Adapter<FirstClassAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var TitleText: TextView = itemView.findViewById(R.id.room_device_text)
        var Image: ImageView = itemView.findViewById(R.id.imageView3)
     //   var OpisText: TextView = itemView.findViewById(R.id.textView4)
        var mClickListener: ItemClickListener? = null
        public fun setOnClickListener(clickListener: ItemClickListener)
        {
            mClickListener = clickListener
        }
        override fun onClick(p0: View?) {
            mClickListener?.onItemClick(p0, adapterPosition)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item1, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val TitleText: String = data!![position]
        val OpisText : String = dataopis!![position]
        val Type: Int = typeData[position]

        holder.TitleText?.setText(TitleText)

    }
    override fun getItemCount(): Int {
        return data.size
    }
    interface ItemClickListener {
        fun onItemClick(view: View?, position: Int)
    }
}