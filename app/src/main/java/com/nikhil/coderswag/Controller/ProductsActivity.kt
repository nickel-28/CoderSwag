package com.nikhil.coderswag.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nikhil.coderswag.R
import com.nikhil.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

    }
}