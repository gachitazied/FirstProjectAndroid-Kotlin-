package tn.esprit.nascar

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EventsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imgEvents = itemView.findViewById<ImageView>(R.id.eventImage1)
    val title = itemView.findViewById<TextView>(R.id.eventTitle1)
    val date = itemView.findViewById<TextView>(R.id.eventDate)

}