package com.czf.sample.activity.navi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.czf.sample.R

class NaviActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<com.czf.sample.databinding.ActivityNaviBinding>(
            this,
            R.layout.activity_navi
        )
    }

    override fun onSupportNavigateUp() = findNavController(R.id.host_fragment).navigateUp()
}