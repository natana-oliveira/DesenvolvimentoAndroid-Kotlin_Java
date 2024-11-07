package com.example.calculatorimc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Declaração das Variáveis
    private lateinit var btnCalcular : Button // 1. Configurar botão e textos
    private lateinit var editPeso : EditText
    private lateinit var editAltura : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicialização das Variáveis
        btnCalcular = findViewById(R.id.btn_calcular) // 2. Encontrar botão na tela de layout
        editPeso = findViewById(R.id.edit_peso)
        editAltura = findViewById(R.id.edit_altura)

        btnCalcular.setOnClickListener {// 3. Configurar o clique do botão

            // 4. Criar intent para abrir nova activity
            val intent = Intent(this, ResultadoActivity::class.java) // Instanciar intent, desta tela (this) para a tela Resultado ::class.java

            // 5. Pegar valores inseridos
            val peso = editPeso.text.toString()
            val altura = editAltura.text.toString()

            // Só envia os dados para a próxima tela se eles não estiverem vazios. Dá o start na activity na mesma mas sem dados
            if ( peso.isNotEmpty() && altura.isNotEmpty() ){
                intent.putExtra("peso", peso.toDouble() )
                intent.putExtra("altura", altura.toDouble() )
            }

            startActivity( intent) // 4.1. Método passando a intent para abrir a activity

        }
    }
}