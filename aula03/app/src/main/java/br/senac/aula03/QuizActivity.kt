package br.senac.aula03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.aula03.databinding.ActivityQuizBinding
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity() {
    lateinit var binding: ActivityQuizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuizBinding.inflate(layoutInflater)

        setContentView(binding.root)

        buttonQuestao1.setOnClickListener {
            val i = Intent("br.senac.aula03.QuestionActivity")

            i.putExtra("questionNumber", 1)
            i.putExtra("question", "Quanto é 1 + 1?")

            i.putExtra("option1", "02")
            i.putExtra("option2", "04")
            i.putExtra("option3", "06")

            startActivityForResult(i, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1 && resultCode == RESULT_OK) {
            val resp = data?.getIntExtra("resp", 0)

            if (resp == 1) {
                binding.buttonQuestao1.text = "Resposta correta"
            } else {
                binding.buttonQuestao1.text = "Resposta incorreta"
            }
        }
    }
}