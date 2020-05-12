package com.example.base.base.mvi

import com.example.base.base.ui.BaseFragment

abstract class MVIView <S : State, I : Intent> : BaseFragment(), StateConsumer<S>, IntentProducer<I> by ChannelIntentProducer()