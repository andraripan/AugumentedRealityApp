package com.example.augumentedrealityapp

import com.example.augumentedrealityapp.di.util.AppInjector
import com.example.base.base.BaseApp
import com.example.base.base.di.util.IAppInjector

class App: BaseApp() {
    override fun appInjector() = AppInjector
}