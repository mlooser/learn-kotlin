package org.mlooser.learn.features

interface PersonFactory {
    fun create(firstName: String, lastName: String): SomePerson
}

class SomePerson private constructor(val firstName: String, val lastName: String) {
    companion object : PersonFactory {
        override fun create(firstName: String, lastName: String): SomePerson {
            return SomePerson(firstName, lastName)
        }
    }
}

fun main() {
    val p = SomePerson.create("Ma", "Lu")

    println("Hello ${p.firstName} ${p.lastName}")
}
