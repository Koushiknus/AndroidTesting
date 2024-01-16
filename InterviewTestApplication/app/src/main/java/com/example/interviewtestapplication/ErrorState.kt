package com.example.interviewtestapplication

sealed class ErrorState(val errorMessage : String) {

    class UserNameErrorState(errorMessage: String): ErrorState(errorMessage)
    class PasswordErrorState(errorMessage: String) : ErrorState(errorMessage)
}