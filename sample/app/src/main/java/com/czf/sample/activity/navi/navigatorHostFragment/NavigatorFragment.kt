package com.czf.sample.activity.navi.navigatorHostFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.czf.sample.databinding.FragmentNavigatorBinding

class NavigatorFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentNavigatorBinding.inflate(inflater)
        val vm = NavigatorViewModel(this)
        binding.vm = vm

        return binding.root
    }
}