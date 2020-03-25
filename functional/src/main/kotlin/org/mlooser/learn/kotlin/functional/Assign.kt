package org.mlooser.learn.kotlin.functional

fun main() {
    val isEven: (Int) -> Boolean = { it % 2 == 0 }
    val ints = listOf(1, 2, 3, 4, 5, 6)
    val evenInts = ints.filter(isEven)

    println("Evens of $ints = $evenInts")
}