package com.example.poke

import java.io.File
import kotlin.random.Random

class Pokemon(var Nombre: String,
              var Nv: Int,
              var imagen: File,
              var genero: File,
              var vidaActual: Int,
              var vidaMaxima: Int,
              var imagenEspalda: File,){

    fun ataqueSeguro(pokemon: Pokemon){
        pokemon.vidaActual-=20

    }
    fun ataqueArriesgado(pokemon: Pokemon){
        pokemon.vidaActual -= (Math.random() * 15+10).toInt()
    }
    fun ataqueMuyArriesgado(pokemon: Pokemon){
        pokemon.vidaActual -= (Math.random() * 50).toInt()
    }
    fun curar(pokemon: Pokemon){
        pokemon.vidaActual += (Math.random() *  50+25).toInt()
    }
}