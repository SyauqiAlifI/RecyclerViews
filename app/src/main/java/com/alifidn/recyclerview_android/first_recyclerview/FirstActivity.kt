package com.alifidn.recyclerview_android.first_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alifidn.recyclerview_android.R
import com.alifidn.recyclerview_android.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animalList = AnimalModel(this).getAnimalList()
        binding.recyclerAnimal.adapter = AnimalAdapter(animalList)
    }
}