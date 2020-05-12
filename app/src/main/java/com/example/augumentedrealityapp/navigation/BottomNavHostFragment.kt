package com.example.augumentedrealityapp.navigation

import androidx.navigation.fragment.NavHostFragment

class BottomNavHostFragment : NavHostFragment() {
    override fun createFragmentNavigator() =
        BottomNavigator(requireContext(), childFragmentManager, id)
}
