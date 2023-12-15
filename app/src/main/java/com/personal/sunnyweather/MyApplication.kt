package com.personal.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @author wang
 * @description:
 * @date :2023/5/24
 */
class MyApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "m7RozXPUcA0eMcSL"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}