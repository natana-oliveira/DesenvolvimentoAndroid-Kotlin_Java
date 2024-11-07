package com.example.aulacomponenteslistagemcolecoes.teste

fun main() {

    val lista = listOf("jamilton", "ana", "pedro", "maria", "tiago ")

/*
    lista.forEach { nome ->
        println( nome.uppercase() )          // método que converte em maisculas
    }
*/

/*    val novaLista = lista.map { nome ->   //Map é semelhante ao forEach. Ele percorre cada um dos itens da lista
                nome.uppercase()        // e dentro das {...} aplica uma transformação que será feita nos itens
        "+$nome"
    }*/

        val novaLista = lista.map { it.uppercase() } //versão reduzida

    println( novaLista )

}