package br.senac.aula03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.aula03.databinding.ActivityQuestionBinding
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {
    lateinit var binding:ActivityQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        textQuestionNumber.setText("Questão nº ${intent.getIntExtra("questionNumber",0)}")
        textQuestion.setText("${intent.getStringExtra("question")}")

        buttonOption1.setText("${intent.getStringExtra("option1")}")
        buttonOption2.setText("${intent.getStringExtra("option2")}")
        buttonOption3.setText("${intent.getStringExtra("option3")}")

        buttonOption1.setOnClickListener {
            resposta(1)
        }

        buttonOption2.setOnClickListener {
            resposta(2)
        }

        buttonOption3.setOnClickListener {
            resposta(3)
        }


    }

    fun resposta(resp: Int) {
        val respIntent = Intent("br.senac.aula03.QuizActivity")
        respIntent.putExtra("resp", resp)

        setResult(RESULT_OK, respIntent)

        //Encerra a atividade atual
        finish()

        /*finishAffinity() -> Fecha a aplicação inteira*/
    }
}