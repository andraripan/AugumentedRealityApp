package com.example.base.base

import android.app.Activity
import android.app.Application
import com.example.base.BuildConfig
import com.example.base.base.di.util.IAppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

abstract class BaseApp : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            // TODO maybe add Timber
        }
        appInjector().init(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingActivityInjector

    abstract fun appInjector(): IAppInjector
}