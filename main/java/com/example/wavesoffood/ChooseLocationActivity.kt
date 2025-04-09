package com.example.wavesoffood

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wavesoffood.databinding.ActivityChooseLocationBinding
class ChooseLocationActivity : AppCompatActivity() {
    private lateinit var binding:ActivityChooseLocationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityChooseLocationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val locationList = arrayOf("Jaipur", "Odisha", "Delhi", "Mumbai")
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView=binding.listoflocation
        autoCompleteTextView.setAdapter(adapter)

    }
}