package com.example.classesemtodosnapratica

class Cao : Animal() {

    fun latir() {
        println("Au au ")
    }

    override fun dormir() {
        super.dormir()
        print("Cao.")
        println()
    }

    override fun correr() {
        super.correr()
        print("Cachorro")
        println()
    }
}