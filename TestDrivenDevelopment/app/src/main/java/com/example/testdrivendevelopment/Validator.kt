package com.example.testdrivendevelopment

object Validator {

    fun validateInput(desc : String,amount : Int): Boolean {
        return !(desc.isEmpty() || amount <=0 )
    }
}