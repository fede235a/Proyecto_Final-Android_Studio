package com.curso.android.app.practica.app_proyectofinal

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.curso.android.app.practica.app_proyectofinal.ViewModel.AppViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Assert.*
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class AppViewModelUnitTest {

    private lateinit var appViewModel: AppViewModel

    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()
    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(dispatcher)
        appViewModel = AppViewModel()
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `Comprobamos que el primer valor de iconsModel es null `() = runTest {

        val icons = appViewModel.iconsModel.value?.icon
        assertEquals(null, icons)
    }
}