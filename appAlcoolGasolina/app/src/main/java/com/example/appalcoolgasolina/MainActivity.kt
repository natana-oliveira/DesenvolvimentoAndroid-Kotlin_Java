package com.example.appalcoolgasolina

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    //Criar os atributos
    private lateinit var textInputAlcool: TextInputLayout //o ID "textInputAlcool" é do tipo TextInputLayout
    private lateinit var editAlcool: TextInputEditText //o ID "editAlcool" é do tipo TextInputEditText

    private lateinit var textInputGasolina: TextInputLayout
    private lateinit var editGasolina: TextInputEditText

    private lateinit var btnCalcular: Button
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicializarComponentesInterface()

        btnCalcular.setOnClickListener {
            calcularMelhorPreco()
        }
    }

    private fun calcularMelhorPreco() {
        val precoAlcool = editAlcool.text.toString() //recuperar o preço fornecido
        val precoGasolina = editGasolina.text.toString()

        val resultadoValidacao = validarCampos(precoAlcool, precoGasolina)

        if (resultadoValidacao){ //Testar o resultado da validação - So executa se validarCampos for true

         /*   Calculo e melhor preço
              se (valorAlcool / valorGasolina) >= 0.7 é melhor utilizar precoGasolina
              senão é melhor utilizar álcool
          */

            val resultado = precoAlcool.toDouble() / precoGasolina.toDouble() //Converter de String (recebida no input) para double (número)
            if (resultado >= 0.7){
                textResultado.text = "GASOLINA é a melhor opção"
            }else{
                textResultado.text = "ÁLCOOL é a melhor opção"
            }


        }

    }

    private fun validarCampos(pAlcool: String, pGasolina: String): Boolean {

            textInputAlcool.error = null //Inicia app sem estar a mensagem de erro marcada e só aparece se o campo estiver vazio - IF...
            textInputGasolina.error = null

            if (pAlcool.isEmpty()){ //se o preço estiver vazio
            textInputAlcool.error = "Digite o preço do álcool" //Exibe mensagem para o usuário
            return false
        }else if (pGasolina.isEmpty()){
            textInputGasolina.error = "Digite o preço da gasolina"
            return false
        }

        return true
    }

    private fun inicializarComponentesInterface() { //Configurar itens
        textInputAlcool = findViewById(R.id.text_input_alcool)
        editAlcool = findViewById(R.id.edit_alcool)

        textInputGasolina = findViewById(R.id.text_input_gasolina)
        editGasolina = findViewById(R.id.edit_gasolina)

        btnCalcular = findViewById(R.id.btn_calcular)
        textResultado = findViewById(R.id.text_resultado)
    }
}