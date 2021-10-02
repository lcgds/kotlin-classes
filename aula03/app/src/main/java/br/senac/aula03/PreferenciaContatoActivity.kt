package br.senac.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class PreferenciaContatoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferencia_contato)

        val editNome = findViewById<EditText>(R.id.editNome)
        val editTel = findViewById<EditText>(R.id.editTel)
        val editEmail = findViewById<EditText>(R.id.editEmail)

        val checkBoxTel = findViewById<CheckBox>(R.id.checkBoxTel)
        val checkBoxEmail = findViewById<CheckBox>(R.id.checkBoxEmail)


        val buttonCadastrar = findViewById<Button>(R.id.buttonCadastrar)

        buttonCadastrar.setOnClickListener {
            var msg = """Nome: ${editNome.text}
                |Telefone: ${editTel.text}
                |Email: ${editEmail.text}
                |
                |Preferência de contato: 
            """.trimMargin();

            if (checkBoxTel.isChecked) msg += "\n- Telefone"

            if (checkBoxEmail.isChecked) msg += "\n- E-mail"

        alert("Cadastro efetuado", msg, this)
        }
    }
}
