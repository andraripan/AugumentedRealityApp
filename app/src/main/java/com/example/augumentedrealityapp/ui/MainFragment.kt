package com.example.augumentedrealityapp.ui

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.example.augumentedrealityapp.R
import com.example.base.base.ui.BaseFragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseFragment() {
    override val contentLayoutResource: Int = R.layout.fragment_main

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initBottomNavigation()
    }

    private fun initBottomNavigation() {
        val navController =
            Navigation.findNavController(requireActivity(), R.id.bottom_navigation_host_fragment)
        bottom_navigation.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, _, _ ->
            main_toolbar.title = navController.currentDestination?.label
        }
    }

}