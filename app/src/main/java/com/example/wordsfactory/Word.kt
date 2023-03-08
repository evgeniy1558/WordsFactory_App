package com.example.wordsfactory

import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import android.os.Bundle
import com.example.wordsfactory.R
import com.example.wordsfactory.databinding.ActivityWordBinding

class Word : AppCompatActivity() {
    private lateinit var binding: ActivityWordBinding
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPager = binding.viewpagermenu
        viewPager.isUserInputEnabled = false
        viewPager.adapter = PagerAdapterMenu(this)

        binding.bottomMenu.setOnItemSelectedListener {
            val pos = when (it.itemId) {
                R.id.dictionary -> 0
                R.id.training -> 1
                R.id.video -> 2
                else -> 0
            }
            viewPager.setCurrentItem(pos, true)
            true
        }
    }
}