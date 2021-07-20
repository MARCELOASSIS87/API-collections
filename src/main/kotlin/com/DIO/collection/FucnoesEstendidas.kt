package com.DIO.collection

import java.math.BigDecimal

//Extension functions = nos da a possibilidade de criarmos
//funcoes diversas sobre um tipo especifico
//sem precisar herdar

fun Array<BigDecimal>.somatoria() = this.reduce{
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
        else this.somatoria() / this.size.toBigDecimal()



