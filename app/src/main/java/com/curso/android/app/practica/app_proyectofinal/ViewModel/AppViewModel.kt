package com.curso.android.app.practica.app_proyectofinal.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.curso.android.app.practica.app_proyectofinal.Model.IconsModel
import com.curso.android.app.practica.app_proyectofinal.Model.IconsProvider

class AppViewModel : ViewModel() {

    val textoModel = MutableLiveData<String>()
    val iconsModel = MutableLiveData<IconsModel>()

    fun randomIcons() {
        val iconActual = IconsProvider.random()
        iconsModel.postValue(iconActual)
    }
}