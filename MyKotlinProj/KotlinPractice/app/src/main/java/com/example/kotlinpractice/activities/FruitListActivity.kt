package com.example.kotlinpractice.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinpractice.adapters.FruitAdapter
import com.example.kotlinpractice.R
import com.example.kotlinpractice.models.Fruit
import com.example.kotlinpractice.models.ListOfFruits
import kotlinx.android.synthetic.main.activity_fruit_list.*

class FruitListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_list)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val myAdapter = FruitAdapter(this, ListOfFruits.fruitsName)
        recyclerView.adapter = myAdapter
    }
}
