package com.alifidn.recyclerview_android.first_recyclerview

import android.content.Context
import com.alifidn.recyclerview_android.R

class AnimalModel(val ctx: Context) {
    fun getAnimalList() : Array<String> {
        return ctx.resources.getStringArray(R.array.AnimalList)
    }
}