package com.example.classesemtodosnapratica

class Funcionario {

    var nome: String = ""
    var salario: Double = 0.0

    fun mostraSalarioSemRetorno() {
        this.salario = this.salario - (this.salario * 0.1)
        println("Salario: ${this.salario}")
    }

    fun mostraSalarioComRetorno(): Double {
        val novoSalario = this.salario - (this.salario * 0.1)
        return novoSalario
    }

    fun mostraSalarioEBonusComRetorno(valor: Double): Double {
        val novoSalario = this.salario - (this.salario * 0.1)
        return novoSalario + valor
    }
}