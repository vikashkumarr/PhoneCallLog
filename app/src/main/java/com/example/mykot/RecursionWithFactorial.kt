package com.example.mykot

fun main() {

    val number = 5
    println(fact(number))
}

fun fact(num: Int): Int {
    return if (num == 0)
        1
    else
        num * fact(num - 1)      // 5 * 4! -> 4*3
}