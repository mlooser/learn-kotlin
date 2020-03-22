package org.mlooser.learn.kotlin.functions

import java.lang.StringBuilder

fun main() {
    println("=== APPLY ===")
    testApply()

    println("=== WITH ===")
    testWith()

    println("=== LAZY ===")
    testLazy()
}

fun testApply(){
    var p1 = Vector2D(0f, 0f).apply {
        x = 10f
        y = 10f
    }

    println(p1)
}

fun testWith(){
    var sb = with(StringBuilder()) {
        append(1)
        append(2)
        append(3)
    }

    println(sb)
}

fun testLazy(){
    val lazyGetString = lazy { getSomeString() }
    println("before get lazy")
    val value = lazyGetString.value
    println(value)
}

fun getSomeString(): String {
    println("in lazy")
    return "from lazy"
}