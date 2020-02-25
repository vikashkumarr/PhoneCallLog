package com.example.mykot

import java.lang.Exception

fun main() {

    var str = "4a" // 44
    //  var num: Int = 0

    try {
        println(str.toInt() + 10)
    } catch (e: Exception) {
        println("Exception Occurred")
    }

// try with single expression
    var num = try {
        str.toInt()
    } catch (e: NumberFormatException) {
      //  println(e.printStackTrace())
        println("Exception NumberFormatException")
    }
    println(num)
}