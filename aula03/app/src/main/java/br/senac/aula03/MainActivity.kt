package br.senac.aula03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.aula03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // Intents = links

        binding.button1Pronome.setOnClickListener {
            // Intent explícito
            val intent = Intent(this, ExemploPronome::class.java)
            intent.putExtra("nome", "Luiz Carlos Garrido de Souza")
            startActivity(intent)
        }

        binding.button2PrefCont.setOnClickListener {
            val intent = Intent(this, PreferenciaContatoActivity::class.java)
            startActivity(intent)
        }

        binding.button3TipoTel.setOnClickListener {
            val intent = Intent(this, TipoTelefoneActivity::class.java)
            startActivity(intent)
        }

        binding.button4DataHora.setOnClickListener {
            val intent = Intent(this, DataHoraActivity::class.java)
            startActivity(intent)
        }

        binding.button5Image.setOnClickListener {
            // Intent implícito
            val intent = Intent("br.senac.aula03.ImageActivity")
            startActivity(intent)
        }

        binding.button6Quiz.setOnClickListener {
            // Intent implícito
            val intent = Intent("br.senac.aula03.QuizActivity")
            startActivity(intent)
        }
    }
}