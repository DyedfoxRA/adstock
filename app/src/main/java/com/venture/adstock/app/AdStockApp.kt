package com.venture.adstock.app

import android.app.Application
import com.venture.network.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AdStockApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@AdStockApp)
            modules(networkModule)
        }
    }
}