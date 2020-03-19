package org.mlooser.learn.kotlin.functions

class Vector2D(var x: Float, var y: Float) {
    operator fun plus(other: Vector2D): Vector2D {
        return Vector2D(x + other.x, y + other.y)
    }

    operator fun minus(other: Vector2D): Vector2D {
        return Vector2D(x - other.x, y - other.y)
    }

    operator fun unaryMinus(): Vector2D {
        return Vector2D(-x, -y)
    }

    fun length(): Float {
        return kotlin.math.sqrt(x * x + y * y)
    }

    override fun toString(): String {
        return "Vector2D(x=$x, y=$y)"
    }

}

class Cirlce(var middle: Vector2D, var radius: Float) {
    operator fun contains(point: Vector2D): Boolean {
        return (middle - point).length() < radius;
    }

    override fun toString(): String {
        return "Cirlce(middle=$middle, radius=$radius)"
    }

}

fun main(){
    val p1 = Vector2D(2f,2f)
    val p2 = Vector2D(1f, 1f)

    println("$p1 - $p2 = ${p1 - p2}")

    val circle = Cirlce(Vector2D(0f,0f),3f)
    val p3 = Vector2D(1f,1f)

    println("$circle contains $p3 = ${p3 in circle}")
}