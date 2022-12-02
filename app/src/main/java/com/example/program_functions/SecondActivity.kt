package com.example.program_functions

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    private var btn: Button? = null
    private var et: EditText? = null
    private var bundle = Bundle()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        et = findViewById(R.id.edittext)
        btn = findViewById(R.id.btn_send)
        btn?.setOnClickListener{
            val send = Intent(this, ThirdActivity::class.java)
            val b = Bundle()
            bundle.putSerializable("ser",edittext.text.toString())
            send.putExtras(bundle)
            startActivity(send)

//            val intent = Intent(this, ThirdActivity::class.java).apply{
//                putExtra("et", edittext.text.toString())
//            }
//            startActivity(intent)
        }
    }
}