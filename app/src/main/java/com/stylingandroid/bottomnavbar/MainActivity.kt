package com.stylingandroid.bottomnavbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.stylingandroid.bottomnavbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toggle.setOnCheckedChangeListener { _, isChecked ->
            binding.bottomNavBar.menu.findItem(R.id.menu_loadingv2_external).icon =
                if (isChecked) {
                    resources.getDrawable(R.drawable.loadingv2_ongoing_selector, theme)
                } else {
                    resources.getDrawable(R.drawable.loadingv2_vector, theme)
                }
        }
    }
}
