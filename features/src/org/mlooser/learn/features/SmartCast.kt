package org.mlooser.learn.features

fun main(args: Array<String>) {
    println("Test with non string")
    printStringLen(1);
    println("Test with string")
    printStringLen("test");
}

fun printStringLen(any : Any){
    if(any is String){
        println(any.length);
    }
}