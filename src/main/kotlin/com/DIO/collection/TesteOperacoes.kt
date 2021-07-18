package com.DIO.collection

fun main() {
    val salarios = doubleArrayOf(1000.0,2250.0,4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("----------------------")
    println("MAior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")
    // ele aplica a expressão desejada e aplica on array
    // se for true ele aloca em outro array e mostra
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("------------")
    salariosMaiorQue2500.forEach(){println(it)}
}