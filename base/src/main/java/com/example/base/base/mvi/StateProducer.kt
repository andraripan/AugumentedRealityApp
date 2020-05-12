package com.example.base.base.mvi

import androidx.lifecycle.LiveData

interface StateProducer<I: Intent, S: State> {
    fun getState(producer: IntentProducer<I>): LiveData<S>
}