package com.curso.android.app.practica.app_proyectofinal.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.curso.android.app.practica.app_proyectofinal.ViewModel.AppViewModel
import com.curso.android.app.practica.app_proyectofinal.databinding.ActivityAppBinding

class AppActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAppBinding

    private val appViewModel: AppViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnComparar.setOnClickListener {
            it.teclado()
            compararTexto()
            appViewModel.randomIcons()
        }

        appViewModel.iconsModel.observe(this, Observer {
            binding.ivIcon.setImageResource(/* resId = */ it.icon)
        })

        appViewModel.textoModel.observe(this) {
            binding.tvResult.text = String.format("%s", it)
        }

    }

    private fun compararTexto() {

        val texto1 = binding.etText1.text.toString()
        val texto2 = binding.etText2.text.toString()

        when {
            texto1 == texto2 -> appViewModel.textoModel.value = "iguales"

            texto1 != texto2 -> appViewModel.textoModel.value = "distintos"
        }
        binding.etText1.setText("")
        binding.etText2.setText("")
    }
}
