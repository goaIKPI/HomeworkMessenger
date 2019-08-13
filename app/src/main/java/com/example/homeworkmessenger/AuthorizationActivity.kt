package com.example.homeworkmessenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_authorization.*

class AuthorizationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization)

        connectionButton()

    }

    fun startRotation(){
        imageView.animate().rotationBy(16000F).duration = 20000

    }


    fun stopRotation(){
        imageView.animate().cancel()
    }


    fun connectionButton(){
        buttonAuthorization.setOnClickListener {
            startRotation()
        }
        buttonRegistration.setOnClickListener {
            startActivity(Intent(this,RegistrationActivity::class.java))
        }
    }
}
