package com.example.mykot

import java.util.*

fun main() {

    var immutableData = listOf<String>("Vikash", "Kumar")
    var aliens = TreeMap<String, Int>()

    for (data in immutableData) {
        print("$data \t")
    }

    println()

    for ((index, data) in immutableData.withIndex()) {
        println("$index\t $data")
    }

    println()

    var mutableList = mutableListOf<String>("Visteon")
    mutableList.add("Automotive Company")
    println(mutableList)

    // TreeMap
    aliens["Vikash"] = 87
    aliens["Kumar"] = 76

    for ((name, age) in aliens) {
        println("$name : $age")
    }
}

// Key Points
//1. listOf<>() -> is Immutable simply means that you can't modify data(It means you can't use "add()" API in this case to add items in the list).
//2. mutableListOf<>() -> is Mutable simply means that you can modify data(It means you can use "add()" API in this case to add items in the list).
//3. TreeMap<String, Int>() -> It's like map in Java.It contains key value pair.