package org.mlooser.learn.kotlin.functions

infix fun String.getFirst(chars : Int) : String{
    return this.substring(0,chars);
}

fun main(){
    val result = "Kotlin" getFirst 2
    println(result)
}