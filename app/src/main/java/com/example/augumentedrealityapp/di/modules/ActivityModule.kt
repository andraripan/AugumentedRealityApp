package com.example.augumentedrealityapp.di.modules

import com.example.augumentedrealityapp.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector(modules = [FragmentModule::class])
    internal abstract fun contributesMainActivity(): MainActivity
}
