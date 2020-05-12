package com.example.augumentedrealityapp.ui.splash

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.augumentedrealityapp.R
import com.example.base.base.mvi.*
import dagger.android.support.AndroidSupportInjection
import kotlinx.coroutines.ExperimentalCoroutinesApi

class SplashFragment : MVIView<SplashState, SplashIntent>() {
    override val contentLayoutResource: Int = R.layout.fragment_splash

    @ExperimentalCoroutinesApi
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel(SplashViewModel::class)
        intent(SplashIntent.NavigateToMainPage)
    }

    override fun consume(state: SplashState) {
        with(state){
            navDirection?.let { navigate(it) }
        }
    }

    private fun navigate(navDirection: SplashState.NavDirection) = when(navDirection){
        SplashState.NavDirection.TO_MAIN_SCREEN -> navigateToMain()
    }

    private fun navigateToMain(){
        findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToMainFragment())
    }
}