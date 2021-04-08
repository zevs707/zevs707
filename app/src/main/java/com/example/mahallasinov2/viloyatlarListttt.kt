package com.example.mahallasinov2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_viloyatlar_listttt.*
import kotlinx.android.synthetic.main.my_toolbar.*

class viloyatlarListttt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viloyatlar_listttt)
        setSupportActionBar(liner)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
            liner.setNavigationOnClickListener {
                onBackPressed()
            }

        var Listvilotat = ArrayList<listwiew>()

        Listvilotat.add(listwiew(titleText = "Asaka"))
        Listvilotat.add(listwiew(titleText ="Baliqchi"))
        Listvilotat.add(listwiew(titleText ="Buloqboshi"))
        Listvilotat.add(listwiew(titleText ="Bo'z"))
        Listvilotat.add(listwiew(titleText ="Jalaquduq"))
        Listvilotat.add(listwiew(titleText ="Izboskan"))
        Listvilotat.add(listwiew(titleText ="Qo'rg'ontepa"))
        Listvilotat.add(listwiew(titleText ="Marxamat"))
        Listvilotat.add(listwiew(titleText ="Oltinkol"))
        Listvilotat.add(listwiew(titleText ="Paxtaobod"))
        Listvilotat.add(listwiew(titleText ="Ulugnor"))
        Listvilotat.add(listwiew(titleText ="Xonobod"))
        Listvilotat.add(listwiew(titleText ="Xo'jaobod"))
        Listvilotat.add(listwiew(titleText ="Shaxrihon"))
        Listvilotat.add(listwiew(titleText ="Eski Andjon"))
        Listvilotat.add(listwiew(titleText ="Yangi Andijon"))
        viloyatList.hasFixedSize()
        viloyatList.layoutManager= LinearLayoutManager(this)

        viloyatList.adapter = myadapter(Listvilotat, this)
    }
}