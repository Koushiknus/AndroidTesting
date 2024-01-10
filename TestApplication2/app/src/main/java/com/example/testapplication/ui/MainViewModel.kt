package com.example.testapplication.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testapplication.ui.usecase.MainUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel  @Inject constructor(private val mainUseCase: MainUseCase) :  ViewModel() {

    private val _loginResponse = MutableLiveData<String>()
    val loginResponse : LiveData<String>
        get()= _loginResponse


    fun testInvoke(){
        Log.i("TestInvoke","Invoked")
        val result = mainUseCase.invoke()
        Log.i("ResultRcvd",result.toString())
    }

}