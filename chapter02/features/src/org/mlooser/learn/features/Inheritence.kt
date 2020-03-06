package org.mlooser.learn.features

import java.math.BigDecimal

enum class CardType {
    Visa, MasterCard, Amex
}

open class Payment(val amount: BigDecimal)

class CardPayment(amount: BigDecimal, val number: String, val type: CardType) : Payment(amount) {

}

class ChequePayment : Payment {
    constructor(amount: BigDecimal, name: String, bankId: String) : super(amount) {
        this.name = name
        this.bankId = bankId;
    }

    var name: String
        get() = this.name

    var bankId: String
        get() = this.bankId
}

fun main(){
    val cardPayment = CardPayment(BigDecimal.TEN, "123", CardType.Visa)
    val chequePayment = ChequePayment(BigDecimal.TEN, "Ma Lu", "pko")
    println("OK")
}