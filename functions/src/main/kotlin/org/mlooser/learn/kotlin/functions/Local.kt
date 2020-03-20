package org.mlooser.learn.kotlin.functions

fun fizzbuzz(start: Int, end: Int) {
    for (k in start..end) {
        fun isFizz() = k % 3 == 0
        fun isBuzz() = k % 5 == 0

        when {
            isFizz() && isBuzz() -> println("$k is FizzBuzz")
            isFizz() -> println("$k is Fizz")
            isBuzz() -> println("$k is Buzz")
            else -> println(k)
        }
    }
}

fun main() {
    fizzbuzz(3, 15)
}