package com.czf.sample.activity.navi.networkFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.czf.sample.databinding.FragmentNetworkBinding

class NetworkFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentNetworkBinding.inflate(inflater)
        return binding.root
    }
}