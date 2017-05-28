package com.project.kotlintext.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.project.kotlintext.R
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        name_tv.text="shaomiao";
    }
}
