package com.example.aulacomponenteslistagemcolecoes.teste

import java.io.Serializable

//DRY - Dont Repeat Yourself (Não repita código)
// Divisão de responsabilidades
// Classes devem UTILIZAR OUTRAS CLASSES
// Alto Acoplamento e Baixo Acoplamento
class Musico(val instrumento: Instrumento) {
    fun tocar(){
        println("Musico tocando")
        instrumento.sendoTocado()
    }
}

//Herança e Interface (Contrato) -> Composição (Adiciona mais possibilidades)
//abstract class Instrumento {
//    abstract fun sendoTocado()
//}

interface Instrumento { //Herança abre e fecha (). A interface só utiliza {}
    fun sendoTocado()
}

// Int e String - tipos: Violão e Bateria
class Violao : Instrumento { //herança de instrumento //DOIS TIPOS: Violao, Instrumento
    override fun sendoTocado() {
        println("Utilizando cordas")
        println("para tocar violão")
    }

    fun ajustarCordas(){
        println("Ajustar cordas")
    }
}

class Bateria : Instrumento { //DOIS TIPOS: Bateria, Instrumento
    override fun sendoTocado() {
        println("Utilizando baquetas")
        println("para tocar bateira")
    }

    fun ajustarBaqueta(){
        println("Ajustar baqueta")
    }
}

class Guitarra : Instrumento{
    override fun sendoTocado() {
        println("Utilizando cordas")
        println("Ajuste de som")
        println("para tocar guitarra")
    }
}

class Fornecedor : java.io.Serializable {

}

class Intent {
    fun putExtra( chave: String, serializable: Serializable){

    }
}

fun main() {

    val fornecedor = Fornecedor()//tipo: Fornecedor, Serializable
    val intent = Intent()
    intent.putExtra("fornecedor", fornecedor )

/*    //Instrumento primeiro pela herança. Violão() é classe filha
    val violao : Instrumento = Violao() //violão (val) é do tipo instrumento que tem um tipo violão
    val bateria : Instrumento = Bateria()

    //Tela 1 App (violão)
    val violao1 = Violao()
    val musico1 = Musico( violao1 )
    musico1.tocar()

    println("------------------")

    //Tela 2 (violão)
    val violao2 = Violao()
    val musico2 = Musico( violao2 )
    musico2.tocar()

    println("------------------")

    //Tela 3 (bateria)
    val bateria1 = Bateria()
    val musico3 = Musico( bateria1 ) //Bateria como instrumento (apenas métodos de instrumento)
    musico3.tocar()

    println("------------------")

    //Tela 4 (guitarra)
    val guitarra1 = Guitarra()
    val musico4 = Musico( guitarra1 ) //Bateria como instrumento (apenas métodos de instrumento)
    musico4.tocar()*/

}