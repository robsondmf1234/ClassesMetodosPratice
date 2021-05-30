package com.example.classesemtodosnapratica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val minhaCasa = Casa()
//        minhaCasa.cor = "Azul"
//        minhaCasa.abrirPorta()
//        println("Cor: ${minhaCasa.cor}")
//
//
//        val funcionario1 = Funcionario()
//        funcionario1.nome = "Jose"
//        funcionario1.salario = 3000.0
//        println("Nome: ${funcionario1.nome}")
//
////        println("Salario sem retorno")
////        funcionario1.mostraSalarioSemRetorno()
//
////        println("Salario com retorno")
////        val novoSalario = funcionario1.mostraSalarioComRetorno()
////        println("Salario : ${novoSalario}")]
////
//        println("Salario com bônus")
//        val novoSalario = funcionario1.mostraSalarioEBonusComRetorno(10000.0)
//        println("Salario : ${novoSalario}")
//
//        val texto = findViewById<TextView>(R.id.textview)
//        texto.setText(minhaCasa.cor)

//        var cao1 = Cao()
//        cao1.cor="Marrom"
//        cao1.peso = 50.0
//        cao1.tamanho = 170
//
//        cao1.dormir()
//        cao1.correr()
//
//        var passaro1 = Passaro()
//        passaro1.cor= "Azul"
//        passaro1.peso = 100.0
//        passaro1.tamanho = 90
//
//        passaro1.correr()
//        passaro1.dormir()

        var conta1 = Conta(
            1234,
            2000.0
        )

//        conta1.depositar(100.0)
        conta1.sacar(1900.0)
        println("Saldo da conta é R$: ${conta1.recuperarSaldo()}")
    }
}