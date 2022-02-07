package com.example.poke

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.ProgressBar
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.BorderPane
import javafx.stage.Stage


import java.io.File
import java.io.IOException

class ElegirPokemonController {


    @FXML
    private lateinit var fondo: ImageView

    @FXML
    private lateinit var pokemon00: BorderPane

    @FXML
    private lateinit var pokemon10: BorderPane

    @FXML
    private lateinit var pokemon20: BorderPane

    @FXML
    private lateinit var pokemon01: BorderPane

    @FXML
    private lateinit var pokemon11: BorderPane

    @FXML
    private lateinit var pokemon21: BorderPane

    @FXML
    private lateinit var Nombre00: Label

    @FXML
    private lateinit var Nombre10: Label

    @FXML
    private lateinit var Nombre20: Label

    @FXML
    private lateinit var Nombre01: Label

    @FXML
    private lateinit var Nombre11: Label

    @FXML
    private lateinit var Nombre21: Label

    @FXML
    private lateinit var Nv00: Label

    @FXML
    private lateinit var Nv10: Label

    @FXML
    private lateinit var Nv20: Label

    @FXML
    private lateinit var Nv01: Label

    @FXML
    private lateinit var Nv11: Label

    @FXML
    private lateinit var Nv21: Label

    @FXML
    private lateinit var foto00: ImageView

    @FXML
    private lateinit var foto10: ImageView

    @FXML
    private lateinit var foto20: ImageView

    @FXML
    private lateinit var foto01: ImageView

    @FXML
    private lateinit var foto11: ImageView

    @FXML
    private lateinit var foto21: ImageView

    @FXML
    private lateinit var vida00: ProgressBar

    @FXML
    private lateinit var vida10: ProgressBar

    @FXML
    private lateinit var vida20: ProgressBar

    @FXML
    private lateinit var vida01: ProgressBar

    @FXML
    private lateinit var vida11: ProgressBar

    @FXML
    private lateinit var vida21: ProgressBar

    @FXML
    private lateinit var Ps00: Label

    @FXML
    private lateinit var Ps10: Label

    @FXML
    private lateinit var Ps20: Label

    @FXML
    private lateinit var Ps01: Label

    @FXML
    private lateinit var Ps11: Label

    @FXML
    private lateinit var Ps21: Label

    @FXML
    private lateinit var elegir: Button





    private fun calcularBarraVida(poke: Pokemon): Double {
        return poke.vidaActual.toDouble() / poke.vidaMaxima
    }

    fun configurarPoke(
        nombre: Label,    // VARIABLE DEL NOMBRE DEL POKEMON
        nivel: Label,     // VARIABLE DEL NIVEL DEL POKEMON
        imagen: ImageView,// VARIABLE DE LA IMAGEN DEL POKEMON
        vida: ProgressBar,// VARIABLE DE LA PROGRESS BAR DEL POKEMON
        ps: Label,        // VARIABLE VIDA DEL POKEMON
        poke: Pokemon     // VARIABLE CUADRO DEL POKEMON

    ) { // ASIGNACION DE VARIABLES
        nombre.text = poke.Nombre
        nivel.text = "Nv " + poke.Nv
        imagen.image = Image(poke.imagen.toURI().toString())
        vida.progress = calcularBarraVida(poke)
        ps.text = poke.vidaActual.toString() + '/' + poke.vidaMaxima
    }

    // CARACTERISTICAS DEL FONDO DEL POKEMON ELEGIDO
    fun fondoPokeElegido(nombre: Label, Nv: Label, Ps: Label, pokemon: BorderPane) {
        val f = File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\1.png") // VARIABLE DEL FONDO
        nombre.style = nombre.style + "-fx-text-fill: #D4AC0D;" // CAMBIAR COLOR
        Nv.style = Nv.style + "-fx-text-fill: #D4AC0D;" // CAMBIAR COLOR
        Ps.style = Ps.style + "-fx-text-fill: #D4AC0D;" // CAMBIAR COLOR
        pokemon.style =
            pokemon.style + "-fx-background-image: url(\"${f.toURI().toURL()}\")" // FONDO DEL CUADRO DEL POKEMON

    }

    // CARACTERISCAS DEL FONDO DE LOS POKEMON NO ELEGIDOS
    fun fondoPokeNo(nombre: Label, Nv: Label, Ps: Label, pokemon: BorderPane) {
        nombre.style = nombre.style + "-fx-text-fill: white ;" //RESTABLECER COLOR
        Nv.style = Nv.style + "-fx-text-fill: white;"          //RESTABLECER COLOR
        Ps.style = Ps.style + "-fx-text-fill: white ;"         //RESTABLECER COLOR
        pokemon.style = pokemon.style + "-fx-background-color: none;-fx-border-color: none;-fx-border-style:none;-fx-border-width:0;" //RESTABLECER FONDO
    }

