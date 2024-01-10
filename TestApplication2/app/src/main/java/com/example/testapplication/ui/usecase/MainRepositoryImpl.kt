package com.example.testapplication.ui.usecase

import com.example.testapplication.ui.MainRepository

class MainRepositoryImpl() : MainRepository {
    override fun testInvoke() : String {
        return "Success"
    }

}