package com.example.mahallasinov2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_kirish_qism.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btlogin
import kotlinx.android.synthetic.main.my_toolbar.*
import kotlinx.android.synthetic.main.my_toolbar.view.*
import kotlinx.android.synthetic.main.my_toolbar2.*

class KirishQism : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kirish_qism)
        btn_list.setOnClickListener {
            val intent = Intent(this, viloyatlarListttt::class.java)
            startActivity(intent)
        }





        person_btn.setOnClickListener {
            val intent = Intent(this, page_person::class.java)
            startActivity(intent)
        }

        kamunal_img.setOnClickListener {
            val intent = Intent(this, kamunal_suv::class.java)
            startActivity(intent)
        }






    }
}