package com.example.loginpage

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val tvWelcome = findViewById<TextView>(R.id.tv_welcome)
        val username = intent.getStringExtra("USERNAME")

        tvWelcome.text = "Welcome, $username!"
    }
}
