package com.example.mykot

fun main() {

    var obj1 = OperatorOverLoadingTest()
    obj1.name = "Java"
    obj1.show()

    var obj2 = OperatorOverLoadingTest()
    obj2.name = "Android"
    obj2.show()

    var obj3 = obj1 + obj2  // u can give any name instead of "plus" like add or minus etc.
    obj3.show()
}

operator fun OperatorOverLoadingTest.plus(myName: OperatorOverLoadingTest): OperatorOverLoadingTest {
    var bothName = OperatorOverLoadingTest()
    bothName.name = this.name + " " + myName.name
    return bothName
}

class OperatorOverLoadingTest {

    var name = ""

    fun show() {

        println(name)
    }
}