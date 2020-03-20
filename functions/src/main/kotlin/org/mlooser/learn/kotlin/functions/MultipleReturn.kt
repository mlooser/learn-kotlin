package org.mlooser.learn.kotlin.functions

fun getSurroundingChars(string: String): Pair<Char, Char> {
    return string[0] to string[string.length - 1]
}

fun main() {
    val (first, last) = getSurroundingChars("Kotlin")
    println("First is $first, last is $last")
}