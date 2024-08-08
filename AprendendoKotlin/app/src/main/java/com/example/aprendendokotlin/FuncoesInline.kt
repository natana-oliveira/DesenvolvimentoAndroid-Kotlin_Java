package com.example.aprendendokotlin

//fun subtrair(){  //Função PADRÃO
//    println(10 - 8)
//}

//Inline Function
fun subtrair() = println(10 - 8) // sem retorno

fun subtrair2():Int = 10 - 5 //com retorno

fun main(){
    subtrair()
    val subtracao = subtrair2()
    println(subtracao)
}