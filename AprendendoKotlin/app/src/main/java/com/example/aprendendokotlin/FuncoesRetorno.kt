package com.example.aprendendokotlin

//Sem retorno
fun dividir(){
    println( 15 / 3)
}

//Com retorno
fun somar(): Int{ //Definir o tipo de retorno
    return 10
 }


fun main(){
    dividir()
    val soma = somar() //Precisa capturar o valor do retorno em uma variável
    println(soma)
    println(soma + 5)
}