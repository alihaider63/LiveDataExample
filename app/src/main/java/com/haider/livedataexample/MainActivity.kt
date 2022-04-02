package com.haider.livedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.haider.livedataexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        mainViewModel.factsLiveData.observe(this, Observer {
            binding.textView.text = it
        })

        binding.updateBtn.setOnClickListener {
            mainViewModel.updateLiveData()
        }

    }
}