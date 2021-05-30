package com.example.classesemtodosnapratica

class Conta(
    numero: Int,
    saldo: Double
) {
    var numero = numero
    private var saldo = saldo

    fun depositar(valor: Double) {
        this.saldo += valor
    }

    fun sacar(valor: Double) {
        this.saldo -= valor
    }

    public fun recuperarSaldo():Double{
        return this.saldo
    }
}