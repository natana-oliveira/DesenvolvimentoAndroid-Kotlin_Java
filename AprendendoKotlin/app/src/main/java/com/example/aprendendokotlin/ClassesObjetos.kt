package com.example.aprendendokotlin

class Jogador {

    var kart = ""
    var pneu = ""
    var planador = ""

    fun acelerar( aceleracao:Int = 0){ //Essa função passa a ser método porque está dentro da classe, se estivesse fora era uma função
        //para utilizar o método é precisar instanciar um jogador (classe)
        println("acelerar na velocidade: $aceleracao km/h")
    }

//    fun retornarPoder():String{
//        return "Casco vermelho"
//    }

    fun retornarPoder():String = "Casco vermelho" //Inline

}


fun main(){

    val jogador = Jogador()
   // jogador.kart = "Kart do Mario"
    jogador.acelerar(80)
    // println(jogador.kart)
    val poder = jogador.retornarPoder()
    println("Poder recuperado: $poder")

}
