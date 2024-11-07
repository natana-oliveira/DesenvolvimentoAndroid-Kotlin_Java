package com.example.calculatorimc

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoActivity : AppCompatActivity() {

    private lateinit var textPeso : TextView // 6. Configurar textos segunda tela
    private lateinit var textAltura : TextView
    private lateinit var textResultado : TextView
    private lateinit var btnVoltar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        textPeso = findViewById(R.id.text_peso) // 7. Encontrar textos na tela de layout
        textAltura = findViewById(R.id.text_altura)
        textResultado = findViewById(R.id.text_resultado)
        btnVoltar = findViewById(R.id.btn_voltar)

        // 8. Recebendo Dados da Atividade Anterior
        val bundle = intent.extras // Recuperando o Bundle

        if  (bundle != null){
            val peso = bundle.getDouble("peso")
            val altura = bundle.getDouble("altura")

            textPeso.text = "Peso: $peso Kg"
            textAltura.text = "Altura: $altura mts"

            val imc = peso / (altura * altura)

            textResultado.text = if ( imc < 18.5){
                "Baixo"
            } else if (imc in 18.5..24.9){
                "Normal"
            } else if(imc in 25.0..29.9 ){
                 "Sobrepeso"
            } else {
                "Obeso"
            }
        }

        btnVoltar.setOnClickListener {
            finish()//Finalizar
        }

    }
}