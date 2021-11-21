package com.example.testeradiobuttom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var group: RadioGroup
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        group = findViewById(R.id.radioGroup)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            if (group.checkedRadioButtonId != null){
                val selecionado: RadioButton = findViewById(group.checkedRadioButtonId)
                Toast.makeText(applicationContext,"Radio selecionado: " + selecionado.text, Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(applicationContext, "Nenhuma opção selecionada", Toast.LENGTH_LONG).show()
            }
        }

        group.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener{
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
                    var selecionado: RadioButton
                    selecionado = findViewById(checkedId)
                    Toast.makeText(applicationContext,"Radio selecionado: " + selecionado.text, Toast.LENGTH_LONG).show()

            }
        })
    }
}