package com.example.wordsfactory

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class PagerAdapterMenu(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> DictionaryFragment()
            1 -> Training()
            2 -> Video()
            else -> {throw Resources.NotFoundException("Position for menu was not found")}
        }
    }
}