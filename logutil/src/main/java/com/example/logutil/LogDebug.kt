package com.example.logutil

import android.util.Log

open class LogDebug {
    open fun showLog(tag:String, msg:String) {
        Log.d(tag, msg)
    }
}