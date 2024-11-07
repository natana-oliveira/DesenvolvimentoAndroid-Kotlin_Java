package com.example.aulacomponenteslistagemcolecoes.teste

data class Cliente(
    val nome: String,
    val idade: Int
)

fun main() {

    val cliente1 = Cliente("Ana", 32)
    val cliente2 = Cliente("Juliana", 34)
    val cliente3 = Cliente("Pedro", 45)

    val listaClientes = mutableListOf(cliente1, cliente2, cliente3)

   // val listaArray = mutableListOf("jamilton", "ana")
    // listaArray[0]= "jamilton ALTERADO" //Altera listas mutavéis
   // listaArray.add("marcia") //Adiciona na lista

   // val novaLista = listOf("marcelo", "marcela")
   // listaArray.addAll( novaLista ) //Adiciona todos os itens

   // listaArray.remove("ana")
   // listaArray.removeAt(1) //remove pelo index
   // listaClientes.clear()
    // listaClientes.size

    val novaLista= listaClientes.shuffled()


    novaLista.forEach { cliente ->
        println( "${cliente.nome} - ${cliente.idade} ")
    }

/*    listaClientes.forEach { cliente ->
        println( "${cliente.nome} - ${cliente.idade} ")
    }*/

}