package com.example.mahallasinov2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kamunal.*
import kotlinx.android.synthetic.main.my_toolbar.*
import kotlinx.android.synthetic.main.my_toolbar2.*

class kamunal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kamunal)

        suvcard2.setOnClickListener {
            val intent = Intent(this, kamunal_suv::class.java)
            startActivity(intent)

        }
        person_btn.setOnClickListener {
            val intent = Intent(this, page_person::class.java)
            startActivity(intent)
        }
        btn_kirishqisim.setOnClickListener {
            val intent = Intent(this, KirishQism::class.java)
            startActivity(intent)
        }
        elektorcard2.setOnClickListener {
            val intent = Intent(this, kamunal_elektor::class.java)
            startActivity(intent)
        }
        musircard2.setOnClickListener {
            val intent = Intent(this, kamunal_musir::class.java)
            startActivity(intent)
        }
    }
}