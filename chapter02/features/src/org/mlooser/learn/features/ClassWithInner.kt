package org.mlooser.learn.features

class Owner(val name : String){
    inner class Inner(val name:String){
        fun printInfo(){
            println("Inner $name in owner ${this@Owner.name}")
        }
    }
}

fun main(){
    val owner = Owner("OOO")
    val inner = owner.Inner("III")

    inner.printInfo();
}
