package com.example.base.base.di.modules

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

@Module(
    includes = [ApiModule::class, DbModule::class]
)
abstract class GenericAppModule {
    @Binds
    abstract fun bindContext(application: Application) : Context
    //TODO add repository here
}