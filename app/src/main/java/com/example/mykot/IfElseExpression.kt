package com.example.mykot

fun main() {

    var val1 = 200
    var val2 = 50
    var result: Int = 0

    // This is normal like Java. What special in Kotlin?

    /*if (val1 > val2)
        result = val1
    else
        result = val2

    println(result)*/

    // In Kotlin

    result = if (val1 > val2)
        val1
    else val2

    println(result)

    // In a single line
    result = if (val1 > val2) val1 else val2
    println(result)

}

// Key Point
// 1. You can use if else as a "Expression" in Kotlin But not in Java.