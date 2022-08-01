package com.alifidn.recyclerview_android.third_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.alifidn.recyclerview_android.databinding.PahlawanItemsBinding
import com.bumptech.glide.Glide

class PahlawanAdapter(val listPahlawan: MutableList<ModelPahlawan>) : RecyclerView.Adapter<PahlawanAdapter.PahlawanViewHolder>() {
    class PahlawanViewHolder(val itemPahlawan: PahlawanItemsBinding) : RecyclerView.ViewHolder(itemPahlawan.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PahlawanViewHolder = PahlawanViewHolder(
        PahlawanItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: PahlawanViewHolder, position: Int) {
        holder.itemPahlawan.apply {
            with(listPahlawan[position]) {
                tvNamaPahlawan.text = name
                tvNamaLengkap.text = namaLengkap
                Glide.with(imagePahlawan.context).load(imgPahlawan).into(imagePahlawan)
            }
        }
    }

    override fun getItemCount(): Int = listPahlawan.size
}