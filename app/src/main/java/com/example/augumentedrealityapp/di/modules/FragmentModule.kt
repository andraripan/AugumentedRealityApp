package com.example.augumentedrealityapp.di.modules

import com.example.augumentedrealityapp.ui.camera.CameraFragment
import com.example.augumentedrealityapp.ui.items.ItemsFragment
import com.example.augumentedrealityapp.ui.MainFragment
import com.example.augumentedrealityapp.ui.splash.SplashFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    internal abstract fun contributeMainFragment(): MainFragment

    @ContributesAndroidInjector
    internal abstract fun contributeSplashFragment(): SplashFragment

    @ContributesAndroidInjector
    internal abstract fun contributeItemsFragment(): ItemsFragment

    @ContributesAndroidInjector
    internal abstract fun contributeCameraFragment(): CameraFragment

}