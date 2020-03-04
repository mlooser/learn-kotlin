package org.mlooser.learn.features

inline class Millis(val time: Long)

fun showTime(millis: Millis) {
    println("${millis.time} millis")
}

inline class Seconds(val time: Long) {
    fun toMillis(): Millis = Millis(1000 * time)
}

inline class Minutes(val time: Long) {
    fun toMillis(): Millis = Seconds(60 * time).toMillis()
}

inline class Hours(val time: Long) {
    fun toMillis(): Millis = Minutes(60 * time).toMillis()
}

fun main() {
    println("2 hours are")
    showTime(Hours(2).toMillis())
}