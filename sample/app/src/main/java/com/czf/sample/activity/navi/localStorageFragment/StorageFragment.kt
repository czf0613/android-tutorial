package com.czf.sample.activity.navi.localStorageFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.czf.sample.databinding.FragmentStorageBinding

class StorageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentStorageBinding.inflate(inflater)
        return binding.root
    }
}