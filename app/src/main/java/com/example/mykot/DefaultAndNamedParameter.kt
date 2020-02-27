package com.example.mykot

fun main() {

    // 1 way - Like Java Only

    /* var displayName = getTotalAmt(50, 0.05)
     println(displayName)*/

    // 2 way - Here we're passing only one value like 50 as amt but we're receiving as a two parameters, Second one called "Default Parameter".
    // And if you pass the parameter like "0.10" then it will take 0.10 if not then it will take Default parameter 0.05

    /*   var displayName = getTotalAmt(50, 0.10)
       println(displayName)*/

    // 3 Way -"Named Parameter" we can give name and even we can change the order with specific name.

    var displayName = getTotalAmt(interest = 0.10, amt = 50)
    // var displayName = getTotalAmt(amt = 50)  // also possible
    println(displayName)
}

fun getTotalAmt(amt: Int, interest: Double = 0.05): Int {

    return (amt + amt * interest).toInt()
}

// 2 way - Here "interest: Double = 0.05" is "Default Parameter" even you don't pass this it will take by "Default".

/*
fun getTotalAmt(amt: Int, interest: Double = 0.05): Int {

    return (amt + amt * interest).toInt()
}
*/

// 1 way - Like Java Only

/*fun getTotalAmt(amt: Int, interest: Double): Int {

    return (amt + amt * interest).toInt()
}*/

