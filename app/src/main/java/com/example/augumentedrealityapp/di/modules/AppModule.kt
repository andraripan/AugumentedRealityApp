package com.example.augumentedrealityapp.di.modules

import com.example.base.base.di.modules.GenericAppModule
import dagger.Module

@Module(includes = [ViewModelModule::class])
abstract class AppModule : GenericAppModule()