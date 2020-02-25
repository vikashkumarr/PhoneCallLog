package com.example.mykot

fun main() {
    val sum = add(5, 5)
    println(sum)
    var result = findMax(423, 5)
    println(result)
}

// With single Expression
fun findMax(num1: Int, num2: Int): Int = if (num1 > num2) num1 else num2

// With return
/*fun findMax(num1: Int, num2: Int): Int {
     if (num1 > num2)
         return num1
    else return num2

    // Second way
  *//*  return if (num1 > num2)
        num1
    else num2*//*
}*/

// Like Normal method/function call
/*fun findMax(num1: Int, num2: Int) {

    if (num1 > num2)
        println(num1)
    else println(num2)
}*/

// Addition with "Single Expression"
fun add(a: Int, b: Int): Int = a + b

// Below both are same as Above
/*fun add(a: Int, b: Int): Any = "${a + b}"*/
/*fun add(a: Int, b: Int): String = "${a + b}"*/

//Key Point(s)
//1. In case of "Single Expression" else part is compulsory to provide but In case of "With return" no compulsion to provide else part.