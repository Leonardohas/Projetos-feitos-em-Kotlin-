package com.example.testes_android_studio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    /* 100% dos componenentes da tela serão propriedades da classe, ou seja serão variaveis globais,
     É recomendado que os seus componentes sejam variaveis globais por quê enquanto seu APP estiver em execução
     Os valores desses componetes serão guardado em memoria */

    lateinit var campo1: EditText  // Um exemplo de variavel global feito em Kotlin. Use sempre o auto-completar pois o programa imporata as biblioteca automaticamnete
    lateinit var botao: Button // todas as vezes precisamos sempre instanciar as variaveis globais

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        campo1 = findViewById(R.id.Teste)
        botao = findViewById(R.id.button)
        botao.setOnClickListener(object : View.OnClickListener {  // Criando o click do botão
            override fun onClick(v: View?) {                      // Aqui dentro estará toda a implementação desse objeto
                var textoDigitado = campo1.text.toString()
                Toast.makeText(applicationContext, "Teste dessa bagaça", Toast.LENGTH_LONG).show() // 1° parametro:applicationContext = Aquilo que está em execução, 2° parametro:Mensagem em formato de String = Mensagem que será exibida na tela, 3°Parametro:Toast.LENGTH_LONG = É o tempo de exebição da mensagem, 4°Parametro:.show() = Esse metedo deve ser sempre utilado para que a mensagem seja exebida
            }

        })
    }
}