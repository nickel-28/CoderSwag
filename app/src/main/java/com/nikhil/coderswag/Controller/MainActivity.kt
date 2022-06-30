package com.nikhil.coderswag.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.nikhil.coderswag.Adapters.CategoryRecycleAdapter
import com.nikhil.coderswag.R
import com.nikhil.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        CategoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        CategoryListView.layoutManager = layoutManager
        CategoryListView.setHasFixedSize(true)


    }
}