package com.project.kotlintext.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.project.kotlintext.R

/**
 * Created by shaomiao on 2017/9/11.
 */
class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mian5)
//        ArrayAdapter<String>(this,2, listOf("","d"));
//        data_rv.adapter =

//                        vars(12,12); // 12,12
//        var sumLambda : (Int,Int) -> Int = {x,y -> x+y}
//        print(sumLambda(1,2)) // 3
//        var a = 1
//        val s1 = "a is $a"
//        a = 2
//        var s2 = "${s1.replace("is","was")} , but now is $a"
//        print(s1) // a is 1
//        print(s2) // ,but now is 2
//        Log.e("shaomiao",s1)
//        Log.e("shaomiao",s2)
        //
//
//        val a: Int = 100
//        val boxedA: Int? = a
//        val anotherBoxedA: Int? = a
//
//        Log.e("shaomiao", (boxedA == anotherBoxedA).toString())
//        Log.e("shaomiao", (boxedA === anotherBoxedA ).toString())

//        val items = listOf<String>("ass","dfdf");
//        for (item in items.indices) {
//            Log.e("shaomiao", items[item]);
//        }
//        for (i in 1 until 4) {   // i in [1, 4) 排除了 4
////            print(i)
//            Log.e("shaomiao", i.toString());
//        }

//        for (i in 1 until 10) { // i in [1,10] 排除了10
//            print(i) // 1
//        }
//
//        for (i in 4 downTo 0 step 2) {
//            print(i) // 4,2,0
//        }
//
//        for (i in 1..100) {
//            print(i)
//        }
//        loop@ for (i in 1..100) {
//            for (j in 1..100) {
//                if (j == 20) break@loop
//            }
//        }

//        val b = Array(6, { i -> (i * 9) })
//        for (a in b)
//            Log.e("shaomiao", a.toString())
        var ints = arrayOf(1, 2, 6, 0, 2);

        ints.forEach xx@ {
            if (it == 0) return@xx
            print(it) // 1,2,6,2
        }

        ints.forEach {
            if (it == 0) return@forEach
            print(it) // 1,2,6,2
        }

        ints.forEach(fun(value : Int) {
            if (value == 0) return
            print(value) // 1,2,6,2
        })


    }


    // 可变长参数函数
    fun vars(vararg v: Int) {
        for (vr in v) {
            print(vr)
        }
    }

    public fun sum2(a: Int, b: Int): Int = a + b // public 方法则必须明确写出返回类型

    fun sum(a: Int, b: Int): Int {
        return 0;
    }

    fun sum1(a: Int, b: Int) = a + b

    fun printSum(a: Int, b: Int): Unit {
        print(a + b)
    }

    fun main(arg: Array<String>) {

    }

}