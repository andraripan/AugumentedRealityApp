package com.example.augumentedrealityapp.ui.camera

import com.example.augumentedrealityapp.ui.items.ItemsState
import com.example.base.base.mvi.State

data class CameraState(
    val navDirection: ItemsState.NavDirection?

) : State {
    enum class NavDirection { TO_MAIN_SCREEN }
    companion object {
        val INITIAL = CameraState(
            navDirection = null
        )
    }
}