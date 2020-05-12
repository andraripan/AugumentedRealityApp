package com.example.augumentedrealityapp.ui.items

import com.example.augumentedrealityapp.ui.splash.SplashState
import com.example.base.base.mvi.State

data class ItemsState(val navDirection: NavDirection?
) : State {
    enum class NavDirection { TO_MAIN_SCREEN }
    companion object {
        val INITIAL = ItemsState(
            navDirection = null
        )
    }
}