package com.example.location

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.location.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private val binding by lazy { ActivityMain3Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            btnLocation.setOnClickListener {
                startActivity(Intent(this@MainActivity3, MainActivity::class.java))
            }
            btnRealTimeLocation.setOnClickListener {
                startActivity(Intent(this@MainActivity3, MainActivity2::class.java))
            }
        }

    }
}