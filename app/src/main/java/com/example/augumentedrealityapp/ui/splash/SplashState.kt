package com.example.augumentedrealityapp.ui.splash

import com.example.base.base.mvi.State

data class SplashState(
    val navDirection: NavDirection?
) : State {
    enum class NavDirection { TO_MAIN_SCREEN }
    companion object {
        val INITIAL = SplashState(
            navDirection = null
        )
    }
}
