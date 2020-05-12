package com.example.augumentedrealityapp.ui.splash

import com.example.base.base.mvi.FlowInteractor
import com.example.base.base.mvi.MVICoroutineViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class SplashViewModel @Inject constructor() : MVICoroutineViewModel<SplashState, SplashIntent, SplashChange>(SplashState.INITIAL) {

    override val consumer: FlowInteractor<SplashIntent, SplashChange> = {intent ->
        when(intent){
            SplashIntent.Navigated -> flowOf(SplashChange.ClearNavigation)
            SplashIntent.NavigateToMainPage -> flow {
                delay(3000)
                SplashChange.GoToMain
            }
        }
    }

    override suspend fun mutate(state: SplashState, change: SplashChange): SplashState = when(change){
        SplashChange.GoToMain ->
            state.copy(
                navDirection = SplashState.NavDirection.TO_MAIN_SCREEN
            )
        SplashChange.ClearNavigation ->
            state.copy(
                navDirection = null
            )
    }
}