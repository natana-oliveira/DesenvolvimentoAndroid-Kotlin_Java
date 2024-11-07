package com.example.aulacomponenteslistagemcolecoes.teste

fun main() {

/*    val listaFrutas = listOf("maça", "laranja", "banana", "pera")

    val novaLista = listaFrutas.filter { fruta ->
        fruta == "laranja"
    }*/

    val listaVendas = listOf(100, 500, 250, 1500, 650, 800, 320, 722 )

/*    val novaLista = listaVendas.filter { valor ->
        valor >= 600
    }*/

        val novaLista = listaVendas.filter { it >= 600 //versão reduzida
    }
    //println( novaLista)

    val nomes = listOf("Ana", "Joana", "Tamara", "Filipe", "Pedro")

    val listaNomes = nomes.filter { nome ->
        nome.contains("a") //true false Imprime apenas os que contem "a"
    }

    println( listaNomes)

}