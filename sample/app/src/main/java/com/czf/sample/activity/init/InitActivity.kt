package com.czf.sample.activity.init

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.czf.sample.R

class InitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<com.czf.sample.databinding.ActivityInitBinding>(
                this,
                R.layout.activity_init
            )
        val vm = InitActivityViewModel(this)
        binding.vm = vm
    }
}