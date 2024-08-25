package com.compose.practice

import android.app.Application
import org.various.player.PlayerConfig


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        PlayerConfig.init(this)
    }
}