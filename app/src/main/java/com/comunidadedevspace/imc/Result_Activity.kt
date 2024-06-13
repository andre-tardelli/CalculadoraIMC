package com.comunidadedevspace.imc

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

const val KEY_RESULT_IMC = "Result_Activity.KEY_IMC"

class Result_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificacao = findViewById<TextView>(R.id.tv_classificacao)

        tvResult.text = result.toString()

        val classificacao: String = if (result <= 18.5f) {
            tvClassificacao.setTextColor(Color.RED)
            "MAGREZA"
        } else if (result > 18.5f && result <= 24.9f) {
            tvClassificacao.setTextColor(Color.GREEN)
            "NORMAL"
        } else if (result > 25f && result <= 29.9f) {
            tvClassificacao.setTextColor(Color.YELLOW)
            "SOBREPESO"
        } else if (result > 30f && result <= 39.9f) {
            tvClassificacao.setTextColor(Color.RED)
            "OBESIDADE"
        } else {
            tvClassificacao.setTextColor(Color.RED)
            "OBESIDADE GRAVE"
        }

        tvClassificacao.text = classificacao
    }
}