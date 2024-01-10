package com.example.testapplication.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel  @Inject constructor() :  ViewModel() {

    private val _loginResponse = MutableLiveData<String>()
    val loginResponse : LiveData<String>
        get()= _loginResponse


    fun testInvoke(){
        Log.i("TestInvoke","Invoked")
    }

}