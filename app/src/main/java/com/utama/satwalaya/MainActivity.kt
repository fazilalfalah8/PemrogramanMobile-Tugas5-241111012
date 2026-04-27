package com.utama.satwalaya

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.utama.satwalaya.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Memaksa transparansi total pada status bar dan navigasi bar tanpa scrim/bayangan
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(Color.TRANSPARENT, Color.TRANSPARENT),
            navigationBarStyle = SystemBarStyle.light(Color.TRANSPARENT, Color.TRANSPARENT)
        )

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        // Mengatur agar konten fragment muncul tepat di balik status bar
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            
            // Atur margin Bottom Nav secara manual agar tidak tertimpa bar navigasi sistem
            val params = binding.cardNav.layoutParams as android.view.ViewGroup.MarginLayoutParams
            params.bottomMargin = systemBars.bottom + 48 // 48 is default margin
            binding.cardNav.layoutParams = params

            insets
        }

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
        
        binding.bottomNav.setupWithNavController(navController)
    }
}