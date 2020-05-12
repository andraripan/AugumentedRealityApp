package com.example.augumentedrealityapp.ui.camera

import com.example.base.base.ui.BaseFragment
import com.example.augumentedrealityapp.R
import com.example.augumentedrealityapp.ui.camera.CameraViewModel
import com.example.augumentedrealityapp.ui.splash.SplashIntent
import com.example.augumentedrealityapp.ui.splash.SplashState
import com.example.base.base.mvi.MVIView
import javax.inject.Inject


class CameraFragment : MVIView<CameraState, CameraIntent>() {
    override val contentLayoutResource: Int = R.layout.fragment_camera

    override fun consume(state: CameraState) {
        TODO("Not yet implemented")
    }
}