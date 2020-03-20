package org.mlooser.learn.kotlin.functions

class Min {
    operator fun invoke(arg1: Int, arg2: Int): Int = if (arg1 < arg2) arg1 else arg2
    operator fun invoke(arg1: Int, arg2: Int, arg3: Int): Int = invoke(invoke(arg1, arg2), arg3)
}

fun main(){
    val min = Min()
    println("min 1, 2 = ${min(1,2)}")
    println("min 3, 2, 1 = ${min(3,2,1)}")
}