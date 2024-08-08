package com.example.aprendendokotlin

fun retornaNome (){
    //Executa e retorna algo
}

const val pais = "Brasil" // Constante global - Disponível dentro do arquivo inteiro e não só dentro da função

const val nomeUsuário = "Natana"  // tempo de COMPILAÇÃO. O valor tem que estar explicito, disponivel para o compilador
// const val nomeUsuario2 = retornaNome() // Dá erro porque a fun pode retornar algo que o compilador não sabe o que é. O valor tem que estar explicito


fun main () {

    //  const val pais = "Brasil"  // ERRO

    var nomePessoa = "Natana" // variável mutável  -> Em tempo de execução
    nomePessoa = "Marcelo"

    val nomePessoa2 = "Paula" // imutável - constante

    val nome: String = "Oliveira"  // define que pode ser apenas string (Quando escreve String)
    val nome2 = retornaNome()  // tempo de EXECUÇÃO

    val idade1: Int = 20
    val idade2: Int = 30
    val resultado = idade1 + idade2

  //  val usuario = Usuario()  // instanciar um usuario

    println(resultado)
    println(nomeUsuário)
    println(nome)
}