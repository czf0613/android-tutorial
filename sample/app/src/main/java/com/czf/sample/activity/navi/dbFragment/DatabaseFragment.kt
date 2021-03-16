package com.czf.sample.activity.navi.dbFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.czf.sample.databinding.FragmentDatabaseBinding

class DatabaseFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentDatabaseBinding.inflate(inflater)
        return binding.root
    }
}