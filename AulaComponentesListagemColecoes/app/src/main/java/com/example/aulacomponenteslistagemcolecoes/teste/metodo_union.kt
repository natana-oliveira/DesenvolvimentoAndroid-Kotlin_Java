package com.example.aulacomponenteslistagemcolecoes.teste

fun main() {

    val listaLanches = listOf("Hamburger", "Batata frita", "pizza")
    val listaEntradas = listOf("Canapes", "Bruschetta", "azeitonas")

   // val novaListaComidas = listaEntradas.union( listaLanches )
    val novaListaComidas = listaEntradas + listaLanches  // Igual a de cima resumido

    val listaExclusao = listOf("Batata frita", "azeitona") // Exclui este item
    val listaCompleta = novaListaComidas - listaExclusao

    println(listaCompleta)

}