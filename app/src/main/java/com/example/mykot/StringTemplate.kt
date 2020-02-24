package com.example.mykot

fun main() {

    val obj = StringTemplateTest()
  //  println(obj.a1 + obj.a2) // Java
    val result = obj.a1 + obj.a2
    println("$result")
    println("Addition ${obj.a1 + obj.a2}")
    println("Multiplication of ${obj.a1} and ${obj.a2} = ${obj.a1 * obj.a2}")
}


class StringTemplateTest {

    val a1 = 200
    val a2 = 20
}