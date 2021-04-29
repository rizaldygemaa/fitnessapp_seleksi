package com.example.tubespbd2021.ui.sports_news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SportsNewsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is sports news Fragment"
    }
    val text: LiveData<String> = _text
}