package com.project.kotlintext.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.project.kotlintext.R
import java.io.File

/**
 * 最新
 */
class Main4Activity : AppCompatActivity() {

    fun describe(obj: Any): String =
            when (obj) {
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
    data class Customer(val name: String, val email: String)

    // 函数默认值
    fun foo(a: Int = 0, b: String = "") {}

    val list = listOf(3, 2, 0)
    // 过滤list
    val positives1 = list.filter { x -> x > 0 }
    val positives = list.filter { it > 0 }

    fun String.spcaceToCamelCase() {
//        println("nihao")
    }
    object Resource {
        val name = "Name"
    }
    val files = File("Test").listFiles()

    fun transform(color:String): Int {
        return when(color) {
            "Red" -> 0
            "Green" -> 1
            "Blue" -> 2
            else -> throw IllegalArgumentException("Invalid color param ")
        }
    }

    // try-catch表达式
    fun test() {
        val result = try {
//            count()
        }catch (e:ArithmeticException) {
            throw IllegalStateException(e)
        }
        // 处理result
    }

    // if表达式
    fun foo(param:Int):String {
        val result = if (param == 1) {
            "one"
        } else if (param == 2) {
            "two"
        } else {
            "three"
        }
        return result
    }

    // 方法使用生成器模式返回Unit
    // -1 0 1 2
    fun arrOfMinusOnes(size:Int):IntArray {
        return kotlin.IntArray(size).apply { fill(-1) }
    }

    fun theAnswer() =42

    // 与下面的语句是等效的
    fun theAnswer1() :Int{
        return 42
    }

    fun transform1(color:String):Int = when(color) {
        "Red" -> 0
        "Green" -> 1
        "Bule" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
    // 利用with调用一个对象实例的多个方法
//    class Turtle {
//        fun penDown()
//        fun penUp()
//        fun turn(degrees:Double)
//        fun forward(pixels:Double)
//    }
//    val myTurtle = Turtle()
//    with(myTurtle) { // 画一个100像素的正方形
//        penDown()
//        for(i in 1..4) {
//            forward
//        }
//
//    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main4)

        println(theAnswer())

//        println(transform("Green"))

        // 如果不为空执行某操作
//        val data = ""
//        data?.let {
//            //
//        }

        // 声明为空执行某操作
//        val data = mapOf("email" to null )
//        val email = data["email"]?:throw IllegalStateException("Email is missing");
        //如果不为空... 否则...的简写
//        println(files?.size?:"empty")
//        println("shaomiao".spcaceToCamelCase());
        // 只读list
//        val list = listOf("a","b","c")
//
//        // 只读map
//        val map = mapOf("a" to 1,"b" to 2,"c" to 3)
//        println(map["a"])
        // 使用ranges
        // 如果x 在1到10之间
//        var x = 11;
//        if (x in 1..10) {
//            println("hello world")
//        }
        // 从10到1
//        for (x in 10 downTo 1) {
//            print("$x ,")
//        }
        // 从2开始 没2个一步
//        for (x in 2..10 step 2) {
//            print("$x ,")
//        }
        // 半开区间 不包括 100
//        for (i in 1 until 100) {
//            print("$i ,")
//        }
        // 闭区间 包括100
//        for (i in 1..100) {
//            print("$i,")
//        }
        println("shaomiao")

        // 实例检查
//        when (x) {
//            is Foo ->
//                ...
//            is Bar ->
//                ...
//            else ->
//                ...
//        }
        // 遍历map/list
//        for ((k,v) in map) {
//            print("$k -> $v")
//        }

        // 字符串插值
//        var name = "shaomiao";
//        println("Name $name")

//        println(positives)
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
