package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueNimin(componente:View){
        Toast.makeText(this, "boa noite", Toast.LENGTH_SHORT).show()
        tv_topo.text = "Fodase?"
        tv_segundo.text = et_texto.text //Atribui oq eu digitar na caixa de texto no campo 2 de texto
        tv_quarto.setTextColor(Color.CYAN)
//        tv_terceiro.visibility = View.GONE // deixa a frase invi apenas clicando no botão

        //Convertendo valores de EditText em números
        val numeroInteiro = et_texto.text.toString().toInt()
        val numeroReal = et_texto.text.toString().toDouble()

        tv_segundo.text = "O dobro é ${numeroInteiro*2}"
    }
}