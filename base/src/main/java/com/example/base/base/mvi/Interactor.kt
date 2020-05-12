package com.example.base.base.mvi

import kotlinx.coroutines.flow.Flow

interface Interactor<I: Intent, C: Change> {
    operator fun invoke(intent: I): Flow<C>
}