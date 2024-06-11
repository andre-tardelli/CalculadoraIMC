package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
            val peso = edtPeso.text
            val altura = edtAltura.text

            println("Seu peso é " + peso)
            println("Sua altura é " + altura)
        }
    }
}