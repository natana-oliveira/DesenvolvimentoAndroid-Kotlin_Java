package com.example.aulacomponenteslistagemcolecoes

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView
    private lateinit var mensagemAdapter: MensagemAdapter
    private lateinit var btnClique : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

/*        val lista = listOf<String>("Ana","Beatriz","Carlos","Daniel","Elisa","Fernando")*/
        val lista = mutableListOf(
            Mensagem("Ana", "Olá, tudo bem?", "10:45"),
            Mensagem("Beatriz", "Te vi ontem na rua e não te disse nada não queria ajgjkbb,bm,bn,mb.b........,fgggggggggggggggggggggggggggg..", "00:45"),
            Mensagem("Carlos", "Não acredito nessa história", "06:03"),
            Mensagem("Daniel", "Futebol hoje?", "15:34"),
            Mensagem("Elisa", "Amanhã eu consigo!", "12:25"),
            Mensagem("Fernando", "Ela aceita!", "11:25")
        )

        // CONFIGURAR ADAPTER
        rvLista = findViewById(R.id.rv_lista)
        btnClique = findViewById(R.id.btn_clique)

        //tipo: MensagemAdapter, Adapter
        mensagemAdapter = MensagemAdapter {nome -> //passo uma função lambda para o adaptador e usa o starActivity
            Toast.makeText(this, "Olá $nome!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ListViewActivity::class.java)
            intent.putExtra("nome", nome)

            startActivity(
                intent
            )
        }

        mensagemAdapter.atualizarListaDados(
            lista
        )

        rvLista.adapter = mensagemAdapter

        // CONFIGURAR UM LayoutManager

        //LinearLayoutManager (via XML e Código) - sem ele não funciona
        rvLista.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        //GridLayoutManager
       // rvLista.layoutManager = GridLayoutManager(this,2)

        //StaggeredGridLayoutManager
       // rvLista.layoutManager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)


        btnClique.setOnClickListener {

            mensagemAdapter.executarOperacao()

            /*
            lista.add(
                Mensagem("Nova mensagem", "teste","17:00")
            )
            mensagemAdapter.atualizarListaDados( lista )
            */
        }


/*        // Adicionar um divisor na página
        rvLista.addItemDecoration(
            DividerItemDecoration(this, RecyclerView.VERTICAL)
        )*/

    }
}