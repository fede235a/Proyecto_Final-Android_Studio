package com.curso.android.app.practica.app_proyectofinal

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.curso.android.app.practica.app_proyectofinal.View.AppActivity
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class appInstrumentedTest {

    @get: Rule
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(AppActivity::class.java)

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun appActivity_TextIguales() {
        Espresso.onView(
            ViewMatchers.withId(R.id.btnComparar)
        ).perform(
            ViewActions.click()
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.tvResult)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.withText("iguales")
            )
        )


    }
}