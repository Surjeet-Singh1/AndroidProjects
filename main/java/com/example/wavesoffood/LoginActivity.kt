package com.example.wavesoffood

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wavesoffood.databinding.ActivityLoginBinding
import kotlin.math.sign

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
            binding.loginbutton.setOnClickListener {
                val intent=Intent(this, SigninActivity::class.java)
                startActivity(intent)
        }
        binding.donothavebutton.setOnClickListener {
            val intent=Intent(this, SigninActivity::class.java)
            startActivity(intent)
        }



    }
}