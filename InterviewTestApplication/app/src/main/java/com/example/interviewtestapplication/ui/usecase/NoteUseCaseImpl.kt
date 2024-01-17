package com.example.interviewtestapplication.ui.usecase

import com.example.interviewtestapplication.data.Note
import com.example.interviewtestapplication.ui.repository.NoteRepository
import javax.inject.Inject

class NoteUseCaseImpl @Inject constructor(val noteRepository: NoteRepository) : NoteUseCase {
    override fun addNote(note: Note) : Int {
        return noteRepository.addNote(note)
    }

    override fun deleteNote(note: Note) {
        TODO("Not yet implemented")
    }
}