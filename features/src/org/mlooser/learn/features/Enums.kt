package org.mlooser.learn.features

interface Printable{
    fun print()
}

enum class Shape(val corners:Int) : Printable{
    Circle(0) {
        override fun print() {
            println("Circle with $corners corners")
        }
    },
    Triangle(3){
        override fun print() {
            println("Triangle with $corners corners")
        }
    },
    Rectangle(4){
        override fun print() {
            println("Rectangle with $corners corners")
        }
    }
}

fun main(){
    Shape.Circle.print()
    Shape.Triangle.print()
    Shape.Rectangle.print()
}