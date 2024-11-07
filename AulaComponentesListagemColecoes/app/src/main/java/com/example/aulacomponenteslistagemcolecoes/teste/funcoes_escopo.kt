package com.example.aulacomponenteslistagemcolecoes.teste

data class Produto(
    val nome: String,
    var preco: Double
){
    fun desativarProduto(){
        println( "Produto ${com.example.aulacomponenteslistagemcolecoes.teste.nome} com preço: $preco foi desativado!")
    }
}

fun salvarProduto( produto: Produto ){
}

class AlertaMensagem {
    fun configurarTitulo( titulo: String ) = println(titulo)
    fun configurarDescricao( descricao: String ) = println(descricao)
    fun configurarCancelar() = println("Ação de cancelar")
    fun configurarConfirmar() = println("Ação de confirmar")
}

fun main() {

    val alertaMensagem = AlertaMensagem()
    /*alertaMensagem.configurarTitulo("Confirmar salvar?")
    alertaMensagem.configurarDescricao("Você tem certeza...")
    alertaMensagem.configurarCancelar()
    alertaMensagem.configurarConfirmar()*/

    /*alertaMensagem.apply {
        configurarTitulo("Confirmar salvar?")
        configurarDescricao("Você tem certeza...")
        configurarCancelar()
        configurarConfirmar()
    }*/

    val lista = listOf("jamilton", "ana", "pedro")

    lista
        .map { it.uppercase() }
        .run {
            println(this)
        }


    /*    var produto: Produto? = null

        // Usuário é que pode escolher ou não um produto
         produto = Produto ("Notebook", 1200.00)*/

/*    if ( produto != null ){ // se produto não for nulo
        produto.preco = 1100.00
        salvarProduto( produto )
    }*/

    //chamada segura para ter certeza que o produto existe
/*    produto?.let { item -> // altera itens e garante que não estão nulo
        item.preco = 1100.00
        salvarProduto( produto )
    }*/

/*    produto?.let { //Versão resumida
        it.preco = 1100.00
        salvarProduto( it )
    }*/

  //  produto?.run { desativarProduto() } //inicializa o objeto e faz modificações nele

/*
    with( produto ){
        desativarProduto()
    }

    println( produto?.nome )
    println( produto?.preco )
*/

}