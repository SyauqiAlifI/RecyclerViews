package com.alifidn.recyclerview_android.second_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.alifidn.recyclerview_android.databinding.ActivitySecondBinding
import com.alifidn.recyclerview_android.databinding.CarItemsBinding
import com.bumptech.glide.Glide

class CarAdapter(private val carData: ArrayList<CarModel>) :
    RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    inner class CarViewHolder(val carBinding: CarItemsBinding) :
        RecyclerView.ViewHolder(carBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val inflater = CarItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val imgUri = carData[position].carImgUrl.toUri().buildUpon().scheme("https").build()
        holder.carBinding.apply {
            with(carData[position]) {
                Glide.with(imgCar.context)
                    .load(imgUri)
                    .into(imgCar)
                txtCar.text = carText
            }
        }
    }

    override fun getItemCount(): Int = carData.size
}