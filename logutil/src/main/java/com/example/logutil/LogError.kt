package com.example.logutil

import android.util.Log

class LogError {
    companion object {
        fun showLog(tag:String, msg:String) {
            Log.e(tag, msg)
        }
    }
}