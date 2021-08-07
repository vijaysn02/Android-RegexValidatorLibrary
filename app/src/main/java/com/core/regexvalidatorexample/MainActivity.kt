package com.core.regexvalidatorexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.core.regexvalidator.RegexHandler


class MainActivity : AppCompatActivity() {

    lateinit var emailTextField:EditText
    lateinit var validateButton:Button

    //region Activity Life Cycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialSetup()
    }

    //region Initial Setup
    fun initialSetup() {

        emailTextField = findViewById(R.id.emailTextField)
        validateButton = findViewById(R.id.validateButton)

        validateButton.setOnClickListener {
            validateEmail(emailTextField.text.toString())
        }

    }
    //endregion

    //region Button Actions
    fun validateEmail(email:String) {

        val isValidEmail = RegexHandler.emailValidator(email)

        if (isValidEmail) {
            Toast.makeText(this,"Valid",Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this,"Invalid",Toast.LENGTH_LONG).show()
        }

    }
    //endregion


}