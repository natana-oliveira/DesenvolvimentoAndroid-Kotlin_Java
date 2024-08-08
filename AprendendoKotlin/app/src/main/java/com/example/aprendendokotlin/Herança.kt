package com.example.aprendendokotlin

//Classe pai ou super classe , abstrata
//open class Animal { //Open permite a herança da classe
abstract class Animal { //Definir como abstrata para não ser instanciada (por ser muito genêrica)
    var cor = ""
    var tamanho = "" //Pequeno, médio e grande
    var peso = 0.0

    open fun correr() = print("Correr como um ") //Método em linha "inline"

    abstract fun dormir() //Toda classe que herdar de animal obrigatoriamente precisa ter um método dormir (Quando é abstract)
}

//Subclasse ou classe filha, Concreta
class Cao : Animal() { //extends
    fun latir() = println("Latir")

    override fun correr(){ //sobrescrever o método da classe pai
        super.correr() //Acessar a superclasse, "executa aquele bloco de código"
        println("cão de 4 patas")
    }

    override fun dormir() {
        println("Dormir")
    }
}

class Passaro : Animal() {
    fun voar() = println("Voar")

    override fun correr(){ //sobrescrever o método da classe pai
        println("Correr como um pássaro de 2 patas")
    }

    override fun dormir() {
        println("Dormir como um pássaro")
    }
}

fun main(){
    val cao = Cao()
    val passaro = Passaro()

    cao.cor = "Castanho"
    cao.correr()
    cao.latir()

    passaro.dormir()
    passaro.voar()
    passaro.correr()

}