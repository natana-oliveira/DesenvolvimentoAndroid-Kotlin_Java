package com.example.aprendendokotlin

class Carro {

    var cor = "vermelho"

    fun acelerar (){
        //***
    }
}

fun main(){

    var carro:Carro? = null
    //carro = Carro()


    // println(carro?.cor) // O '?' - Chamada segura" verifica se carro não está nulo. Se existir o carro ele chama a cor.
                          // Se não existir o carro ele não faz nada

    //ELVIS operator
    val cor = carro?.cor ?: "cor padrão" // testa se o carro está nulo (no caso está) então não acessa a cor do carro e exibe a cor padrão
    println(cor)

 //   if (carro != null){
//      print(carro.cor)
//  }


}