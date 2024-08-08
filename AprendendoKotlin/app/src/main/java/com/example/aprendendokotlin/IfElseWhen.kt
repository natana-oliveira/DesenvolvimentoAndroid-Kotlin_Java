package com.example.aprendendokotlin

fun main(){

//    val notaAluno = 5
//    val condicao = notaAluno >= 6
//
//    if (condicao){
//        println("Aluno Aprovado")
//    }else{
//        println("Aluno Reprovado")
//    }


    // ---------------------------


//    val opcao = 12
//
//    if (opcao == 1){
//        println("Cartão de crédito")
//    }else if (opcao == 2){
//        println("Extrato bancário")
//    }else if (opcao == 3){
//        println("Saldo")
//    }else{
//        println("Sair")
//    }


    // ---------------------------


//    val opcao = 1
//    if (opcao in 1..3 ){ // testando se opcao está entre 1 e 3
//        println("opções entre 1,2 e 3")
//    }else if (opcao in 4..8 ){
//        println("opções entre 4 até 8")
//    }


    // ---------------------------
        val opcao = 3

    when(opcao){   // similar switch em java
        1 -> println("Cartão de crédito")
        2 -> println("Extrato bancário")
        in 3..5 -> println("Saldo")
        else -> println("Nenhuma opção selecionada")
    }

}