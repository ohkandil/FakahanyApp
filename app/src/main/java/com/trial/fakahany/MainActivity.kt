package com.trial.fakahany

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import layout.Fruit

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.main_recycler_view)
        val listOfFruit = getListOfFruits()
        val fruitAdapter = FruitAdapter(listOfFruit)

        recyclerView.adapter = fruitAdapter
    }

    private fun getListOfFruits(): List<Fruit> {

        val fruits = mutableListOf<Fruit>()
        fruits.add(Fruit("Mango", R.drawable.mango, null))
        fruits.add(Fruit("Apple", R.drawable.apple, null))
        fruits.add(Fruit("Banana", R.drawable.banana, null))
        fruits.add(Fruit("Grapes", R.drawable.grapes, null))
        fruits.add(Fruit("Guava", R.drawable.guava, null))
        fruits.add(Fruit("Peach", R.drawable.peach, null))
        fruits.add(Fruit("Pear", R.drawable.pear, null))
        fruits.add(Fruit("Strawberry", R.drawable.strawberry, null))
        fruits.add(Fruit("Watermelon", R.drawable.watermelon, null))
        fruits.add(Fruit("Peach", R.drawable.peach, null))
        fruits.add(Fruit("Pear", R.drawable.pear, null))
        fruits.add(Fruit("Strawberry", R.drawable.strawberry, null))
        fruits.add(Fruit("Watermelon", R.drawable.watermelon, null))


        return fruits

    }

}