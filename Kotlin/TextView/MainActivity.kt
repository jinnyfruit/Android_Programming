package com.example.kotlin_app

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_app.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtMessage.text = "I study Kotlin"
        binding.txtMessage.append("in MP lecture")
        binding.txtMessage.setTextColor(Color.CYAN)
    }
}