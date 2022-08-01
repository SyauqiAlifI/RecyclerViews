package com.alifidn.recyclerview_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alifidn.recyclerview_android.databinding.ActivityMainBinding
import com.alifidn.recyclerview_android.first_recyclerview.FirstActivity
import com.alifidn.recyclerview_android.second_recyclerview.SecondActivity
import com.alifidn.recyclerview_android.third_recyclerview.ThirdActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstRecyclerview.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }
        binding.secondRecyclerview.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        binding.thirdRecyclerview.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}