package com.example.base.base.flow

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.receiveAsFlow

class Cache<T>(initialValue: T? = null) {

    private val data = Channel<T>(Channel.CONFLATED)

    private var lastValue: T? = initialValue

    /**
     * Checks if we have ever written in the Cache
     */
    fun hasValue() = lastValue != null

    /**
     * Update the cache value
     */
    suspend fun updateValue(value: T) {
        data.send(value)
    }

    /**
     * Access the cache value as a hot stream. It also takes care of memorizing the last value
     * in case the flow is canceled.
     */
    val value: Flow<T>
        get() = data.receiveAsFlow()
            .onEach { lastValue = it }
            .onStart { lastValue?.let { emit(it) } }
}
