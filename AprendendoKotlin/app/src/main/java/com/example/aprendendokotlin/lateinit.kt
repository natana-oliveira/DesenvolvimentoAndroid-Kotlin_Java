package com.example.aprendendokotlin

// 1) valor  2) null  3)LATEINIT
class Produto {
  // 1)  var descricao: String = ""
  // 2)  var descricao: String? = null
  // 3
    lateinit var descricao: String //Não inicializa aqui

}

fun main() {
    val produto = Produto()
    produto.descricao = "Notebook" // Iniciar produto
    println(produto.descricao)

}