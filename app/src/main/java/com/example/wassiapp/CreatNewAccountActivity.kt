package com.example.wassiapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.logging.Logger

class CreatNewAccountActivity : AppCompatActivity() {
    private lateinit var creat:Button
    private lateinit var loginTextView:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creat_new_account)
        creat=findViewById(R.id.Creat)
        creat.setOnClickListener {
            val intent = Intent(this, ConfirmYourAccountActivity::class.java)
            startActivity(intent)
        }
        loginTextView=findViewById(R.id.loginTextView)
        loginTextView.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}