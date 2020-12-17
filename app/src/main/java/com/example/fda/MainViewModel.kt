package com.example.fda

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {
    private var mResult = MutableLiveData<String>()
    var result = mResult
}