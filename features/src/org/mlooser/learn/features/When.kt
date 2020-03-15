package org.mlooser.learn.features

import kotlin.math.abs

fun main() {
    whatNumber(0)
    whatNumber(1)
    whatNumber(2)

    println("Is 3 min or max ? ${isMinOrMax(3)}")
    println("Is Int.MIN_VALUE min or max ? ${isMinOrMax(Int.MIN_VALUE)}")

    println("Is 3 positive ? ${isPositive(3)}")
    println("Is -3 positive ? ${isPositive(-3)}")

    println("Is 4 single digit ? ${isSingleDigit(4)}")

    println("Is 4 in range [1,5] ? ${isInRange(4,1,5)}")
    println("Is 6 in range [1,5] ? ${isInRange(6,1,5)}")
}

fun whatNumber(x: Int) {
    when (x) {
        0 -> println("$x is zero")
        1 -> println("$x is one")
        else -> println("$x is something else than 0 or 1")
    }
}

fun isMinOrMax(x: Int): Boolean {
    return when (x) {
        Int.MIN_VALUE -> true
        Int.MAX_VALUE -> true
        else -> false
    }
}

fun isPositive(x: Int): Boolean {
    return when (x) {
        abs(x) -> true
        else -> false
    }
}

fun isSingleDigit(x: Int) : Boolean {
    return when(x){
        in -9..9 -> true
        else-> false
    }
}

fun isInRange(x:Int, min : Int, max : Int) : Boolean{
    return when(x){
        in min..max -> true
        else -> false
    }
}