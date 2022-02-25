package com.example.poke

import java.io.File
import kotlin.random.Random

// CREAMOS LA CLASE POKEMON CON SUS DATOS NECESARIOS
class Pokemon(var Nombre: String,
              var Nv: Int,
              var imagen: File,
              var genero: File,
              var vidaActual: Int,
              var vidaMaxima: Int,
              var imagenEspalda: File,)
{
    // CONFIGURAMOS LOS ATAQUES
    fun ataqueSeguro(pokemon: Pokemon){
        pokemon.vidaActual-=20
        if(pokemon.vidaActual<0){
            pokemon.vidaActual=0
        }
    }
    fun ataqueArriesgado(pokemon: Pokemon){
        pokemon.vidaActual -= (Math.random() * 15+10).toInt()
        if(pokemon.vidaActual<0){
            pokemon.vidaActual=0
        }
    }
    fun ataqueMuyArriesgado(pokemon: Pokemon){
        pokemon.vidaActual -= (Math.random() * 50).toInt()
        if(pokemon.vidaActual<0){
            pokemon.vidaActual=0
        }
    }
    fun curar(pokemon: Pokemon){
        pokemon.vidaActual += (Math.random() *  50+25).toInt()

        if (pokemon.vidaActual>pokemon.vidaMaxima){
            pokemon.vidaActual=pokemon.vidaMaxima
        }
    }
    // COMPROBAMOS SI EL POKEMON ESTA VIVO
    fun estaVivo(pokemon: Pokemon):Boolean{

        if (pokemon.vidaActual>200){
            pokemon.vidaActual = pokemon.vidaMaxima }

        if (pokemon.vidaActual<=0 ) {
            pokemon.vidaActual=0
            return false
        }
        return true
    }
}