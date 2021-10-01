 package br.senac.lcgds

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

 class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val editNome = findViewById<EditText>(R.id.editNome)
        val buttonMsg = findViewById<Button>(R.id.buttonMsg)

        buttonMsg.setOnClickListener {
            showDialog("Boas-vindas", "Olá, " + editNome.text)
        }
    }

     fun showDialog(head: String, body: String) {
         /* Mais verboso
            val builder = AlertDialog.Builder(this)

            builder.setTitle(head)
            builder.setMessage(body)
            builder.setPositiveButton("Okay", null)

            val dialog = builder.create()
            dialog.show()
        */

         // Menos verboso
         AlertDialog.Builder(this)
             .setTitle(head)
             .setMessage(body)
             .setPositiveButton("Okay", null)
             .create()
             .show()
     }
}