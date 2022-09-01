package com.trial.fakahany

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import layout.Fruit

class FruitAdapter(
    private val fruitList: List<Fruit>
) : RecyclerView.Adapter<FruitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemFruitView = LayoutInflater.from(parent.context).inflate(R.layout.fruit_item, parent, false)
        return FruitViewHolder(itemFruitView)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val currentFruit = fruitList[position]
        holder.bind(currentFruit)
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }
}