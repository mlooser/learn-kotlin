package org.mlooser.learn.kotlin.functional

fun main(){
    var containsNegatives = false;

    val ints = listOf(-1,0,2)

    ints.forEach{if (it<0) containsNegatives = true}

    println("$ints contains negatives = $containsNegatives")
}