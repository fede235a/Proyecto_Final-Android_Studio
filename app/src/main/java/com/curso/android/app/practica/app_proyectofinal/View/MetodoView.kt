package com.curso.android.app.practica.app_proyectofinal.View

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

fun View.teclado() {
    val tecladoOculto = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    tecladoOculto.hideSoftInputFromWindow(windowToken, 0)
}