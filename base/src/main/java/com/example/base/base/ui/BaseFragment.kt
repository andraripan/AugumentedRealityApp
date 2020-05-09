package com.example.base.base.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.CallSuper
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.base.R
import com.example.base.base.di.util.Injectable
import kotlinx.android.synthetic.main.fragment_base.*
import javax.inject.Inject

abstract class BaseFragment : Fragment(), Injectable, HasViewModelFactory {
    @get:LayoutRes
    abstract val contentLayoutResource: Int

    @Inject
    override lateinit var viewModelFactory: ViewModelProvider.Factory

    @CallSuper
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_base, container, false).apply{
            layout_stub.layoutResource = contentLayoutResource
            layout_stub.inflate()
        }
}