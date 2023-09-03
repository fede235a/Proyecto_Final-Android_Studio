package com.curso.android.app.practica.app_proyectofinal.Model

import com.curso.android.app.practica.app_proyectofinal.R

class IconsProvider {
    companion object {

        fun random(): IconsModel {
            val position = (0..8).random()
            return icon[position]
        }

        private val icon = listOf<IconsModel>(
            IconsModel(R.drawable.exclamation_1),
            IconsModel(R.drawable.exclamation_2),
            IconsModel(R.drawable.exclamation_3),
            IconsModel(R.drawable.exclamation_4),
            IconsModel(R.drawable.exclamation_5),
            IconsModel(R.drawable.exclamation_6),
            IconsModel(R.drawable.exclamation_7),
            IconsModel(R.drawable.exclamation_8),
            IconsModel(R.drawable.exclamation_9)
        )
    }
}