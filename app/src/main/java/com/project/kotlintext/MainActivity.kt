package com.project.kotlintext


import android.app.ActionBar
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.project.kotlintext.entity.User
import com.project.kotlintext.kotlin.Main2Activity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name_tv.text="邵淼";
        name_tv.setOnClickListener {

        }
        v<TextView> {
            layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            text = "Hello"
            setTextColor(ContextCompat.getColor(applicationContext,R.color.colorAccent))

        }
        val list = arrayListOf(1,2,3,4,5);
        val doubleList = list.map {
            it *2
        }
        val oddList = list.filter {
            it%2 == 1
        }
        doubleList.forEach {
            print(it)
        }
        oddList.forEach {
            print(it)
        }
        list.forEach {
            println(it)
        }

        val javaClass = User("xx")
        println(javaClass.name)
        println(javaClass.email)
        val anInt:Int ?=null
        debug("shaomiao")

    }
    // 延迟加载机制
    private val aTextView:TextView by lazy {
        findViewById(R.id.text) as TextView
    }

    inline fun <reified TV : View> Context.v(init:TV.() -> Unit):TV {
        val constr = TV::class.java.getConstructor(Context::class.java);
        val view = constr.newInstance(this);
        view.init();
        return view;
    }
    inline fun <reified T> T.debug(log:Any) {
        Log.d("shaomaio",log.toString())
    }
}
