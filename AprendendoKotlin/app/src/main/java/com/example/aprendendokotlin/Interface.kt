package com.example.aprendendokotlin

interface Presidenciavel {
    fun candidatar()
}

abstract class Pessoa {
    fun comer() = println("comer")

}

class DesenvolvedorAndroid : Pessoa() {
    fun programar() = println("programar")
}

class DesenvolvedorWeb : Pessoa() {
    fun programar() = println("programar")
}

class FuncionarioPublico : Pessoa() {
    fun escrever() = println("escrever Notícia")
}

class Jornalista : Pessoa(), Presidenciavel {
    override fun candidatar() {
        println("Fazer processo para se candidatar")
    }
}

fun main() {

    val desenvolvedorAndroid = DesenvolvedorAndroid()
    desenvolvedorAndroid.comer()

    println("----------------")

    val jornalista = Jornalista()
    jornalista.comer()
    jornalista.candidatar()

}