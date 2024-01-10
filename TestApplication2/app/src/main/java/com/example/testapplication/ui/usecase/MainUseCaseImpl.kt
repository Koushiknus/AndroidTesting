package com.example.testapplication.ui.usecase

import com.example.testapplication.ui.MainRepository
import javax.inject.Inject

class MainUseCaseImpl @Inject constructor(private val repository: MainRepository): MainUseCase {
    override fun invoke(): String {
        return repository.testInvoke()
    }
}