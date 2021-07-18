package com.DIO.collection

fun main() {
    //por padrão a funcao array espera a inicializacao e o size do array
    val nomes = Array(3){""}
    nomes[0] = "maria"
    nomes[1] = "zaza"
    nomes[2] = "jose"

    for (nome in nomes) println(nome)
    println("--------------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("--------------------------")
    val nomes2 = arrayOf("maria","zaza","pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}