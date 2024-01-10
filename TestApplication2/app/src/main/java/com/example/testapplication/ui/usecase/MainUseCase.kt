package com.example.testapplication.ui.usecase

import com.example.testapplication.ui.MainRepository
import javax.inject.Inject

interface MainUseCase {

    fun invoke(): String
}