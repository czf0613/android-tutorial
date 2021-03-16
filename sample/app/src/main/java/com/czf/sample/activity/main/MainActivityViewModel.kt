package com.czf.sample.activity.main

import android.content.Intent
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ObservableInt
import com.czf.sample.activity.navi.NaviActivity

class MainActivityViewModel(private val activity: AppCompatActivity) {
    var cnt = ObservableInt(0)

    fun addOne() {
        cnt.set(cnt.get() + 1)
        Log.v("CNT_WATCHER", "current cnt is ${cnt.get()}.")
    }

    fun moveBack(view: View) {
        activity.finish()
    }

    fun moveNext(view: View) {
        val intent = Intent(activity, NaviActivity::class.java)
        activity.startActivity(intent)
    }
}