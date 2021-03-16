package com.czf.sample.activity.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.czf.sample.R
import com.czf.sample.activity.init.InitActivityViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<com.czf.sample.databinding.ActivityMainBinding>(
                this,
                R.layout.activity_main
            )
        val vm = MainActivityViewModel(this)
        binding.vm = vm
    }
}