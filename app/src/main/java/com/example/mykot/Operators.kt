package com.example.mykot

fun main() {

    var num1 = 100  // Even we can use with explicit type like "var num1:Int = 10" but not needed, Kotlin will take care
    var num2 = 100

   // println(num1 + num2)  // Java,Still we can use because Kotlin is "Inter-Operable"
    println("${num1 + num2}")
    println("Addition of $num1 and $num2 = ${num1 + num2}")
}