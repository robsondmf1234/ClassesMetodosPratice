package com.example.classesemtodosnapratica

abstract class Animal {

    var tamanho: Int = 0
    var cor: String = ""
    var peso: Double = 0.0

    open fun dormir(){
        print("Dormindo como um ")
    }

    open fun correr(){
        print("Correr como um ")
    }
}