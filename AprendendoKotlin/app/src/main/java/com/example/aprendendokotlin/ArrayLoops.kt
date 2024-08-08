package com.example.aprendendokotlin

fun main (){

//    val nomes = arrayOf( "Ana", "Maria", "Natana")
//    nomes[0] = "mudou" //muda porque não é o array inteiro, é apenas a posição
//
//    println( nomes [0])

    // não posso recriar esse mesmo array...
    // nomes = arrayOf("teste")
    // poderia mudar se fosse var nomes = arrayOf(...)



//    var numero = 1 //var porque pode ser mudada por causa do numero++
//    while (numero <= 5 ){
//        println("Executou: $numero") //dollar concatena dentro da própria aspas -  "templates do kotlin"
//        numero++
//    }


    // ---------------------------


//        var numero = 1 //var porque pode ser mudada por causa do numero++
//        while (numero in 1..8) {
//            println("Executou: $numero")
//            numero++
//        }



    // ---------------------------


    // mais limpo e mais fácil que o while
    // não é preciso colocar var porque o for já entende que é uma variável

//    for (numero in 1..5){ //numero vai armazenar o que é percorrido
//        println("Executou: $numero")
//    }


    // ---------------------------

    val postagens = arrayOf(
        "Viagem para praia",
        "Cachorro feliz",
        "Trilha com amigos"
    )

    // IMPRIMIR SEM ÍNDICES
//    for (postagem in postagens){ // para cada postagem dentro de postagens (array) ele vai percorrer e exibir
//        println("Título: $postagem")
//    }

    // IMPRIMIR COM ÍNDICES
    for ((indice, postagem) in postagens.withIndex()){ //
        println("$indice: $postagem")
    }
}