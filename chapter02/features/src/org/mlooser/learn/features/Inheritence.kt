package org.mlooser.learn.features

import java.math.BigDecimal

enum class CardType {
    Visa, MasterCard, Amex
}

open class Payment(val amount: BigDecimal)

class CardPayment(amount: BigDecimal, val number: String, val type: CardType) : Payment(amount) {
    val description
        get() = "$amount $number $type"
}

class ChequePayment : Payment {
    constructor(amount: BigDecimal, name: String, bankId: String) : super(amount) {
        this.name = name
        this.bankId = bankId;
    }

    private var name: String
    private var bankId: String
    val description
        get() = "$amount $name $bankId"
}

fun main() {
    val cardPayment = CardPayment(BigDecimal.TEN, "123", CardType.Visa)
    val chequePayment = ChequePayment(BigDecimal.TEN, "Ma Lu", "pko")

    println("Card Payment ${cardPayment.description}")
    println("Cheque Payment ${chequePayment.description}")
}