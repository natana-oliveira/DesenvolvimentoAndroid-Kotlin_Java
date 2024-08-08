package com.example.aprendendokotlin


class Veiculo(
    var modelo: String = "",
    var velocidade: Int = 0
){

    companion object {
        const val VELOCIDADE_MAX_PERMITIDA = 120
        fun exibirVelocidadeMax(){
            println("Velocidade Máxima: $VELOCIDADE_MAX_PERMITIDA")
        }
    }

    fun exibirInformacoes(){
        println("Informações: $modelo e $velocidade km/h")
    }

}

class Usuario {

    //Métodos estáticos - comparado com o "static" no JAVA
    companion object {
        fun verificarUsuarioLogado(): Boolean {
            return true
        }
    }
}

fun main() {

   // val usuario = Usuario()
  //  usuario.verificarUsuarioLogado()

    val retorno = Usuario.verificarUsuarioLogado()
    println("Usuário logado: $retorno")

/*
    println("Velocidade Máxima: ${Veiculo.VELOCIDADE_MAX_PERMITIDA}")

    val fusca = Veiculo("Fusca", 100) //Criando uma instância ou objeto
    fusca.exibirInformacoes()
    Veiculo.exibirVelocidadeMax()

    val ferrari = Veiculo("Ferrari", 250) //Criando uma instância ou objeto
    ferrari.exibirInformacoes()

    println(" ${Math.PI}")
*/





}
