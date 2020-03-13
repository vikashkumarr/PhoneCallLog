package com.example.mykot

fun main() {

    val obj = B()
    obj.display()
    obj.show()
}

open class A {

    open fun show() {

        println(" Show !!")
    }
}

class B : A() {

    override fun show() {

        println(" Show in Display !!")
    }

    fun display() {

        println(" Display !!")
    }
}