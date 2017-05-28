package com.project.kotlintext


import android.app.ActionBar
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name_tv.text="邵淼";
        v<TextView> {
            layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            text = "Hello"
            setTextColor(ContextCompat.getColor(applicationContext,R.color.colorAccent))

        }
    }

    inline fun <reified TV : View> Context.v(init:TV.() -> Unit):TV {
        val constr = TV::class.java.getConstructor(Context::class.java);
        val view = constr.newInstance(this);
        view.init();
        return view;
    }
}
