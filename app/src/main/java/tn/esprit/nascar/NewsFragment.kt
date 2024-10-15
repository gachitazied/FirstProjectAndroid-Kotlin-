package tn.esprit.nascar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import tn.esprit.nascar.databinding.FragmentNewsBinding

//TODO 4 Change this class to a fragment and use binding to inflate fragment_news.xml

class NewsFragment: Fragment() {
    private var _binding: FragmentNewsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1. Get a reference to the RecyclerView
        val recyclerView: RecyclerView = binding.recyclerView
        // 2. Set the LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        // 3. Create and set the Adapter
        val newsList = listOf(
            News(R.drawable.ic_news1, getString(R.string.news1), getString(R.string.newsDesc1)),
            News(R.drawable.ic_news2, getString(R.string.news2), getString(R.string.newsDesc2)),
            News(R.drawable.ic_news3, getString(R.string.news3), getString(R.string.newsDesc3))
        )
        val itemAdapter = AdapterNews(newsList)
        recyclerView.adapter = itemAdapter
    }




}