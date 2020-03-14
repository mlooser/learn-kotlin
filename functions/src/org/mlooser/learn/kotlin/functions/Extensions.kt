package org.mlooser.learn.kotlin.functions

import kotlin.math.min

fun <E> List<E>.drop(k: Int): List<E> {
    val resultSize = this.size - k
    return when {
        resultSize <= 0 -> emptyList<E>()
        else -> {
            val resultList = ArrayList<E>(resultSize)
            for (index in k until this.size) {
                resultList.add(this[index])
            }
            resultList
        }
    }
}

fun <E> List<E>.top(topElements: Int): List<E> {
    val newTopElements = min(this.size, topElements)
    val resultList = ArrayList<E>(newTopElements)

    for (index in 0 until newTopElements) {
        resultList.add(this[index])
    }
    return resultList
}

fun main() {
    val testList = listOf(1, 2, 3, 4, 5)
    val resultList = testList
        .drop(2)
        .top(2)

    println(resultList)
}
