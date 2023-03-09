package com.example.wordsfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isEmpty
import com.example.wordsfactory.databinding.ActivityLoginBinding



fun isValidLoginInput(binding: ActivityLoginBinding): Boolean {
    return binding.textInputLayoutName.editText?.text.toString().isEmpty() ||
            binding.textInputLayoutEmail.editText?.text.toString().isEmpty() ||
            binding.textInputLayoutPassword.editText?.text.toString().isEmpty()
}

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBack.setOnClickListener {
            super.onBackPressed() // TODO: deprecated usage
        }

        binding.buttonSignup.setOnClickListener {
            signupHandler()
        }
    }

    private fun signupHandler() {
        if (isValidLoginInput(binding)) {
            AlertDialog.Builder(this)
                .setTitle(getString(R.string.login_failure))
                .setMessage(R.string.login_fail_empty_fields)
                .show()
            return
        }

        // Move next
        val intent = Intent(this@Login, Word::class.java)
        startActivity(intent)
    }
}