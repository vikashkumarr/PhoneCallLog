package com.example.mykot

fun main() {
    val myName = ClassObjectTest()
    myName.name = "Vikash Kumar"
    println("My Name is : ${myName.name}")
}


class ClassObjectTest {
    var name: String = " "
}