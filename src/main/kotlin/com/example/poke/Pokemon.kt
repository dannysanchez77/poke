package com.example.poke

import java.io.File
import kotlin.random.Random

data class Pokemon(
    var Nombre: String,
    var Nv: Int,
    var imagen: File,
    var vidaMaxima: Int,
    var vidaActual: Int = vidaMaxima,
    var imagenCombate: File,
    var boolean: Boolean =false,)
{

    fun isAliveSelect():Boolean{
        var vivo=true

        if (vidaActual<=0)
            vivo=false

        return vivo
    }

    fun recibirAtack(i:Int){
        var atack2=0
        var atack3=0
        if (this.isAliveSelect())
            if (i==1)
                if (vidaActual-20<0)
                    vidaActual=0
                else
                    vidaActual-=20
            else if (i==2)
                atack2=  Random.nextInt(10,26)
        if (vidaActual-atack2<0)
            vidaActual=0
        else
            vidaActual-=atack2
        if (i==3)
            atack3= Random.nextInt(0,51)
        if (vidaActual-atack3<0)
            vidaActual=0
        else
            vidaActual-=atack3


    }

    fun curarSelect(){
        var curarAliado= Random.nextInt(25,76)
        if (vidaActual+curarAliado>vidaMaxima)
            vidaActual=vidaMaxima
        else
            vidaActual+=curarAliado
    }
}
data class PokeRival(val nombre: String,
                     val image: String,
                     val nivel: Int,
                     val vidaMaxima: Int,
                     var vidaActual: Int=vidaMaxima){
    fun isAliveEnemy():Boolean{
        var vivo=true

        if (vidaActual<=0)
            vivo=false

        return vivo
    }
    fun recibirAtackPlayer(i:Int){
        var atack2=0
        var atack3=0
        if (this.isAliveEnemy())
            if (i==1)
                if (vidaActual-2000<0)
                    vidaActual=0
                else
                    vidaActual-=20
            else if (i==2)
                atack2=  Random.nextInt(10,26)
        if (vidaActual-atack2<0)
            vidaActual=0
        else
            vidaActual-=atack2
        if (i==3)
            atack3= Random.nextInt(0,51)
        if (vidaActual-atack3<0)
            vidaActual=0
        else
            vidaActual-=atack3

    }

    fun curarEnemy(){
        var curarEnemigo= Random.nextInt(25,76)
        if (vidaActual+curarEnemigo>vidaMaxima)
            vidaActual=vidaMaxima
        else
            vidaActual+=curarEnemigo
    }
}
