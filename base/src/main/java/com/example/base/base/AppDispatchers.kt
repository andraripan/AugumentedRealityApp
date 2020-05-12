package com.example.base.base

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.asCoroutineDispatcher
import java.util.concurrent.Executors

object AppDispatchers {
    val viewModel : CoroutineDispatcher = Executors.newCachedThreadPool().asCoroutineDispatcher()
}

val Dispatchers.ViewModel : CoroutineDispatcher
get() = AppDispatchers.viewModel