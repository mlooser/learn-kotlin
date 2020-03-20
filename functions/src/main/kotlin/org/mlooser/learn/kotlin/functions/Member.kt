package org.mlooser.learn.kotlin.functions

object Rectangle{
    fun printArea(width : Int, height : Int){
        val area = calculateArea(width, height)
        println("area = $area")
    }

    fun calculateArea(width : Int, height : Int) = width * height
}

fun main(){
    Rectangle.printArea(4,5)
}