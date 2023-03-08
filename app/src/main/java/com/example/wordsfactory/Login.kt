package com.example.wordsfactory
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isEmpty
import com.example.wordsfactory.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBack.setOnClickListener {
            super.onBackPressed()
        }

        binding.buttonSignup.setOnClickListener {
            if (binding.textInputLayoutName.editText?.text.toString().isNullOrEmpty() || binding.textInputLayoutEmail.editText?.text.toString().isNullOrEmpty() || binding.textInputLayoutPassword.editText?.text.toString().isNullOrEmpty()){
                val dialogBuilder = AlertDialog.Builder(this)
                dialogBuilder.setTitle("Error!")
                dialogBuilder.setMessage("Some of your fields are empty.")
                dialogBuilder.show()
            } else {
                val intent = Intent(this@Login, Word::class.java)
                startActivity(intent)
            }
        }
    }
}