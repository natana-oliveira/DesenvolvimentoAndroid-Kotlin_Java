package com.example.aulacomponenteslistagemcolecoes.teste

fun main() {

   // val localizacao = Pair (10,20)
   // val localizacao = 10 to 20
   // val localizacao = "jamilton" to "ana"

    val localizacao = Triple (10,20,"Pizzaria")

    println( localizacao.first )
    println( localizacao.second )
    println( localizacao.third )

}