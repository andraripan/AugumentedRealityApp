package com.example.augumentedrealityapp.ui.items

import android.os.Bundle
import android.view.View
import com.example.base.base.ui.BaseFragment
import com.example.augumentedrealityapp.R
import com.example.augumentedrealityapp.ui.items.ItemsViewModel
import com.example.base.base.mvi.MVIView
import com.example.base.base.mvi.initViewModel
import javax.inject.Inject

class ItemsFragment : MVIView<ItemsState, ItemsIntent>() {
    override val contentLayoutResource: Int = R.layout.fragment_items

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel(ItemsViewModel::class)
    }
    override fun consume(state: ItemsState) {
        TODO("Not yet implemented")
    }
}