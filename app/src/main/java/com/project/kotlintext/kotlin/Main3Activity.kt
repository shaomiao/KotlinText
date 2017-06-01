package com.project.kotlintext.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.project.kotlintext.R

/**
 * 最新测试类
 */

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        sum(2,3)
    }
    fun sum(a:Int,b:Int):Int {
        return a+b
    }
    fun main(args:Array<String>) {

    }
    fun sum1 (a:Int,b:Int) = a+b

    fun printSum(a:Int,b:Int):Unit {
        println("sum of $a and $b is ${a+b}")
    }
    fun printSum1(a:Int,b:Int) {
    }


    // val 是常量 var 变量
    //////////////////////////////
    // 常量初始化
    fun valtext() {
        val a: Int = 1 // 立即初始化
        val b = 2 // 推导出Int型
        val c: Int // 当没有初始化值时必须声明类型
        c = 3
        println("a=$a,b=$b,c=$c")
    }
    // 变量初始化
    fun vartext() {
        var x = 5 // 推导出Int类型
        x += 1
        println("x=$x")
    }

    // 使用字符串模板
    fun strmuban() {
        var a = 1
        // 使用变量名作为模板
        val s1 = "a is $a"

        a = 2
        // 使用表达式作为模板
        val s2 = "${s1.replace("is","was")},but now is $a"
        println(s2)
    }
    // 使用条件表达式
    fun maxOf(a: Int,b:Int):Int{
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun maxOf1(a:Int,b:Int) = if (a > b) a else b

    // 使用可空变量以及空值检查
    // 可空返回值
    fun parseInt(str:String):Int? {
        return str.toInt()
    }

    fun printProduct(arg1:String,arg2:String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        // 直接使用x*y会产生错误因为他们中间可能有空值
        if (x!=null&&y!=null) {
            // x 和 y 将会在空值检测后自动转换为非空值
            println(x*y)
        } else {
            println("either '$arg1' or '$arg2' is not a number" )
        }
    }

    fun parseInt1(str: String):Int? {
        return null
    }

    fun printProduct1(arg1:String,arg2:String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)
        if (x==null) {
            println("Wrong number in arg1'${arg1}'")
            return
        }
        if (y == null) {
            println("Wrong number in arg2:'${arg2}'")
            return
        }

        // x和y将会在空值检测后自动转换为非空值
        println(x * y)
    }

    // 使用值检查并自动转换
    fun getStringLength(obj:Any):Int? {
        if (obj is String) {
            // obj 将会在这个分支中自动转换为String类型
            return obj.length
        }
        // obj 在种类检查外仍然是Any类型
        return null
    }

    fun getStringLength1(obj:Any):Int? {
        if (obj !is String) return null
        // obj 将会在这个分支中自动转换为String类型
        return obj.length
    }

    fun getStringLength2(obj:Any):Int? {
        // obj 将会在&&右边自动转换为String类型
        if (obj is String && obj.length>0) {
            return obj.length
        }
        return null
    }
    // 使用循环
    fun forText() {
        val items = listOf("apple","banana","kiwi")
        for(item in items) {
            println(item)
        }

        // 或者
        for(index in items.indices) {
            println("item at $index is ${items[index]}")
        }
    }
    // 使用while循环
    fun whileText() {
        val items = listOf("apple","banana","kiwi")
        var index = 0
        while (index < items.size) {
            println("item at $index is ${items[index]}")
            index ++
        }
    }
    // 使用when表达式
    fun describe (obj:Any) :String =
            when(obj) {
                1 -> "One"
                "Hello" -> "Greeting"
                is Long  -> "Long"
                !is String -> "Not a string"
                else -> "Unknown"
            }
    // 使用ranges
    fun mainRanges(args:Array<String>) {
        val x = 10
        val y = 9
        if (x in 1..y+1) {
            println("fits in range")
        }
    }

}
