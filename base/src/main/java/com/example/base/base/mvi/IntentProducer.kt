package com.example.base.base.mvi

import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

interface IntentProducer<T : Intent> {
    val intents: Flow<T>
    suspend fun produce(intent: T)
}

/**
 * IntentProducer implemented using Kotlin Coroutines
 */
class ChannelIntentProducer<T : Intent> : IntentProducer<T> {

    private val channel = Channel<T>(Channel.BUFFERED)

    override val intents: Flow<T> get() = channel.receiveAsFlow()

    override suspend fun produce(intent: T) {
        channel.send(intent)
    }
}

fun <I : Intent, F> F.intent(intent: I)
        where F : Fragment, F : IntentProducer<I> {
    lifecycleScope.launch { produce(intent) }
}

