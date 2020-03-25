package org.mlooser.learn.kotlin.functional

fun foo(str: String, fn: (String) -> String): String {
    return fn(str)
}

fun bar(): (String) -> String = { str -> str.reversed() }

fun modulo(k: Int): (Int) -> Boolean = { it % k == 0 }

fun main() {
    var str = "Hello World";
    str = foo(str) { it.reversed() }
    str = bar()(str)
    println(str)

    val ints = listOf(1,2,3,4,5,6)
    val mod3 = ints.filter(modulo(3))
    println("Modulo 3 from $ints = $mod3")
}