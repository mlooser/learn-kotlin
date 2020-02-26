package org.mlooser.learn.features

fun main() {
    val strings = arrayOf("a", "b", "stop", "c")

    println("printUntilStop")
    printUntilStop(strings, "stop")

    println("printAllButSkip")
    printAllButSkip(strings, "stop")
}

fun printUntilStop(strings: Array<String>, stop: String) {
    strings.forEach {
        if (it == stop) return
        else println(it)
    }
}

fun printAllButSkip(strings: Array<String>, skip: String) {
    strings.forEach {
        if (it == skip) return@forEach
        else println(it)
    }
}