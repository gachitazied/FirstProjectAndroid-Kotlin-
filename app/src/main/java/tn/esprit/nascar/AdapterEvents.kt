package tn.esprit.nascar

import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView

class AdapterEvents(private val eventsList: List<Events>) : RecyclerView.Adapter<EventsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_events, parent, false)
        return EventsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return eventsList.size
    }

    override fun onBindViewHolder(holder: EventsViewHolder, position: Int) {
        val events = eventsList[position]
        holder.imgEvents.setImageResource(events.imgEvents)
        holder.title.text = events.eventTitle
        holder.date.text = events.eventDate
    }
}