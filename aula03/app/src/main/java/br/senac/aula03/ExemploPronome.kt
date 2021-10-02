 package br.senac.aula03

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

 class ExemploPronome : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_exemplo_pronome)

     // View Binding manual
     val editNome = findViewById<EditText>(R.id.editNome)
     val groupPronome = findViewById<RadioGroup>(R.id.groupPronomes)
     val buttonCadastrar = findViewById<Button>(R.id.buttonCadastrar)

         buttonCadastrar.setOnClickListener {
             var genero = ""

             /* Modo  mais verboso
                 if(groupPronome.checkedRadioButtonId == R.id.radioEla) {
                     genero = "feminino"
                 } else if (groupPronome.checkedRadioButtonId == R.id.radioEle) {
                     genero = "masculino"
                 } else {
                     genero = "neutro"
                 }
             */

             when(groupPronome.checkedRadioButtonId) {
                 R.id.radioEla -> genero = "feminino"
                 R.id.radioEle -> genero = "masculino"
                 R.id.radioNeutro -> genero = "neutro"
                 else -> genero = "neutro"
             }

             alert("Cadastro efetuado", "Olá  ${editNome.text}, \n\nVocê escolheu o gênero $genero", this)

         }
    }

}

