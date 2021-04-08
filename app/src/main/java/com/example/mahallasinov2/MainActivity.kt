package com.example.mahallasinov2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btlogin.setOnClickListener {
            if(etUsername.text.toString().isNotEmpty()) {
                val intent = Intent(this, KirishQism::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this , "iltimos ismingizni kiriting!", Toast.LENGTH_SHORT).show()
            }

        }

    }
}
