package com.example.interviewtestapplication.ui.usecase

import com.example.interviewtestapplication.data.Note

interface NoteUseCase {

    fun addNote(note: Note) : Int

    fun deleteNote(note: Note)
}