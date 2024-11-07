package com.example.aulacomponenteslistagemcolecoes.teste

fun main() {

    val lista = arrayOf("Natana", 15, "Julia", "Paulo")
  //   println(lista[0])  // = a println( lista.get(0))
   // print( lista.size) //retorna o tamanho do array
   // print( lista.indexOf(15) ) //retorna a posição do elemento
   // println( lista.first() ) //retorna o primeiro da lista
   // print( lista.last() ) //retorna o ultimo da lista
   // println( lista.contains("Natana") ) //retorno true caso o item exista na lista e false se não existir

  //  val novaLista = lista.plus("João")
    lista.shuffle()  // Embaralha o array
    lista.forEach { item ->
      println(item)
    }

}