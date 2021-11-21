package com.example.testecheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var texto1: TextView
    lateinit var checkBox: CheckBox
    lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto1 = findViewById(R.id.textView2)
        checkBox = findViewById(R.id.checkBox)
        botao = findViewById(R.id.button)

        //Essa é uma forma melhor para utilizar interfaces que tenham varios metodos abstratos

  //      checkBox.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener{
  //          override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
  //              var texto2 = ""
  //              if (isChecked){
  //                  texto2 = "Marcado"
  //              }else{
  //                  texto2  ="Desmarcado"
  //              }
  //              Toast.makeText(applicationContext,texto2, Toast.LENGTH_LONG).show()
  //              texto1.text = texto2
   //         }

    //   })

    //Se houver apenas 1 metodo abstrato, esse metodo é mais rapido.

        checkBox.setOnCheckedChangeListener { buttonView, isChecked -> isChecked
            var texto2 = criartexto(isChecked)
            Toast.makeText(applicationContext,texto2, Toast.LENGTH_LONG).show()
            texto1.text = texto2
        }
        botao.setOnClickListener {
            var texto2 = criartexto(checkBox.isChecked)
            Toast.makeText(applicationContext,texto2, Toast.LENGTH_LONG).show()
        }


    }

    private fun criartexto(isChecked: Boolean): String {
        var texto2 = ""
        if (isChecked) {
            texto2 = "Marcado"
        } else {
            texto2 = "Desmarcado"
        }
        return texto2
    }
}
