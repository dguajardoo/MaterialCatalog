package com.example.materialcatalog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialcatalog.databinding.ActivityButtonBinding

class ButtonActivity : AppCompatActivity() {
    private lateinit var binding: ActivityButtonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityButtonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.containedButton.setOnClickListener{  }
        binding.outlinedButton.setOnClickListener{  }
        binding.textButton.setOnClickListener {  }
        binding.toggleButton.addOnButtonCheckedListener { group, checkedId, isChecked ->  }

    }
}