package org.mlooser.learn.kotlin.functions

fun main() {
    val printHello = { name: String -> println("Hello $name") }

    printHello("Marcin")
    printHello("Kasia")
}