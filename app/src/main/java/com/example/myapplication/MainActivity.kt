package com.example.myapplication

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var buttonInc: Button? = null
    private var textInc: TextView? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonInc = findViewById(R.id.button_inc)
        textInc = findViewById(R.id.text_inc)

        buttonInc?.setOnClickListener{
            val text = Integer.parseInt(textInc?.text.toString())
            textInc?.setText((text + 1).toString())
        }
    }





}