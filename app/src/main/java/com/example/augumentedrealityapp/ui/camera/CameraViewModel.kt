package com.example.augumentedrealityapp.ui.camera

import androidx.lifecycle.ViewModel
import com.example.augumentedrealityapp.ui.splash.SplashChange
import com.example.augumentedrealityapp.ui.splash.SplashIntent
import com.example.augumentedrealityapp.ui.splash.SplashState
import com.example.base.base.mvi.FlowInteractor
import com.example.base.base.mvi.MVICoroutineViewModel
import javax.inject.Inject

class CameraViewModel @Inject constructor() : MVICoroutineViewModel<CameraState, CameraIntent, CameraChange>(
    CameraState.INITIAL) {
    override suspend fun mutate(state: CameraState, change: CameraChange): CameraState {
        TODO("Not yet implemented")
    }

    override val consumer: FlowInteractor<CameraIntent, CameraChange>
        get() = TODO("Not yet implemented")
}