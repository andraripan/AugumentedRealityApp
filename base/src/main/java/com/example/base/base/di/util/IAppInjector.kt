package com.example.base.base.di.util

import com.example.base.base.BaseApp
import com.example.base.base.di.components.IAppComponent

interface IAppInjector {
    fun init(app: BaseApp) : IAppComponent
}