package com.example.aulacomponenteslistagemcolecoes

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnExecutar : Button
    private lateinit var textREsultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExecutar = findViewById( R.id.btn_executar)
        textREsultado = findViewById( R.id.text_resultado)

  /*      btnExecutar.setOnClickListener {
            textREsultado.text = "Natana"
        }*/

    }

    fun cliqueBotao( view: View){

        Toast.makeText(this, "Sucesso ao fazer algo", Toast.LENGTH_LONG).show()
        textREsultado.text = "Natana"
    }
}