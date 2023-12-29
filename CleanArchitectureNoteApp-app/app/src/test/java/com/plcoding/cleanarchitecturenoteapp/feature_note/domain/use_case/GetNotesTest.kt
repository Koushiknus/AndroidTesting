package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case.data.repository.FakeNoteRepository
import org.junit.Assert.*
import org.junit.Before

class GetNotesTest{

    private lateinit var getNotes: GetNotes

    private lateinit var fakeNoteRepository: FakeNoteRepository

    @Before
    fun setUp(){
        fakeNoteRepository = FakeNoteRepository()
        getNotes = GetNotes(fakeNoteRepository)
    }
}