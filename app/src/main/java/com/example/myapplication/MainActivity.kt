package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailButton = findViewById<EditText>(R.id.emailButton)
        val passwordButton = findViewById<EditText>(R.id.passwordButton)
        val loginTextview = findViewById<TextView>(R.id.loginTextview)
        val forgotPassword = findViewById<TextView>(R.id.forgotPassword)

        intent = Intent(this, MainActivity2::class.java)
        findViewById<TextView>(R.id.loginTextview).setOnClickListener {
            var email = emailButton.text.toString()
            var password = passwordButton.text.toString()
            if (email == "") {
                Toast.makeText(this, "please enter your email", Toast.LENGTH_LONG).show()
            } else if (password == "") {
                Toast.makeText(this, "enter your password", Toast.LENGTH_LONG).show()
            } else {
                startActivity(intent)
            }
            forgotPassword.setOnClickListener {
                startActivity(Intent(this,MainActivity3::class.java))
            }


        }
    }
}