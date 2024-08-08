package com.example.aprendendokotlin

fun somarNumeros( numero1:Int, numero2:Int ){ //Definir parametros -> nome do parametro:tipo do param.
    println( numero1 + numero2)
}

//Valor Padrão
fun somarNum( numero1:Int, numero2:Int = 0 ){ //Pode definir parametro como não obrigatorio
    // se o numero 2 for passado, utiliza o valor fornecido. Se não for passado, utiliza o 0
    println( numero1 + numero2)
}

fun somarNumerosNome( numero1:Int, numero2:Int, nome:String){
    //pode definir diferentes tipos de parametros
}

fun main(){
    somarNumeros(10,50)
    somarNumeros(numero2 = 5, numero1 = 25) //Parametro nomeado. Vantagem de colocar parametro em ordens diferentes
    somarNum(10) //Possui valor padrão
    somarNum(10,2) //Possui valor padrão
}
