package com.czf.sample.activity.navi.navigatorHostFragment

import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.czf.sample.R

class NavigatorViewModel(private val fragment: Fragment) {
    fun goToDB(view: View) {
        val controller =
            NavHostFragment.findNavController(fragment)
        controller.navigate(R.id.action_navigatorFragment_to_databaseFragment)
    }

    fun goToLocal(view: View) {
        val controller =
            NavHostFragment.findNavController(fragment)
        controller.navigate(R.id.action_navigatorFragment_to_storageFragment)
    }

    fun goToWeb(view: View) {
        val controller =
            NavHostFragment.findNavController(fragment)
        controller.navigate(R.id.action_navigatorFragment_to_networkFragment)
    }
}