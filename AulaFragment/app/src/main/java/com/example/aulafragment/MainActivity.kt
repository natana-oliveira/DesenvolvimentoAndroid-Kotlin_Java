package com.example.aulafragment

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.aulafragment.fragments.ChamadasFragment
import com.example.aulafragment.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnMercado : Button
    private lateinit var btnChamadas : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("ciclo_vida", "Activity onCreate")

        btnMercado = findViewById(R.id.btn_mercado)
        btnChamadas = findViewById(R.id.btn_chamadas)

        /*  val fragmentManager = supportFragmentManager.beginTransaction() //retorna o objeto que manipula um fragmento
        fragmentManager.add( R.id.fragment_conteudo, ConversasFragment())
        fragmentManager.commit() */
       // val conversasFragment = ConversasFragment()

/*        val bundle = bundleOf(
            "categoria" to "mercado", // chave (categoria) para o valor (mercado)
            "usuario" to "Natana"
        )*/
       // conversasFragment.arguments = bundle

        /*        supportFragmentManager
                .beginTransaction()
                .replace( R.id.fragment_conteudo, conversasFragment )
                .commit()*/

        val bundle = bundleOf(
            "categoria" to "mercado", // chave (categoria) para o valor (mercado)
            "usuario" to "Natana"
        )

            supportFragmentManager.commit {
                replace<ConversasFragment>( R.id.fragment_conteudo , args = bundle )
            }



        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace( R.id.fragment_conteudo, ChamadasFragment() )
              //  .remove( conversasFragment )
                .commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo_vida", "Activity onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida", "Activity onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i("ciclo_vida", "Activity onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i("ciclo_vida", "Activity onStop")
    }
    override fun onDestroy() {
        Log.i("ciclo_vida", "Activity onDestroy")
        super.onDestroy()

    }
}