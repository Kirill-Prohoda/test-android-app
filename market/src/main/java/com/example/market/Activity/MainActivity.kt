package com.example.market.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.market.Domain.CategoryDomain
import com.example.market.R


class MainActivity : AppCompatActivity() {

    lateinit var recyclerViewCategoryList: RecyclerView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleCategory()
    }

    private fun recycleCategory() {
        recyclerViewCategoryList = findViewById(R.id.recyclerView)
        recyclerViewCategoryList.layoutManager = LinearLayoutManager(this)

        val category = ArrayList<CategoryDomain>()

        category.add(CategoryDomain("Pizza", "cat_1"))
        category.add(CategoryDomain("Burger", "cat_2"))
        category.add(CategoryDomain("Hotdog", "cat_3"))
        category.add(CategoryDomain("Drink", "cat_4"))
        category.add(CategoryDomain("Donut", "cat_5"))


    }
}
