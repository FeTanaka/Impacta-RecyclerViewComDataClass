package br.com.impacta.recyclerviewmultiplosdados

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.impacta.recyclerviewmultiplosdados.data.Whatsapp
import br.com.impacta.recyclerviewmultiplosdados.databinding.ConversaItemBinding

class ConversaAdapter(var listaConversas: Array<Whatsapp>): RecyclerView.Adapter<ConversaAdapter.ConversaViewHolder>() {

    inner class ConversaViewHolder(var binding: ConversaItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConversaViewHolder {
        val binding = ConversaItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ConversaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ConversaViewHolder, position: Int) {
        var conversa = listaConversas[position]
        holder.binding.nomeContato.text = conversa.nome
        holder.binding.conversa.text = conversa.conversa
        holder.binding.horario.text = conversa.horario
        holder.binding.imageView.setImageResource(conversa.foto)
    }

    override fun getItemCount(): Int {
        return listaConversas.size
    }
}