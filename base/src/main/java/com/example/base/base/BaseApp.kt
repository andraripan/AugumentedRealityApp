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
        appInjector().init(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingActivityInjector

    // Each app must provide it's own AppInjector so the Dagger tree is generated correctly
    abstract fun appInjector(): IAppInjector
}
