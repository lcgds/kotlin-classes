package br.senac.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_tipo_telefone.*

class TipoTelefoneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tipo_telefone)

        /* View binding por Kotlin Android Extensions
            editNome
            editTel
            spinTipoTel
            buttonConfirmar
        */

        carregarSpinner()

        buttonConfirmar.setOnClickListener {
            if (validarCampos()) {
                val msg = """${getString(R.string.nome)}: ${editNome.text}
                    |${getString(R.string.telefone)}: ${editTel.text}
                    |
                    |${getString(R.string.tipo_de_contato)}: ${spinTipoTel.selectedItem}
                    """.trimMargin()

                alert(getString(R.string.bemvindo), msg, this)
            } else {
                alert(getString(R.string.erro), getString(R.string.preencha_todos_os_campos), this)
            }
        }
    }

    private fun validarCampos(): Boolean {
        return editNome.text.isNotEmpty() &&
                editTel.text.isNotEmpty() &&
                spinTipoTel.selectedItemPosition != 0
    }

    private fun carregarSpinner() {
        val itens = arrayOf(getString(R.string.selecione), getString(R.string.residencial), getString(
                    R.string.comercial), getString(R.string.celular), getString(R.string.outro))

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, itens)

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) /*Aumenta o espaçamento entre cada item*/

        spinTipoTel.adapter = adapter
    }
}