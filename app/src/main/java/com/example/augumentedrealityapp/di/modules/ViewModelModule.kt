package com.example.augumentedrealityapp.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.augumentedrealityapp.ui.camera.CameraViewModel
import com.example.augumentedrealityapp.ui.items.ItemsViewModel
import com.example.augumentedrealityapp.ui.splash.SplashViewModel
import com.example.base.base.di.util.ViewModelKey
import com.example.base.base.ui.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    internal abstract fun bindSplashViewModel(splashViewModel: SplashViewModel): ViewModel


    @Binds
    @IntoMap
    @ViewModelKey(ItemsViewModel::class)
    internal abstract fun bindItemsViewModel(itemsViewModel: ItemsViewModel): ViewModel


    @Binds
    @IntoMap
    @ViewModelKey(CameraViewModel::class)
    internal abstract fun bindCameraViewModel(cameraViewModel: CameraViewModel): ViewModel

}