package com.curso.android.app.practica.app_proyectofinal

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.curso.android.app.practica.app_proyectofinal", appContext.packageName)
    }
}

/*
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get: Rule
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun mainActivity_incrementCounter() {
        Espresso.onView(
            ViewMatchers.withId(R.id.increment_button)
        ).perform(
            ViewActions.click()
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.counter)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.withText("1")
            )
        )
    }
}*/