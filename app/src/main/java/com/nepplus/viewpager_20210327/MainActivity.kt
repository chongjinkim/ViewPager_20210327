package com.nepplus.viewpager_20210327

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.viewpager_20210327.adapters.MainViewPageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mvpa : MainViewPageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mvpa = MainViewPageAdapter(supportFragmentManager)

        mainViewPager.adapter = mvpa

    }
}