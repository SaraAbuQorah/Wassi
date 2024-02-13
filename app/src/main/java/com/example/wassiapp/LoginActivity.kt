package com.example.wassiapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    private lateinit var forgotPassword:TextView
    private lateinit var createAccount:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        forgotPassword=findViewById(R.id.forgotPassword)
        forgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotPassowdActivity::class.java)
            startActivity(intent)
        }

        createAccount=findViewById(R.id.createAccount)
        createAccount.setOnClickListener {
            val intent = Intent(this, CreatNewAccountActivity::class.java)
            startActivity(intent)
        }
    }
}