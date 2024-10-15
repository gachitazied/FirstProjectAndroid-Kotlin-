package tn.esprit.nascar

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
    val imgNews = itemView.findViewById<ImageView>(R.id.newsImage1)
    val title = itemView.findViewById<TextView>(R.id.newsTitle1)
    val desc = itemView.findViewById<TextView>(R.id.eventDate)
}