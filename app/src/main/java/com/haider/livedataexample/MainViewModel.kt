package com.haider.livedataexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val factsLiveDataObj = MutableLiveData<String>("This is a fact")

    val factsLiveData: LiveData<String>
        get() = factsLiveDataObj

    fun updateLiveData() {
        factsLiveDataObj.value = "Another"
    }

}