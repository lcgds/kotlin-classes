package br.senac.aula01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val = const
        val editMsg = findViewById<EditText /*tipo de componente*/ >(R.id.editMsg /*id do componente*/)
        val button = findViewById<Button>(R.id.buttonIr)

        // evento OnClick
        button.setOnClickListener {
            editMsg.setText("Olá, mundo!")
        }
    }
}