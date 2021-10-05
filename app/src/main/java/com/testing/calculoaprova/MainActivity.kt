package com.testing.calculoaprova

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcularButton)
        val resultado = findViewById<TextView>(R.id.resultado)

        calcular.setOnClickListener {
            val p1 = findViewById<EditText>(R.id.p1).text.toString().toDouble()
            val p2 = findViewById<EditText>(R.id.p2).text.toString().toDouble()
            val media:Double = (p1 + p2)/2
            val faltas = Integer.parseInt(findViewById<EditText>(R.id.faltas).text.toString())

            if(media >= 6 && faltas <=10){
                resultado.text = "Aluno foi aprovado.\nNota Final: $media\nFaltas: $faltas"
                resultado.setTextColor(Color.GREEN)
            } else {
                resultado.text = "Aluno foi reprovado.\nNota Final: $media\nFaltas: $faltas"
                resultado.setTextColor(Color.RED)
            }

            if(media > 10 || media < 0){
                resultado.text = "Dados inválidos."
                resultado.setTextColor(Color.RED)
            }
        }
    }
}