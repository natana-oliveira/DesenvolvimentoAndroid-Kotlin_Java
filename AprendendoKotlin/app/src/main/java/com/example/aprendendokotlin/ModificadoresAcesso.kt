package com.example.aprendendokotlin

open class Carro2 { //open por causa da herança

   // var modelo = ""

/*
    private fun injetarCombustivel(){ //Private permite que o método seja usado apenas dentro da classe
        println("Injetação do combustível")
    }
*/

    protected open fun injetarCombustivel(){ //Protected e o open permite herança, mas fica visível apenas dentro da classe
        println("Injetação do combustível")
    }

    fun acelerar(){
        injetarCombustivel()
        println("Acelerar o carro")
    }

}

class Gol : Carro2 (){
    override fun injetarCombustivel() {
        super.injetarCombustivel()
    }

}

class Ferrari : Carro2 (){
    override fun injetarCombustivel() {
        super.injetarCombustivel()
        println("Mais potencia")
    }

}

fun main(){

    /*
    Uber (2 Módulos diferentes)
         - Motorista app só do motorista
         - Passageiro app só do motorista

    Ifood
         - Cliente
         - Restaurante
*/

/*    val carro = Carro2()
    carro.acelerar() */

    val gol = Gol ()
    gol.acelerar()

    val ferrari = Ferrari()
    ferrari.acelerar()

}