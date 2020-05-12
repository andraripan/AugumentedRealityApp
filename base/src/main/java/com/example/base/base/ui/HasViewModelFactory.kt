package com.example.base.base.ui

import androidx.lifecycle.ViewModelProvider

interface HasViewModelFactory {
    var viewModelFactory: ViewModelProvider.Factory
}
