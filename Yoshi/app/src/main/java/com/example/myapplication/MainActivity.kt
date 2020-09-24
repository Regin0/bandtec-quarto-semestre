package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var cliques = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun contar(componente: View){
        cliques++

        tv_contador.text = "Cliques: $cliques"


        if (cliques == 5){
            id_foto.setImageDrawable(getDrawable(R.mipmap.flash_reverso))
        }
    }
}