package com.jota.clase20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)



        var tvinfo:TextView = findViewById(R.id.tvInfo)
        tvinfo.text = SharedApp.prefs.name

        var btnVolver = findViewById(R.id.btnVolver) as Button
        SharedApp.prefs.name = "Va de Vuelta"
        btnVolver.setOnClickListener {

            finish()

        }
    }
}