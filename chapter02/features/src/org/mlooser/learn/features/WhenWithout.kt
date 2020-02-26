package org.mlooser.learn.features

fun main() {
    printGreaterInfo(2,1);
    printGreaterInfo(2,3);
    printGreaterInfo(2,2);
}

fun printGreaterInfo(x: Int, y: Int) {
    when{
        x < y -> println("$x is smaller than $y")
        x == y -> println("$x equals $y")
        x > y -> println("$x is greater than $y")
    }
}