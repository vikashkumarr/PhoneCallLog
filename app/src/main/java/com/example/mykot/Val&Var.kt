package com.example.mykot

fun main() {

    val name = "Vikash"
    //  name = "Kumar"     // Compiler Error - "Val can't be reassigned"
    //  println(name)        // It's like Java
    println("$name")     // It's Kotlin

    var age = 27
    age = 28            // Here we're able to reassign value

    println("$age")

}

//Key Points

// 1. Val - is Immutable( Values can't be modified ) - If u try to reassign then u will get Compiler Error - "Val can't be reassigned"
// 2. Var - is Mutable ( Unlike Immutable)