package com.jota.clase20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        var tvName:TextView = findViewById(R.id.tvName)
        tvName.text = SharedApp.prefs.name

        var btnAvanzar = findViewById(R.id.btnAvanzar) as Button

        btnAvanzar.setOnClickListener {
            SharedApp.prefs.name = "VIENE DE ACTIVITY 1"
            var activity2 = Intent (this, Activity2::class.java)
            startActivity(activity2)
        }

        val EMPTY_VALUE = ""
        fun showProfile(){
            tvName.visibility = View.VISIBLE
            tvName.text = "Hola ${SharedApp.prefs.name}"
            btnAvanzar.visibility = View.VISIBLE


        }

        fun showGuest(){
            tvName.visibility = View.INVISIBLE
            btnAvanzar.visibility = View.INVISIBLE


        }

        fun isSavedName():Boolean{
            val myName = SharedApp.prefs.name
            return myName != EMPTY_VALUE
        }
        fun configView(){
            if(isSavedName()) showProfile() else showGuest()
        }
    }




}