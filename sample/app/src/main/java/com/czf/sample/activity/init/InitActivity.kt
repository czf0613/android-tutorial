package com.czf.sample.activity.init

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.czf.sample.R
import com.czf.sample.databinding.ActivityInitBinding

class InitActivity : AppCompatActivity() {
    private lateinit var dataBinding: ActivityInitBinding
    private lateinit var viewModel: InitActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_init)
        viewModel = InitActivityViewModel()
        dataBinding.vm = viewModel
    }
}