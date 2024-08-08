package com.example.aprendendokotlin

/*
// MODO 1 - Construtor primário
class Usuario constructor(nome: String, sobrenome: String){ //a palavra Construtor é opcional

    var nome: String = ""  //Propriedade
    var sobrenome: String = "" //Propriedade

    init {//Inicializar
        this.nome = nome //Propriedade = parametro
        this.sobrenome = sobrenome
        println("Objeto inicializado")
        println("nome: $nome - sobrenome: $sobrenome")
    }
}
*/


/*
// MODO 2 - Construtor primário versão resumida
class Usuario (
    var nome: String = "",
    var sobrenome: String = ""
){

    init {
          println("Objeto inicializado")
        println("nome: $nome - sobrenome: $sobrenome")
    }

    constructor(nome: String): this(nome, ""){ //Construtor secundário
        println("Construtor secundário")
    }
}

fun main(){
  //  val usuario = Usuario("Natana", "Oliveira")
    val usuario = Usuario("Natana")

}*/
