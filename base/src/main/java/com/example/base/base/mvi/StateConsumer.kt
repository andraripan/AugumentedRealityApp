package com.example.base.base.mvi

interface StateConsumer<T: State> {
    fun consume(state: T)
}