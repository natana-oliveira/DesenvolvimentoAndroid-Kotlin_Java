package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

 //   private lateinit var btnClique : Button
 //   private lateinit var binding: ActivityMainBinding
    private val binding by lazy {
     ActivityMainBinding.inflate(layoutInflater)
 }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    //    binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView( binding.root )



        /*  binding.btnClique.setOnClickListener // "btn_clique"
            binding.btnExecutar.setOnClickListener   */

        with(binding){
            btnClique?.setOnClickListener {  }
            btnExecutar?.setOnClickListener {  }//chamada segura por causa das rotações de tela
        }




 /*       btnClique = findViewById(R.id.btn_clique)
        btnClique.setOnClickListener {
            Toast.makeText(this, "OlÁ!!!", Toast.LENGTH_SHORT).show()
        }*/

    }
}