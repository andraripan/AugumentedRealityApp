package com.example.augumentedrealityapp.di.components

import android.app.Application
import com.example.augumentedrealityapp.App
import com.example.augumentedrealityapp.di.modules.ActivityModule
import com.example.augumentedrealityapp.di.modules.AppModule
import com.example.base.base.di.components.IAppComponent
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityModule::class])
interface AppComponent : IAppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}
