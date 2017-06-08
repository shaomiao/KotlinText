package com.project.kotlintext.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.project.kotlintext.R

/**
 * 最新
 */
class Main4Activity : AppCompatActivity() {

    fun describe(obj:Any):String =
    when(obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

    // 习惯用语
    //创建DTOs(POJOs/POCOs)数据类
    /**
     * 为所有属性添加getters如果为var类型同时添加setters -- equals()
     * --haseCode()--toString()--copy()--commponent1()
     */
    data class Customer(val name:String,val email:String)

    // 函数默认值
    fun foo(a: Int = 0,b: String = "") {}

    val list = listOf(3,2,0)
    // 过滤list
    val positives1 = list.filter{x -> x >0 }
    val positives = list.filter{it >0 }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        println(positives)
//        println(describe(1))
//        println(describe("Hello"))
//        println(describe(1000L))
//        println(describe(2))
//        println(describe("other"))

        // 使用in操作符检查数值是否在某个范围内
//        val x = 10
//        val y = 9
//        if (x in 1..y) {
//            println("fits in range")
//        } else {
//            println("shaomiao")
//        }

        // 检查数值是否在范围外
//        val list = listOf("a","b","c")
//        println(list.lastIndex)
//        println(list.size)
//        // 0..2
//        println(list.indices)
//        if (-1 !in 0..list.lastIndex) {
//            println("-1 is out of range")
//        }
//        if (list.size !in list.indices) {
//            println("list size is out of valid list indices range too")
//        }
        // 在范围内迭代 //12345
//        for (x in 1..5) {
//            print(x)
//        }
//        // 使用步进 13579 2是一步 1 1+2 3+2
//        for (x in 1..10 step 2) {
//            print(x)
//        }
//
//        // 9到0 3是一步 // 9630
//        for(x in 9 downTo 0 step 3) {
//            print(x)
//        }

        // 使用集合进行迭代
//        val items = listOf("banana","apple","kiwi")
//        for (item in items) {
//            println(item)
//        }
//        // 使用in操作符检查集合中是否包好某个对象
//        when {
//            "orange" in items -> println("juicy")
//            "apple" in items -> println("apple is fine too")
//        }
//        // 使用lambda表达式过滤和映射集合
//        items
//                .filter { it.startsWith("a") }
//                .sortedBy { it }
//                .map { it.toUpperCase() }
//                .forEach { println(it) }




    }
}
