package br.senac.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senac.aula03.databinding.ActivityImageBinding

class ImageActivity : AppCompatActivity() {
    lateinit var binding: ActivityImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.imageView.setImageResource(R.drawable.maca)
        binding.imageView.setTag("maca")

        binding.buttonImg.setOnClickListener {
            if (binding.imageView.getTag() === "maca") {
                binding.imageView.setImageResource(R.drawable.pera)
                binding.imageView.setTag("pera")
            } else if (binding.imageView.getTag() === "pera") {
                binding.imageView.setImageResource(R.drawable.uva)
                binding.imageView.setTag("uva")
            } else {
                binding.imageView.setImageResource(R.drawable.maca)
                binding.imageView.setTag("maca")
            }
        }
    }
}