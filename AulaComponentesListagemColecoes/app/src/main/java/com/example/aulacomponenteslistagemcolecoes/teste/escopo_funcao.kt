package com.example.aulacomponenteslistagemcolecoes.teste

class Pessoa {
    val nome= "" // Nome tem escopo local, só pode ser visto dentro desta classe
}

var nome = "luisa" // Escopo global - fora class

fun executar() {
  //  val nome= "" // Escopo local

    nome = "executou novo nome Ana"
}

fun main() {

    nome = "Pedro"
    executar()
    println(nome)
}