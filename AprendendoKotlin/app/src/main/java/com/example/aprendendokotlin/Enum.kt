package com.example.aprendendokotlin

//aguarda_aprovacao, pedido_realizado, pagamento_confirmado, pedido_enviado, pedido_entregue

enum class StatusPedido{
    AGUARDA_APROVACAO, // 0
    PEDIDO_REALIZADO, // 1
    PAGAMENTO_CONFIRMADO, // 2
    PEDIDO_ENVIADO, // 3
    PEDIDO_ENTREGUE
}

class Pedido(var total: Double = 0.0,
             var itens: String = "",
             var statusPedido: StatusPedido = StatusPedido.AGUARDA_APROVACAO
) {


}

fun main() {

    //Tela de compras
    val pedido = Pedido(125.90,"camiseta, livro")

    //Pagamento com cartão
    pedido.statusPedido = StatusPedido.PAGAMENTO_CONFIRMADO

    //Transportadora
    pedido.statusPedido = StatusPedido.PEDIDO_ENVIADO
    println("StatusPedido: ${StatusPedido.PEDIDO_ENVIADO.ordinal}")

    //Histórico de compras
    if (pedido.statusPedido == StatusPedido.PEDIDO_REALIZADO){
        println("O seu pedido foi realizado")
    }else if (pedido.statusPedido == StatusPedido.PAGAMENTO_CONFIRMADO){
        println("O seu pagamento foi confirmado")
    }else if (pedido.statusPedido == StatusPedido.PEDIDO_ENVIADO){
        println("O seu pedido foi enviado")
    }
}