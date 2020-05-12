package com.example.base.base.mvi

import kotlinx.coroutines.flow.Flow

interface IntentConsumer<I : Intent, C : Change> {
    val consumer: FlowInteractor<I, C>
}

//typealias FlowInteractor<I, C> = suspend FlowCollector<C>.(intent: I) -> Unit
typealias FlowInteractor<I, C> = suspend (intent: I) -> Flow<C>
