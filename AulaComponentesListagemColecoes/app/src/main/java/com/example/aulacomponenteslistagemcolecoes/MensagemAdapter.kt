package com.example.aulacomponenteslistagemcolecoes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter (
    private val clique: (String) -> Unit
): Adapter<MensagemAdapter.MensagemViewHolder>() {

    private var listaMensagens = mutableListOf<Mensagem>()

    fun executarOperacao(){
        /*     0 - Ana
               1 - Beatriz
               2 - Carlos
               3 - Daniel
               4 - Elisa
               5 - Fernando    */

        listaMensagens.removeAt(1)
        listaMensagens.removeAt(2)
        notifyItemRangeRemoved(1,2)
       // notifyItemRemoved(1)

/*        listaMensagens[0] = Mensagem("Ana Luisa", "Deu tudo certo?", "11:45")
        listaMensagens[1] = Mensagem("Maria", "Olá, tudo bem?", "12:45")
        notifyItemRangeChanged(0,2)*/

      /*  listaMensagens[0] =  Mensagem("Ana Luisa", "Deu tudo certo?", "11:45")
        notifyItemChanged(0 )*/

 /*       listaMensagens.add(
            //1,
            Mensagem("Nova Pedro", "teste", "17:12")
        )
        listaMensagens.add(
            //1,
            Mensagem("Nova Maria", "teste Maria", "11:16")
        )
        listaMensagens.add(
            //1,
            Mensagem("Nova João", "teste João", "11:16")
        )*/
        // notifyItemRangeInserted(2, 3)

        //notifyItemInserted( listaMensagens.size )

    }

    fun atualizarListaDados ( lista:MutableList<Mensagem> ){
       // listaMensagens.addAll( lista )
        listaMensagens = lista
        notifyDataSetChanged()
    }

    //Classe que armazena a visualização (layout, no caso item_lista)
    inner class MensagemViewHolder(
        val itemView : View // é o item_lista
    ) : ViewHolder (itemView) { // Classe tem que herdar de viewHolder e exige que passe qual a view que vai ser utilizada

/*         val textNome: TextView = itemView.findViewById(R.id.text_nome)
         val textUltima: TextView = itemView.findViewById(R.id.text_ultima)  */

         val textNome: TextView = itemView.findViewById(R.id.text_card_nome)
         val textUltima: TextView = itemView.findViewById(R.id.text_card_ultima)
       //  val textHorario: TextView = itemView.findViewById(R.id.text_horario)

        val imagePerfil: ImageView = itemView.findViewById(R.id.image_card_perfil)
        val cardPerfil: CardView = itemView.findViewById(R.id.card_view_layout)


        fun bind( mensagem: Mensagem ){ // Conectar com a interface

            textNome.text = mensagem.nome
            textUltima.text = mensagem.ultima
            //  holder.textHorario.text = mensagem.horario

                    //Aplicar eventos de clique
                 //   val context = holder.imagePerfil.context
                    cardPerfil.setOnClickListener {
                       // Toast.makeText(context, "Olá ${mensagem.nome}", Toast.LENGTH_SHORT).show()
                        clique(mensagem.nome)
                    }
        }

    }

    //Ao criar o view Holder -> criar a visualização
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {

            val layoutInflater = LayoutInflater.from(parent.context)

            /* val itemView = layoutInflater.inflate(
                R.layout.item_lista, parent, false
            ) */

            val itemView = layoutInflater.inflate(
                R.layout.item_cardview, parent, false
            )

            return MensagemViewHolder( itemView )
    }


    //Ao vincular os dados para a visualização
    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {
        val mensagem = listaMensagens[position]  //pego uma mensagem de acordo com a posição
        holder.bind( mensagem) // faz conexão passando a mensagem usando o método bind
    }


    //Recuperar a quantidade de itens
    override fun getItemCount(): Int {
        return listaMensagens.size
    }


}