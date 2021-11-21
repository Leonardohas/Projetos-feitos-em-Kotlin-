package com.example.teste_com_seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var barra: SeekBar
    lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.Valor)
        barra = findViewById(R.id.seekBar)
        botao = findViewById(R.id.button)

        // No caso da SeekBar sempre emprementar os 3 metodos
        barra.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) { //Sempre que o valor mudar o metodo onProgressChanged será executado
                texto.text = "" + progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) { //Clicar, segurar e arraastar a barra o metodo OnStart será executado
                Toast.makeText(applicationContext, "teste de coemço", Toast.LENGTH_LONG).show()

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) { //Sempre que a barra parar o metodo onStop será executado
                Toast.makeText(applicationContext, "teste de finalização", Toast.LENGTH_LONG).show()

            }

        })

        botao.setOnClickListener {
            Toast.makeText(applicationContext, "Valoe atual é:" + barra.progress, Toast.LENGTH_LONG).show()
        }

    }
}