package com.example.interviewtestapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _errorState : MutableLiveData<ErrorState> = MutableLiveData<ErrorState>()
    val errorState  : LiveData<ErrorState>
        get() = _errorState

     fun getUserNameErrorMessage() : String{
         _errorState.value = ErrorState.UserNameErrorState("User Name is required ")
        return "User Name is required "
    }

     fun getPasswordErrorMessage() : String{
            return "Password is required"
    }

    fun validateUserName(text : String) : Boolean{
        return text.isNullOrEmpty()
    }

    fun validatePassword(text : String) : Boolean{
        return  text.isNullOrEmpty() && text.length > 4
    }
}