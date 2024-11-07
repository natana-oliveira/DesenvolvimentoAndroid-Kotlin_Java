package com.example.aulacomponenteslistagemcolecoes.teste

fun main() {

   // val lista = setOf("jamilton", "ana", "maria", "ana") //itens não se repete

    val lista = mutableSetOf("jamilton", "ana", "maria", "ana")

   // val novaLista = lista.plus("jopa") // adiciona
   // val novaLista2 = lista.plus("ana") //não adiciona pq repete
    //println(lista.size)
   // println( lista.indexOf("ana") )

    lista.add("mariana")
    lista.remove("ana")
    lista.clear()

    lista.forEach { nome ->
        println( nome )
    }
}