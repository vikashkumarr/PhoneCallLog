package com.example.mykot

fun main() {

    val arrayDemo = arrayOf(10, 20, 30, 40, 50)

    //RangeTo Dot Dot
    for (myValue in 1..5) {
        print("$myValue \t")
    }

    println()

    //RangeTo method same like ..(1..5) there is no difference at all
    for (myValue in 1.rangeTo(5)) {
        print("$myValue \t")
    }

    println()

    //Until - to show upton 4 only
    for (myValue in 1 until 5) {
        print("$myValue \t")
    }

    println()

    //Use of "step"
    for (myValue in 1..5 step 3) {
        print("$myValue \t")
    }

    println()

    //Use of "downTo"
    for (myValue in 5 downTo 1) {
        print("$myValue \t")
    }

    println()

    //Use of ArrayOf
    for (myValue in arrayDemo) {
        print("$myValue \t")
    }

    println()

    //Use of ArrayOf indices
    for (myValue in arrayDemo.indices) {
        print(arrayDemo[myValue])
    }

    println()

    //Use of ArrayOf withIndex
    for ((index, value) in arrayDemo.withIndex()) {
        print("$index -> $value ")
    }

    println()

    val nums = 1..5
    //Use of Reverse method
    for (myValue in nums.reversed()) {
        print("$myValue \t")
    }

    println()

    var test = 'A'..'z'
    // Character reverse
    for (temp in test) {
        print("$temp\t")
    }
}

// Key Note
//1. RangeTo Dot Dot
//2. RangeTo method same like .. there is no difference at all
//3. Until - to show upton 4 only
//4. Use of "step"
//5. Use of "downTo"
//6. Use of ArrayOf
//7. Use of ArrayOf indices
//8. Use of ArrayOf withIndex
//9. Use of Reverse method
//10. Character reverse