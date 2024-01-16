package com.example.interviewtestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.core.widget.addTextChangedListener
import com.example.interviewtestapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onclickListeners()
        initObservers()
    }

    private fun initObservers() {
        viewModel.errorState.observe(this,{
            Log.i("ErroStateIs",it.errorMessage)
        })
    }

    private fun onclickListeners(){
        binding.btnSubmit.setOnClickListener {

            if(viewModel.validateUserName(binding.etUserName.text.toString())){
                binding.etUserName.error = viewModel.getUserNameErrorMessage()
            }
            val passwordText = binding.etPassword.text
            if(viewModel.validatePassword(binding.etPassword.text.toString())){
                binding.etPassword.error = viewModel.getPasswordErrorMessage()
            }
        }
    }


    private fun  checkForButtonEnableK(){
        binding.btnSubmit.isEnabled = validateFields()
    }

    private fun validateFields(): Boolean {
        return !(binding.etUserName.text.isNullOrEmpty()) && (!binding.etPassword.text.isNullOrEmpty())
    }
}