package com.DIO.collection

fun main() {
    //cria um array sem preocupar com o tamanho do array
    val values = intArrayOf(2,3,4,1,10,7)

    values.forEach { println(it) }
    println("---------------")
    values.sort()
    values.forEach { println(it) }

}