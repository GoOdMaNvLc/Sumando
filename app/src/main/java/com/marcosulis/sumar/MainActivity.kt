package com.marcosulis.sumar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1: EditText = findViewById(R.id.editTextText)
        var num2: EditText = findViewById(R.id.editTextText2)
        var btnSumar: Button = findViewById(R.id.button)
        var btnRestar: Button = findViewById(R.id.button2)
        var txtRes: TextView = findViewById(R.id.textView)

        btnSumar.setOnClickListener {
            val numero1 = num1.text.toString().toInt()
            val numero2 = num2.text.toString().toInt()
            txtRes.text = (numero2 + numero1).toString()

        }
        btnRestar.setOnClickListener {
            val numero1 = num1.text.toString().toInt()
            val numero2 = num2.text.toString().toInt()
            txtRes.text = (numero1 - numero2).toString()
        }
    }
}