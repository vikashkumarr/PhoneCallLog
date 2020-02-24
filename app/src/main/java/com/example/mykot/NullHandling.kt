package com.example.mykot

fun main() {

    var name: String? = null
    println(name)
    //  println(name!!.length)  // To produce "NullPointerException" like Java use "!!"

    println(
        name?.length
            ?: "Unknown "  // This is like "Ternary Operator" in Java, if value isn't null then yield length of given string. or else "Unknown"
    )
}

// Key Point
// 1. Kotlin won't allow to assign null value to the variable by default but in case if you want to assign then we have to use "?"