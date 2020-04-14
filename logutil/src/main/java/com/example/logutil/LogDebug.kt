package com.example.logutil

import android.util.Log

class LogDebug {
    companion object {
        fun showLog(tag:String, msg:String) {
            Log.d(tag, msg)
        }
    }
}