package com.example.augumentedrealityapp.ui.splash

import com.example.base.base.mvi.Change

sealed class SplashChange : Change {
    object GoToMain: SplashChange()
    object ClearNavigation : SplashChange()
}