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
    fun comprobarVivoElegido():Boolean{
        var vivo = true
        if (vidaActual > 0)
            vivo=false
        return vivo
    }
    fun recibirAtaque(i: Int){
        var ataque2=0
        var ataque3=0
        if (this.comprobarVivoElegido())
            if (i==1)
                if (vidaActual-20<0)
                    vidaActual=0
        else
            vidaActual-=20
        else if (i==2)
            ataque2 = Random.nextInt(10,26)
        if (vidaActual-ataque2<0)
            vidaActual=0
        else
            vidaActual-=ataque2
        if (i==3)
            ataque3=Random.nextInt(0,51)
        if (vidaActual-ataque3<0)
            vidaActual=0
        else
            vidaActual-=ataque3
    }
    fun curarElegido(){
        var pocionElegido=Random.nextInt(25,76)
        if (vidaActual+pocionElegido>vidaMaxima)
            vidaActual=vidaMaxima
        else
            vidaActual+=pocionElegido
    }
    fun comprobarVivoRival():Boolean{
        var vivo = true
        if (vidaActual > 0)
            vivo=false
        return vivo
    }
    fun recibirAtaqueRival(i: Int){
        var ataque2=0
        var ataque3=0
        if (this.comprobarVivoElegido())
            if (i==1)
                if (vidaActual-20<0)
                    vidaActual=0
                else
                    vidaActual-=20
            else if (i==2)
                ataque2 = Random.nextInt(10,26)
        if (vidaActual-ataque2<0)
            vidaActual=0
        else
            vidaActual-=ataque2
        if (i==3)
            ataque3=Random.nextInt(0,51)
        if (vidaActual-ataque3<0)
            vidaActual=0
        else
            vidaActual-=ataque3
    }
    fun curarRival(){
        var pocionRival=Random.nextInt(25,76)
        if (vidaActual+pocionRival>vidaMaxima)
            vidaActual=vidaMaxima
        else
            vidaActual+=pocionRival
    }
}