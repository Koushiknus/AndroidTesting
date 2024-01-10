package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.widget.addTextChangedListener
import com.example.testapplication.databinding.ActivityMainBinding
import com.example.testapplication.ui.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel.testInvoke()
        validateInputFields()
    }

    private fun validateInputFields(){

        binding.etUserName.addTextChangedListener {

           binding.btnSubmit.isEnabled = checkForButtonEnable()

            if(it.isNullOrBlank()){
                binding.etUserName.error = "Enter a User Name "
            }
        }

        binding.etPassword.addTextChangedListener {
            binding.btnSubmit.isEnabled = checkForButtonEnable()
            if(it.toString().length < 8){
                binding.btnSubmit.isEnabled = false
                binding.etPassword.error = "Enter minimum 8 characters"
            }
        }
    }

    private fun checkForButtonEnable(): Boolean {

        return !binding.etUserName.text.isNullOrBlank() && !(binding.etPassword.text.isNullOrBlank())

    }


}