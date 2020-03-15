package org.mlooser.learn.features


fun main(args:Array<String>){
    println("isZero for 1 is ${isZero(1)}")
    println("isZero for 0 is ${isZero(0)}")
}

fun isZero(i:Int) : Boolean{
    return if(i==0)  true else false
}