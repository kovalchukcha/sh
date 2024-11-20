package layout

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.smarthouse.AddDevice
import com.example.smarthouse.R

class DeviceAdapter  (private val data: Array<String>, private val dataopis: Array<String>, private val typeData:Array<Int>) : RecyclerView.Adapter<DeviceAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var TitleText: TextView = itemView.findViewById(R.id.acc22)
        var Image: ImageView= itemView.findViewById(R.id.acc2)
        var OpisText: TextView = itemView.findViewById(R.id.textView4)



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
            .inflate(R.layout.ustr, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val TitleText: String = data!![position]
        val OpisText : String = dataopis!![position]
        val Type: Int = typeData!![position]

        holder.TitleText?.setText(TitleText)

        holder.OpisText?.setText(TitleText)

        when (Type) {
            1 -> holder.Image?.setImageDrawable(R.drawable.icon11.toDrawable())
            2 -> holder.Image?.setImageDrawable(R.drawable.icon12.toDrawable())
            3 -> holder.Image?.setImageDrawable(R.drawable.icon13.toDrawable())
            4 -> holder.Image?.setImageDrawable(R.drawable.icon22.toDrawable())
            5 -> holder.Image?.setImageDrawable(R.drawable.icon14.toDrawable())
            6 -> holder.Image?.setImageDrawable(R.drawable.icon15.toDrawable())
            else -> {
                Log.e("ERROR", "Room image type is missing!")
            }
        }
    }
    override fun getItemCount(): Int {
        return data.size
    }



    interface ItemClickListener {
        fun onItemClick(view: View?, position: Int)
    }
}