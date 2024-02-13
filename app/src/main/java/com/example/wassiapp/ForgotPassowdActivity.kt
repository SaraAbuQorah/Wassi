package com.example.wassiapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForgotPassowdActivity : AppCompatActivity() {
    private lateinit var submit:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_passowd)

        submit=findViewById(R.id.submit)
        submit.setOnClickListener {
            val intent = Intent(this, ConfirmNumberActivity::class.java)
            startActivity(intent)
        }
    }
}