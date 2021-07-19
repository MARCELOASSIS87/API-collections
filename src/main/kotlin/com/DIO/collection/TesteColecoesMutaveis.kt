package com.DIO.collection

fun main() {
    val joao = Funcionario("joao", 2000.0, "CLT")
    val pedro = Funcionario("pedro", 1500.0, "PJ")
    val maria = Funcionario("maria", 4000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("--------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("--------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("---------SET-----------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarios.forEach { println(it) }

    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarios.forEach { println(it) }

    println("--------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}