package com.example.interviewtestapplication.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.interviewtestapplication.data.Note
import com.example.interviewtestapplication.ui.usecase.NoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteHomeViewModel @Inject constructor(val noteUseCase: NoteUseCase) : ViewModel() {


    fun getSampleNote(){
       val result =  noteUseCase.addNote(Note("test","test"))
        Log.i("ResultIs",result.toString())
    }

}