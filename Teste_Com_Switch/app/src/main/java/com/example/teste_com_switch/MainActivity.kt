package com.example.teste_com_switch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var botao: Button
    lateinit var trigger: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.testeSwitch)
        botao = findViewById(R.id.button)
        trigger = findViewById(R.id.switch1)
        
        trigger.setOnCheckedChangeListener {
                buttonView, isChecked -> isChecked
                var desligadoOuLigado = ""
                if (isChecked){
                    desligadoOuLigado = "Desligado"
                } else {
                    desligadoOuLigado = "Ligado"
                }
            texto.text = desligadoOuLigado
        }

        botao.setOnClickListener( object : View.OnClickListener {
            override fun onClick(v: View?) {
                var desligadoOuLigado = ""
                if (trigger.isChecked){
                    desligadoOuLigado = "Desligado"
                } else {
                    desligadoOuLigado = "Ligado"
                }
                Toast.makeText(applicationContext, "O teste está: " + desligadoOuLigado, Toast.LENGTH_LONG).show()
            }


        })

    }
}