package com.example.mykot

fun main() {

    var obj = ConstructorDemo("Vikash Kumar")
    obj.displayName()
}

//class ConstructorDemo constructor(var name: String)

class ConstructorDemo (private var name: String) {   // constructor keyword is optional

    fun displayName() {

        println("My name is : $name")
    }
}