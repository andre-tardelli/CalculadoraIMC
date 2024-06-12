package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtPeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        //Recuperar os componentes de EdtText e Button
        //Criar uma variável e assossiar os componentes UI <edtText>
        //Criar ação do button <setOnCLickListener>

        btnCalcular.setOnClickListener {
            val pesoStr: String = edtPeso.text.toString()
            val alturaStr: String = edtAltura.text.toString()

            if (pesoStr == "" || alturaStr == "") {
                //Mostrar mensagem para o usuário
                Snackbar.make(
                    edtPeso, "Preencha todos os campos",
                    Snackbar.LENGTH_LONG,
                ).show()

            } else {

                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                //Criação de nova tela
                //Navegar entre as telas
                //Utilização da classe INTENT (Classe própria do Android)

                val intent = Intent(this, Result_Activity::class.java)
                intent.putExtra(KEY_RESULT_IMC, resultado)
                startActivity(intent)

                println("Ação do button " + resultado)
            }
        }
    }
}