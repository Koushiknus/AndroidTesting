package com.example.interviewtestapplication.ui.repository

import com.example.interviewtestapplication.data.Note

interface NoteRepository {

    fun addNote(note: Note) : Int
}