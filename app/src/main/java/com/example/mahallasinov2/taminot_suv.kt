package com.example.mahallasinov2

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_taminot_suv.*


class taminot_suv : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taminot_suv)
        progress.layoutParams.width = 20
        progress.invalidate()
    }



}