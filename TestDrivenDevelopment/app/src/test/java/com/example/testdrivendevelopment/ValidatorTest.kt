package com.example.testdrivendevelopment

import com.google.common.truth.Truth
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ValidatorTest{

    @Test
    fun testValidInputs(){
        val desc = "test"
        val amount = 100
        Truth.assertThat(Validator.validateInput(desc, amount)).isEqualTo(true)
    }

    @Test
    fun testInvalidInputs(){
        val desc = ""
        val amount = -20
        Truth.assertThat(Validator.validateInput(desc, amount)).isEqualTo(false)
    }
}