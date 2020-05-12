package com.example.base.base.extensions

import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch


fun <T> asyncFlow(block: suspend FlowCollector<T>.() -> Unit): Flow<T> = channelFlow {
    coroutineScope {
        launch {
            flow(block).collect { send(it) }
        }
    }
    awaitClose()
}
