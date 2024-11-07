package com.example.aulacomponenteslistagemcolecoes

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListViewActivity : AppCompatActivity() {

    private lateinit var listViewUsuarios: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listaUsuarios = listOf("Ana","Beatriz","Carlos","Daniel","Elisa","Fernando")

        listViewUsuarios = findViewById( R.id.list_usuarios )
        listViewUsuarios.adapter = ArrayAdapter(
            this, // contexto (que é padrão)
            android.R.layout.simple_list_item_1, // layout que quer utilizar
            android.R.id.text1, //identificador que vai usar para colocar cada item (Ex: "Ana" vai colocar dentro do text 1
            listaUsuarios) // a lista que usa como base

    }
}