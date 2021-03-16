package com.czf.sample.activity.init

import android.content.Intent
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.czf.sample.activity.main.MainActivity

class InitActivityViewModel(private val activity: AppCompatActivity) {
    var cnt = 0

    fun addOne() {
        cnt++
        Log.v("CNT_WATCHER", "current cnt is $cnt.")
    }

    fun moveNext(view: View) {
        val intent = Intent(activity, MainActivity::class.java)
        activity.startActivity(intent)
    }
}