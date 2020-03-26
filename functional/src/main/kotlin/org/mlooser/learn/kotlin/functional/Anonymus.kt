package org.mlooser.learn.kotlin.functional

fun main() {
    val ints = (1..10).toList()
    val evens = ints.filter(fun(i)git  = i % 2 == 0)

    println("Evens of $ints = $evens")
}