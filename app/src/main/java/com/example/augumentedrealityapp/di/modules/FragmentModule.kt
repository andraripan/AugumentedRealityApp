package com.example.augumentedrealityapp.di.modules

import com.example.augumentedrealityapp.ui.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    internal abstract fun contributeMainFragment(): MainFragment

}