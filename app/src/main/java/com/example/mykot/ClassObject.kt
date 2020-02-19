package com.example.mykot

fun main() {
    val myName = MyClass()
    myName.name = "Vikash Kumar"
    println("My Name is : ${myName.name}")
}


class MyClass {
    var name: String = " "
}