package com.example.program_functions

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ThirdActivity : AppCompatActivity() {
    private var tv: TextView? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        tv = findViewById(R.id.nametxt)
        tv?.text= intent.getSerializableExtra("ser").toString()
//        val message = intent.getStringExtra("et")
//        tv?.text = message
    }
}