    fun initialize() { // INICIALIZAR LOS POKEMON, EL FONDO Y DESABILITAR EL BOTON DE ELEGIR EL POKEMON
        elegir.disableProperty().set(true)
        fondo.image = Image(File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\fondo.jpg").toURI().toString())
        configurarPoke(Nombre00, Nv00, foto00,  vida00, Ps00, pokeElegido[0])
        configurarPoke(Nombre10, Nv10, foto10,  vida10, Ps10, pokeElegido[1])
        configurarPoke(Nombre20, Nv20, foto20,  vida20, Ps20, pokeElegido[2])
        configurarPoke(Nombre01, Nv01, foto01,  vida01, Ps01, pokeElegido[3])
        configurarPoke(Nombre11, Nv11, foto11,  vida11, Ps11, pokeElegido[4])
        configurarPoke(Nombre21, Nv21, foto21,  vida21, Ps21, pokeElegido[5])
    }

    @FXML
    private fun poke00() { //ELEGIR EL POKEMON POSICION 00
        fondoPokeElegido(Nombre00, Nv00, Ps00, pokemon00)
        fondoPokeNo(Nombre10, Nv10, Ps10, pokemon10)
        fondoPokeNo(Nombre20, Nv20, Ps20, pokemon20)
        fondoPokeNo(Nombre01, Nv01, Ps01, pokemon01)
        fondoPokeNo(Nombre11, Nv11, Ps11, pokemon11)
        fondoPokeNo(Nombre21, Nv21, Ps21, pokemon21)
        elegir.disableProperty().set(false)
        pokeElegido[0].boolean=true

    }

    @FXML
    private fun poke10() { //ELEGIR EL POKEMON POSICION 10
        fondoPokeElegido(Nombre10, Nv10, Ps10, pokemon10)
        fondoPokeNo(Nombre00, Nv00, Ps00, pokemon00)
        fondoPokeNo(Nombre20, Nv20, Ps20, pokemon20)
        fondoPokeNo(Nombre01, Nv01, Ps01, pokemon01)
        fondoPokeNo(Nombre11, Nv11, Ps11, pokemon11)
        fondoPokeNo(Nombre21, Nv21, Ps21, pokemon21)
        elegir.disableProperty().set(false)
        pokeElegido[1].boolean=true
    }

    @FXML
    private fun poke20() { //ELEGIR EL POKEMON POSICION 20
        fondoPokeElegido(Nombre20, Nv20, Ps20, pokemon20)
        fondoPokeNo(Nombre10, Nv10, Ps10, pokemon10)
        fondoPokeNo(Nombre00, Nv00, Ps00, pokemon00)
        fondoPokeNo(Nombre01, Nv01, Ps01, pokemon01)
        fondoPokeNo(Nombre11, Nv11, Ps11, pokemon11)
        fondoPokeNo(Nombre21, Nv21, Ps21, pokemon21)
        elegir.disableProperty().set(false)
        pokeElegido[2].boolean=true
    }

    @FXML
    private fun poke01() { //ELEGIR EL POKEMON POSICION 01
        fondoPokeElegido(Nombre01, Nv01, Ps01, pokemon01)
        fondoPokeNo(Nombre10, Nv10, Ps10, pokemon10)
        fondoPokeNo(Nombre20, Nv20, Ps20, pokemon20)
        fondoPokeNo(Nombre00, Nv00, Ps00, pokemon00)
        fondoPokeNo(Nombre11, Nv11, Ps11, pokemon11)
        fondoPokeNo(Nombre21, Nv21, Ps21, pokemon21)
        elegir.disableProperty().set(false)
        pokeElegido[3].boolean=true
    }

    @FXML
    private fun poke11() {  //ELEGIR EL POKEMON POSICION 11
        fondoPokeElegido(Nombre11, Nv11, Ps11, pokemon11)
        fondoPokeNo(Nombre10, Nv10, Ps10, pokemon10)
        fondoPokeNo(Nombre20, Nv20, Ps20, pokemon20)
        fondoPokeNo(Nombre01, Nv01, Ps01, pokemon01)
        fondoPokeNo(Nombre00, Nv00, Ps00, pokemon00)
        fondoPokeNo(Nombre21, Nv21, Ps21, pokemon21)
        elegir.disableProperty().set(false)
        pokeElegido[4].boolean=true
    }

    @FXML
    private fun poke21() { //ELEGIR EL POKEMON POSICION 21
        fondoPokeElegido(Nombre21, Nv21, Ps21, pokemon21)
        fondoPokeNo(Nombre10, Nv10, Ps10, pokemon10)
        fondoPokeNo(Nombre20, Nv20, Ps20, pokemon20)
        fondoPokeNo(Nombre01, Nv01, Ps01, pokemon01)
        fondoPokeNo(Nombre11, Nv11, Ps11, pokemon11)
        fondoPokeNo(Nombre00, Nv00, Ps00, pokemon00)
        elegir.disableProperty().set(false)
        pokeElegido[5].boolean=true
    }


    var stage: Stage? = null
    fun elegirPulsado(){
        try{
            if(stage==null) {
                var pokemonSeleccionado:BatallaController
                val stage = Stage()
                val loader = FXMLLoader(BatallaController::class.java.getResource("escena2.fxml"))
                val scene = Scene(loader.load(), 700.0, 500.0)
                stage.title = "Pokemon"
                stage.scene = scene
                stage.isResizable = false
                stage.show()
                val controlador = loader.getController<BatallaController>()
                var elegido: Pokemon
                pokeElegido.forEachIndexed { index, pokemon ->
                    if (pokemon.boolean) {
                        elegido = pokeElegido[index]
                        controlador.cargarPokemonElegido(elegido)
                        controlador.cargarPokemonRival(this)
                        pokemonSeleccionado = BatallaController()
                    }
                }
            }
        }catch (e: IOException){
            e.printStackTrace()
        }
    }
}