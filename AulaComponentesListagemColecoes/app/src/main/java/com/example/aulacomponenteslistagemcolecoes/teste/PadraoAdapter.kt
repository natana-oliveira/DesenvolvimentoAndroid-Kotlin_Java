package com.example.aulacomponenteslistagemcolecoes.teste

class TomadaAntiga ( val conector: Conector ) {
    fun passarEnergia(){
        val qtdPinos = conector.quantidadePinos()
        if ( qtdPinos == 2 ){
            conector.ligarAparelho()
            println("Quantidade de pinos: $qtdPinos")
            println("Passando energia")
        }else{
            println("Essa tomda dó funciona com 2 pinos, você passou: $qtdPinos")
        }
    }
}

interface Conector {
    fun quantidadePinos() : Int
    fun ligarAparelho()
}

class ConectorAdaptador ( val conectorNovoPadrao: ConectorNovoPadrao) : Conector {
    override fun quantidadePinos(): Int {
       return 2
    }

    override fun ligarAparelho() {
        conectorNovoPadrao.ligarAparelho()
    }
}

class ConectorNovoPadrao : Conector {
    override fun quantidadePinos() : Int {
       // println("3 pinos")
        return 3
    }

    override fun ligarAparelho(){
        println("Aparelho está ligado")
        println("... Mais de 20 linhas de código ...")
    }
}

fun main() {

    val conectorNovoPadrao = ConectorNovoPadrao()

    val conectorAdaptador = ConectorAdaptador( conectorNovoPadrao ) // conecta o novo conector no adaptador

    val tomadaAntiga = TomadaAntiga( conectorAdaptador ) // e o adapatador conecta na tomada antiga
    tomadaAntiga.passarEnergia()

}