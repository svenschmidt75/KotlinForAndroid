package com.example.habittracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv_icon.setImageResource(R.drawable.water)
        tv_title.text = "Title"
        tv_description.text = "A refreshing glass"
    }
}
