package com.example.aulacomponenteslistagemcolecoes.teste

fun main() {

    val listaNomes = listOf("ana", "carlos", "beatriz", "daniela", "fabio", "eliza")
    val listaNumeros = listOf(2,1,3,5)

   // val novaListaNumeros = listaNumeros.sorted() //ASC ascendente a-z, 0...10...20
    val novaListaNumeros = listaNumeros.sortedDescending() //DESC descendente z-z, 20...10...0
    println( novaListaNumeros )

    val listaNomesAsc = listaNomes.sorted()
    val listaNomesDesc = listaNomes.sortedDescending()
    println( listaNomesAsc )
    println( listaNomesDesc )

}