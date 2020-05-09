package com.example.augumentedrealityapp.di.modules

import androidx.lifecycle.ViewModelProvider
import com.example.base.base.ui.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}