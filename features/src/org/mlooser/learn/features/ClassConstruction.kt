package org.mlooser.learn.features

class Person constructor(val firstName:String, val lastName:String, val age : Int?) {
    constructor(firstName: String, lastName: String) : this(firstName,lastName,null)
    init {
        require(firstName.isNotEmpty()){"Invalid firstName argument."}
        require(lastName.isNotEmpty()){"Invalid lastName argument."}
    }
}

fun main(){
    var p = Person("David", "Hogan", 67)

    println("Person ${p.firstName}  ${p.lastName}, age: ${p.age?.toString()}")

    var p1 = Person("David", "", 67)
}