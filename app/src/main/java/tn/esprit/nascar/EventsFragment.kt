package tn.esprit.nascar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import tn.esprit.nascar.databinding.FragmentEventsBinding
import tn.esprit.nascar.databinding.FragmentNewsBinding

//TODO 5 Change this class to a fragment and use binding to inflate fragment_events.xml

class EventsFragment: Fragment() {

    private var _binding: FragmentEventsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEventsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = binding.recyclerViewEvent

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

    val eventsList = listOf(
        Events(R.drawable.ic_event1, getString(R.string.event1), getString(R.string.eventDate1)),
        Events(R.drawable.ic_event2, getString(R.string.event2), getString(R.string.eventDate2)),
        Events(R.drawable.ic_event3, getString(R.string.event3), getString(R.string.eventDate3)),
        Events(R.drawable.ic_event4, getString(R.string.event4), getString(R.string.eventDate4)),

    )


        val itemAdapter = AdapterEvents(eventsList)
        recyclerView.adapter = itemAdapter

    }
}