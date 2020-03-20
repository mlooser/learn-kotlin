package org.mlooser.learn.kotlin.functions

class Particle

open class Element(val name: String) {
    fun react(particle: Particle) {
        particle.doReact(name)
    }

    open fun Particle.doReact(name: String) {
        println("$name is reacting with particle")
    }
}

class NobleGas(name: String) : Element(name) {
    override fun Particle.doReact(name: String) {
        println("$name is noble , it doesn't react with particles")
    }
}

fun main() {
    val helium: Element = NobleGas("Helium")
    helium.react(Particle())
}