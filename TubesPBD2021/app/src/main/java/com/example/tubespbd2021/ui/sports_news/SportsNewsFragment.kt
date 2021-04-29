package com.example.tubespbd2021.ui.sports_news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.tubespbd2021.R

class SportsNewsFragment : Fragment() {

    private lateinit var sportsNewsViewModel: SportsNewsViewModel;

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        sportsNewsViewModel =
                ViewModelProvider(this).get(SportsNewsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_sports_news, container, false)
        val textView: TextView = root.findViewById(R.id.text_sports_news)
        sportsNewsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}