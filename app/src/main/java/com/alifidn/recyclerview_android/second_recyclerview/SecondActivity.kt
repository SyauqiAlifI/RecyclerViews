package com.alifidn.recyclerview_android.second_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alifidn.recyclerview_android.R
import com.alifidn.recyclerview_android.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val carList = CarData.listAllCar
        binding.rvCars.adapter = CarAdapter(carList)
    }
}