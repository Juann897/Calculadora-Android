package com.example.calculadora

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // 🔹 Variáveis globais
    lateinit var expressao: TextView
    lateinit var resultado: TextView

    var numero1 = ""
    var numero2 = ""
    var operacao = ""
    var digitandoSegundoNumero = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        expressao = findViewById(R.id.expressao)
        resultado = findViewById(R.id.txt_resultado)

        val um = findViewById<TextView>(R.id.numero_um)
        val dois = findViewById<TextView>(R.id.numero_dois)
        val tres = findViewById<TextView>(R.id.numero_tres)

        val quatro = findViewById<TextView>(R.id.numero_quatro)
        val cinco = findViewById<TextView>(R.id.numero_cinco)
        val seis = findViewById<TextView>(R.id.numero_seis)

        val sete = findViewById<TextView>(R.id.numero_sete)
        val oito = findViewById<TextView>(R.id.numero_oito)
        val nove = findViewById<TextView>(R.id.numero_nove)

        val zero = findViewById<TextView>(R.id.numero_zero)
        val ponto = findViewById<TextView>(R.id.ponto)

        val soma = findViewById<TextView>(R.id.soma)
        val subtracao = findViewById<TextView>(R.id.subtracao)
        val multiplicacao = findViewById<TextView>(R.id.multiplicacao)
        val divisao = findViewById<TextView>(R.id.divisao)

        val limpar = findViewById<TextView>(R.id.limpar)
        val igual = findViewById<TextView>(R.id.igual)

        limpar.setOnClickListener {
            numero1 = ""
            numero2 = ""
            operacao = ""
            digitandoSegundoNumero = false

            expressao.text = ""
            resultado.text = ""
        }

        igual.setOnClickListener {
            if (numero1.isEmpty() || numero2.isEmpty()) {
                resultado.text = "Erro"
                return@setOnClickListener
            }

            val n1 = numero1.toDouble()
            val n2 = numero2.toDouble()
            var resultadoCalculo = 0.0

            when (operacao) {
                "+" -> resultadoCalculo = n1 + n2
                "-" -> resultadoCalculo = n1 - n2
                "*" -> resultadoCalculo = n1 * n2
                "/" -> {
                    if (n2 == 0.0) {
                        resultado.text = "Erro: divisão por zero"
                        return@setOnClickListener
                    } else {
                        resultadoCalculo = n1 / n2
                    }
                }
            }

            resultado.text = resultadoCalculo.toString()
        }

        zero.setOnClickListener {
            val valor = "0"

            if (!digitandoSegundoNumero) {
                numero1 += valor
                expressao.text = numero1
            } else {
                numero2 += valor
                expressao.text = numero1 + operacao + numero2
            }
        }
        um.setOnClickListener {
            val valor = "1"

            if (!digitandoSegundoNumero) {
                numero1 += valor
                expressao.text = numero1
            } else {
                numero2 += valor
                expressao.text = numero1 + operacao + numero2
            }
        }
        dois.setOnClickListener {
            val valor = "2"

            if (!digitandoSegundoNumero) {
                numero1 += valor
                expressao.text = numero1
            } else {
                numero2 += valor
                expressao.text = numero1 + operacao + numero2
            }
        }
        tres.setOnClickListener {
            val valor = "3"

            if (!digitandoSegundoNumero) {
                numero1 += valor
                expressao.text = numero1
            } else {
                numero2 += valor
                expressao.text = numero1 + operacao + numero2
            }
        }
        quatro.setOnClickListener {
            val valor = "4"

            if (!digitandoSegundoNumero) {
                numero1 += valor
                expressao.text = numero1
            } else {
                numero2 += valor
                expressao.text = numero1 + operacao + numero2
            }
        }
        cinco.setOnClickListener {
            val valor = "5"

            if (!digitandoSegundoNumero) {
                numero1 += valor
                expressao.text = numero1
            } else {
                numero2 += valor
                expressao.text = numero1 + operacao + numero2
            }
        }
        seis.setOnClickListener {
            val valor = "6"

            if (!digitandoSegundoNumero) {
                numero1 += valor
                expressao.text = numero1
            } else {
                numero2 += valor
                expressao.text = numero1 + operacao + numero2
            }
        }
        sete.setOnClickListener {
            val valor = "7"

            if (!digitandoSegundoNumero) {
                numero1 += valor
                expressao.text = numero1
            } else {
                numero2 += valor
                expressao.text = numero1 + operacao + numero2
            }
        }
        oito.setOnClickListener {
            val valor = "8"

            if (!digitandoSegundoNumero) {
                numero1 += valor
                expressao.text = numero1
            } else {
                numero2 += valor
                expressao.text = numero1 + operacao + numero2
            }
        }
        nove.setOnClickListener {
            val valor = "9"

            if (!digitandoSegundoNumero) {
                numero1 += valor
                expressao.text = numero1
            } else {
                numero2 += valor
                expressao.text = numero1 + operacao + numero2
            }
        }
        ponto.setOnClickListener {
            val valor = "."

            if (!digitandoSegundoNumero) {
                numero1 += valor
                expressao.text = numero1
            } else {
                numero2 += valor
                expressao.text = numero1 + operacao + numero2
            }
        }

        soma.setOnClickListener {
            operacao = "+"
            digitandoSegundoNumero = true
            expressao.text = numero1 + operacao
        }
        subtracao.setOnClickListener {
            operacao = "-"
            digitandoSegundoNumero = true
            expressao.text = numero1 + operacao
        }
        multiplicacao.setOnClickListener {
            operacao = "*"
            digitandoSegundoNumero = true
            expressao.text = numero1 + operacao
        }
        divisao.setOnClickListener {
            operacao = "/"
            digitandoSegundoNumero = true
            expressao.text = numero1 + operacao
        }
    }
}