package com.example.mykot

fun main() {

    var position = 5

    //  1st way like normal Java
    when (position) {
        1 -> println("One")
        //   1 -> println("One Duplicate") // it won't print
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("Not Matched in Condition")
    }

    // 2nd way - as an Expression
    var output = when (position) {
        1 -> "One"
        //   1 -> println("One Duplicate") // it won't print
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "Not Matched in Condition"
    }
    println("Input $position and Result = $output")

    // 3rd way - as Range Operator
    var result = when (position) {
        in 1..5 -> "One"
        //   1 -> println("One Duplicate") // it won't print
        //  2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "Not Matched in Condition"
    }
    println("Input $position and Result = $result")

    val value: Any = false
    // 4th way - Like boolean true false
    var boolean = when (value) {
        is Int -> "$value -> It's an Integer"
        is Float -> "$value -> It's Float"
        is Double -> "$value -> It's Double"
        is Boolean -> "$value -> It's Boolean"
        //  is String -> "$value -> It's String $value"
        else -> "$value -> Data Type didn't match"
    }
    println("Boolean = $boolean")
}


// Key Point
// 1. "When" is like "Switch" in java but In Kotlin, we can use as an Expression.
// 2. We can use even without "else" in Kotlin and "default" in Java.But it's recommended to give else/default part
// 3. We can use "When" with Range Operator
// 4. We can use "When" Boolean true false value