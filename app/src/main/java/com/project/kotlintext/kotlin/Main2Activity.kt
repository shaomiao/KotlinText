package com.project.kotlintext.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.SparseIntArray
import android.widget.TextView
import com.project.kotlintext.R
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
//        name_tv.text="shaomiao";
//        val nameTv = findViewById(R.id.name_tv) as TextView
//        nameTv.setOnClickListener {
//
//        }

        println(sum1(3, 5))
        printSum1(-1,8)
        main()
        main1()
        main2()
        println("max of 0 and 42 is ${maxOf1(0,42)}")
        getStringLength("shaomiao")
    }

    // 最后一个问号是代表能返回空
    fun getStringLength(obj:Any) :Int? {
        if (obj is String) {
            return obj.length
        }
        // obj 在种类检查外仍然是Any
        return null
    }

    fun maxOf1(a:Int,b:Int)=if(a>b)a else b

    fun maxOf(a:Int,b:Int):Int {
        if (a>b) {
            return a
        } else {
            return b
        }
    }

    fun main2() {
        var a = 1
        // 使用变量名作为模板 val 是常量
        val s1 = "a is $a"
         a = 2
        val s2 = "${s1.replace("is","was")},but now is $a"
        println(s2)
    }

    fun main1() {
        var x = 5;// 推导出Int类型
        x+=1
        println("X=$x")
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum1(a: Int, b: Int) = a + b

    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is${a + b}")
    }

    fun printSum1(a:Int,b:Int){
        println("sum of $a and $b is${a+b}")
    }

    fun main(args: Array<String>) {
        print("sum of 3 and 5 is")
        println(sum(3, 5))
    }


    fun main() {
        val a:Int =1 // 立即初始化
        val b = 2 // 推导出Int型
        val c:Int // 当没有初始化时必须声明类型
        c = 3;
        println("a=$a,b=$b,c=$c")
    }

}
