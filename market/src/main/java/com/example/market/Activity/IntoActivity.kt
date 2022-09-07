package com.example.market.Activity;

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.market.R

class IntoActivity : AppCompatActivity() {
    private lateinit var startBtn: ConstraintLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_into)

        startBtn = findViewById(R.id.start_button)
        startBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}