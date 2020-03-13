package org.mlooser.learn.kotlin.functions

fun square(k: Int) = k * k

fun square2(k: Int): Int = k * k

fun main(){
    println("square(2) ${square(2)}")
    println("square2(2) ${square2(2)}")
}