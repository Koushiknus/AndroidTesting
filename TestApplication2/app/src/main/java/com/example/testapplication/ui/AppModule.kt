package com.example.testapplication.ui

import com.example.testapplication.ui.usecase.MainRepositoryImpl
import com.example.testapplication.ui.usecase.MainUseCase
import com.example.testapplication.ui.usecase.MainUseCaseImpl
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
    fun provideMainRepository(): MainRepository {
        return MainRepositoryImpl()
    }
    @Provides
    @Singleton
    fun provideMainUseCase(repository: MainRepository) : MainUseCase{
        return MainUseCaseImpl(repository)
    }


}