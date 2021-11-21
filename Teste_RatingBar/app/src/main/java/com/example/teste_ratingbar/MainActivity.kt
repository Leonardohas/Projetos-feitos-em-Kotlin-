package com.example.teste_ratingbar

import android.media.Rating
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var  Barra: RatingBar
    lateinit var  Botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto  = findViewById(R.id.Resultado)
        Barra  = findViewById(R.id.ratingBar)
        Botao  = findViewById(R.id.button)

        Barra.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->  rating   //Utilizando {} ao ivez de () imediantamente você faz a implementação da interface
            texto.text = "" + rating
        }

        Botao.setOnClickListener {
            Toast.makeText(applicationContext, "Valor das estrelas=" + Barra.rating, Toast.LENGTH_LONG).show()
        }
    }
}