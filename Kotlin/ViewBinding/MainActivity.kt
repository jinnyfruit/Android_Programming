package com.example.kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_app.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtMessage.text = "Gachon university"
    }
}