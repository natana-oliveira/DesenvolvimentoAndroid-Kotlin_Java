package com.jamiltondamasceno.aulaactivityfragment

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetalhesActivity : AppCompatActivity() {

    lateinit var buttonFechar: Button
    lateinit var textFilme: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        buttonFechar = findViewById(R.id.button_fechar)
        textFilme = findViewById(R.id.textFilme)

        //recuperar valor que foi passado na tela (atividade) anterior
        val bundle = intent.extras //criar um objeto bundle para recuperar todos os parametros passados
        // .extras: O Intent pode ter dados extras anexados a ele, que são armazenados em um Bundle.
        // O método intent.extras retorna esse Bundle que contém os dados adicionais que foram passados para a atividade.

        if( bundle != null){

            /* val filme = bundle.getString("filme")
            val classificacao = bundle.getInt("classificação")
            val avaliacoes = bundle.getDouble("avaliações")

            val resultado = "filme: $filme - class. $classificacao - aval. $avaliacoes"
            textFilme.text = resultado */

           // val filme = bundle.getSerializable("filme") as Filme // "as" converte serializable para tipo Filme
           // textFilme.text = "${filme?.nome} - ${filme?.distribuidor}"

            val filme = bundle.getParcelable<Filme>("filme")
            textFilme.text = "${filme?.nome} - ${filme?.distribuidor}"
        }

        buttonFechar.setOnClickListener {
            finish()//Finalizar
        }

    }
}