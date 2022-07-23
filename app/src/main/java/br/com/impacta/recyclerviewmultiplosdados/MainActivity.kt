package br.com.impacta.recyclerviewmultiplosdados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.impacta.recyclerviewmultiplosdados.data.Whatsapp
import br.com.impacta.recyclerviewmultiplosdados.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var listaDeConversas = arrayOf(
            Whatsapp(
                "Fernando",
                "Olá professor",
                R.drawable.imagem_01,
                "22:12"
            ),
            Whatsapp(
                "Rubiane",
                "Olá Rubiane",
                R.drawable.imagem_02,
                "22:16"
            )
        )

        binding.recyclerView.adapter = ConversaAdapter(listaDeConversas)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

    }
}