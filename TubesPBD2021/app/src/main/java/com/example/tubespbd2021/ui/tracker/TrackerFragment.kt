package com.example.tubespbd2021.ui.tracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.tubespbd2021.R
import com.example.tubespbd2021.ui.home.TrackerViewModel

class TrackerFragment : Fragment() {

    private lateinit var trackerViewModel: TrackerViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        trackerViewModel =
                ViewModelProvider(this).get(TrackerViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_tracker, container, false)
        val textView: TextView = root.findViewById(R.id.text_tracker)
        trackerViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}