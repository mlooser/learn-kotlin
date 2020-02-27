package org.mlooser.learn.features

import java.lang.IllegalArgumentException
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

data class Command(val timestamp: Long)

@ExperimentalContracts
fun main() {
    val command: Command = Command(123)
    processAny(command)
    processAny(123)
}

@ExperimentalContracts
fun processAny(any: Any?) {
    if(isCommand(any)){
        println("Arg is Command")
        processCommand(any)
    }
    else{
        println("Arg is not Command")
    }
}

@ExperimentalContracts
fun processCommand(command: Command?) {
    validate(command);
    println(command.timestamp)
}

@ExperimentalContracts
fun validate(command: Command?) {
    contract {
        returns() implies (command != null)
    }

    if (command == null)
        throw IllegalArgumentException("'command' can't be null")
}

@ExperimentalContracts
fun isCommand(any: Any?): Boolean {
    contract {
        returns(true) implies (any is Command)
    }
    return any is Command
}