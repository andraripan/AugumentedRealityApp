package com.example.augumentedrealityapp.ui.items

import com.example.base.base.mvi.FlowInteractor
import com.example.base.base.mvi.MVICoroutineViewModel
import javax.inject.Inject

class ItemsViewModel @Inject constructor(): MVICoroutineViewModel<ItemsState, ItemsIntent, ItemsChange>(
    ItemsState.INITIAL)  {
    override suspend fun mutate(state: ItemsState, change: ItemsChange): ItemsState {
        TODO("Not yet implemented")
    }

    override val consumer: FlowInteractor<ItemsIntent, ItemsChange>
        get() = TODO("Not yet implemented")
}