package com.example.interviewtestapplication.ui.di

import com.example.interviewtestapplication.ui.repository.NoteRepository
import com.example.interviewtestapplication.ui.repository.NoteRepositoryImpl
import com.example.interviewtestapplication.ui.usecase.NoteUseCase
import com.example.interviewtestapplication.ui.usecase.NoteUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Provides
    @Singleton
    fun provideNoteUseCase(noteRepository: NoteRepository): NoteUseCase {
        return NoteUseCaseImpl(noteRepository)
    }

    @Provides
    @Singleton
    fun provideNoteRepository(): NoteRepository {
        return NoteRepositoryImpl()
    }

}