package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton


import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    lateinit var passwordInput : EditText
    lateinit var usernameInput : EditText
    lateinit var loginBtn : Button


   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        usernameInput = findViewById(R.id.name)
        passwordInput = findViewById(R.id.password)
       loginBtn=findViewById(R.id.login)

        loginBtn.setOnClickListener {
            val name = usernameInput.text.toString()
            val password = passwordInput.text.toString()

Log.i("Test Credentials" , "Username : $name and Password : $password")


            }
    }}















