package com.DIO.collection

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2
    //aqui declaramos a variavel valor para imprimir
    for (valor in values){
        println(valor)
    }
    //uma função que ja usa a variavel it para iterar
    values.forEach {
        println(it)
    }
    //Neste caso a iteração é feita sobre o index,
    // então temos que passar a variavel e o index
    // para que seja exibido o conteudo como em java
    for (index in values.indices){
        println(values[index])
    }
    //função que ordena por padrão do menor pro maior
    values.sort()
    for (valor in values){
        println(valor)
    }
}