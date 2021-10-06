package br.senac.aula03

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.aula03.databinding.ActivityDataHoraBinding
import java.util.*

class DataHoraActivity : AppCompatActivity() {
    lateinit var binding: ActivityDataHoraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDataHoraBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // Biblioteca Calendar
        val calendar = Calendar.getInstance()

        // Data
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        // Hora
        val hour = calendar.get(Calendar.HOUR)
        val minutes = calendar.get(Calendar.MINUTE)

        binding.imageData.setOnClickListener {

            DatePickerDialog(this, {

                calView, sYear, sMonth, sDay ->

                // Formatação de valores
                val fDay = sDay.toString().padStart(2, '0')
                val fMonth = sMonth.toString().padStart(2, '0')

                binding.editData.setText("$fDay/$fMonth/$sYear ")

            }, year, month, day).show()

        }

        binding.imageHora.setOnClickListener {
            TimePickerDialog(this, {
                                   clockView, sHour, sMinute ->

                //Formatação de valores
                val fHour = sHour.toString().padStart(2, '0')
                val fMinute = sMinute.toString().padStart(2, '0')

                binding.editHora.setText("$fHour:$fMinute")
            }, hour, minutes, true).show()
        }

        binding.buttonDefinir.setOnClickListener {
            alert("Definição concluída","""Data: ${binding.editData.text}
                |Hora: ${binding.editHora.text}
            """.trimMargin(), this)
        }
    }
}