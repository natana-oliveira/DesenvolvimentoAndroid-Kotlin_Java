package com.example.aprendendokotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var texto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textNome)
        texto.setText("inicial")
    }

    fun alterarTexto(){
        texto.setText("ALTERADO")
    }
}