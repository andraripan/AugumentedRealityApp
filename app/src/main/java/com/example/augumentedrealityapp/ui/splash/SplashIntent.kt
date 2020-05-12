package com.example.augumentedrealityapp.ui.splash

import com.example.base.base.mvi.Intent

sealed class SplashIntent : Intent {
    object NavigateToMainPage : SplashIntent()
    object Navigated: SplashIntent()
}