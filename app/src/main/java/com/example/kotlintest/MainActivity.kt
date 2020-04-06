package com.example.kotlintest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var images:Array<Int> = arrayOf(R.drawable.a,R.drawable.b,R.drawable.c)
    lateinit var adapter:PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = SliderAdapter(this,images)
        viewpager.adapter= adapter

    }


}
