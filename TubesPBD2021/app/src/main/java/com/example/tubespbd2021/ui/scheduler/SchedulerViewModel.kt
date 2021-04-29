package com.example.tubespbd2021.ui.scheduler

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SchedulerViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is scheduler Fragment"
    }
    val text: LiveData<String> = _text
}