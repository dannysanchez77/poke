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

    private var listaPokemon = CargarPokemon.crearListaPokemon()

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
    private lateinit var genero00: ImageView
    @FXML
    private lateinit var genero10: ImageView
    @FXML
    private lateinit var genero20: ImageView
    @FXML
    private lateinit var genero01: ImageView
    @FXML
    private lateinit var genero11: ImageView
    @FXML
    private lateinit var genero21: ImageView

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

    data class Pokemon(
        var Nombre: String,
        var Nv: Int,
        var imagen: File,
        var genero: File,
        var vidaActual: Int,
        var vidaMaxima: Int
    )

    class CargarPokemon {
        companion object {
            fun crearListaPokemon(): MutableList<Pokemon> {
                val groudon = Pokemon(
                    "Groudon",
                    70,
                    File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\groudon.gif"),
                    File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\masculino.png"),
                    200,
                    200
                )
                val venusaur = Pokemon(
                    "Venusaur",
                    70,
                    File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\venusaur.gif"),
                    File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\masculino.png"),
                    200,
                    200
                )
                val torkoal = Pokemon(
                    "Torkoal",
                    70,
                    File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\torkoal.gif"),
                    File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\masculino.png"),
                    200,
                    200
                )
                val electivire = Pokemon(
                    "Electivire",
                    70,
                    File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\electivire.gif"),
                    File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\masculino.png"),
                    200,
                    200
                )
                val sharpedo = Pokemon(
                    "Sharpedo",
                    70,
                    File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\sharpedo.gif"),
                    File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\masculino.png"),
                    200,
                    200
                )
                val swampert = Pokemon(
                    "Swampert",
                    70,
                    File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\swampert.gif"),
                    File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\masculino.png"),
                    200,
                    200
                )
                return mutableListOf(groudon, venusaur, torkoal, electivire, sharpedo, swampert)
            }
        }
    }

    private fun calcularBarraVida(poke: Pokemon): Double {
        return poke.vidaActual.toDouble() / poke.vidaMaxima
    }

    fun configurarPoke(
        nombre: Label,
        nivel: Label,
        imagen: ImageView,
        genero: ImageView,
        vida: ProgressBar,
        ps: Label,
        poke: Pokemon
    ) {
        nombre.text = poke.Nombre
        nivel.text = "Nv " + poke.Nv
        imagen.image = Image(poke.imagen.toURI().toString())
        genero.image = Image(poke.genero.toURI().toString())
        vida.progress = calcularBarraVida(poke)
        ps.text = poke.vidaActual.toString() + '/' + poke.vidaMaxima
    }

    fun fondoPokeElegido(nombre: Label, Nv: Label, Ps: Label, pokemon: BorderPane) {
        val f = File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\1.png")
        nombre.style = nombre.style + "-fx-text-fill: #D4AC0D;"
        Nv.style = Nv.style + "-fx-text-fill: #D4AC0D;"
        Ps.style = Ps.style + "-fx-text-fill: #D4AC0D;"
        pokemon.style = pokemon.style + "-fx-background-image: url(\"${f.toURI().toURL()}\")"

    }

    fun fondoPokeNo(nombre: Label, Nv: Label, Ps: Label, pokemon: BorderPane) {
        nombre.style = nombre.style + "-fx-text-fill: white ;"
        Nv.style = Nv.style + "-fx-text-fill: white;"
        Ps.style = Ps.style + "-fx-text-fill: white ;"
        pokemon.style =
            pokemon.style + "-fx-background-color: none;-fx-border-color: none;-fx-border-style:none;-fx-border-width:0;"
    }

    fun initialize() {
        elegir.disableProperty().set(true)
        fondo.image = Image(File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\fondo.jpg").toURI().toString())
        configurarPoke(Nombre00, Nv00, foto00, genero00, vida00, Ps00, listaPokemon[0])
        configurarPoke(Nombre10, Nv10, foto10, genero10, vida10, Ps10, listaPokemon[1])
        configurarPoke(Nombre20, Nv20, foto20, genero20, vida20, Ps20, listaPokemon[2])
        configurarPoke(Nombre01, Nv01, foto01, genero01, vida01, Ps01, listaPokemon[3])
        configurarPoke(Nombre11, Nv11, foto11, genero11, vida11, Ps11, listaPokemon[4])
        configurarPoke(Nombre21, Nv21, foto21, genero21, vida21, Ps21, listaPokemon[5])
    }

    @FXML
    private fun poke00() {
        fondoPokeElegido(Nombre00, Nv00, Ps00, pokemon00)
        fondoPokeNo(Nombre10, Nv10, Ps10, pokemon10)
        fondoPokeNo(Nombre20, Nv20, Ps20, pokemon20)
        fondoPokeNo(Nombre01, Nv01, Ps01, pokemon01)
        fondoPokeNo(Nombre11, Nv11, Ps11, pokemon11)
        fondoPokeNo(Nombre21, Nv21, Ps21, pokemon21)
        elegir.disableProperty().set(false)
    }

    @FXML
    private fun poke10() {
        fondoPokeElegido(Nombre10, Nv10, Ps10, pokemon10)
        fondoPokeNo(Nombre00, Nv00, Ps00, pokemon00)
        fondoPokeNo(Nombre20, Nv20, Ps20, pokemon20)
        fondoPokeNo(Nombre01, Nv01, Ps01, pokemon01)
        fondoPokeNo(Nombre11, Nv11, Ps11, pokemon11)
        fondoPokeNo(Nombre21, Nv21, Ps21, pokemon21)
        elegir.disableProperty().set(false)
    }

    @FXML
    private fun poke20() {
        fondoPokeElegido(Nombre20, Nv20, Ps20, pokemon20)
        fondoPokeNo(Nombre10, Nv10, Ps10, pokemon10)
        fondoPokeNo(Nombre00, Nv00, Ps00, pokemon00)
        fondoPokeNo(Nombre01, Nv01, Ps01, pokemon01)
        fondoPokeNo(Nombre11, Nv11, Ps11, pokemon11)
        fondoPokeNo(Nombre21, Nv21, Ps21, pokemon21)
        elegir.disableProperty().set(false)
    }

    @FXML
    private fun poke01() {
        fondoPokeElegido(Nombre01, Nv01, Ps01, pokemon01)
        fondoPokeNo(Nombre10, Nv10, Ps10, pokemon10)
        fondoPokeNo(Nombre20, Nv20, Ps20, pokemon20)
        fondoPokeNo(Nombre00, Nv00, Ps00, pokemon00)
        fondoPokeNo(Nombre11, Nv11, Ps11, pokemon11)
        fondoPokeNo(Nombre21, Nv21, Ps21, pokemon21)
        elegir.disableProperty().set(false)
    }

    @FXML
    private fun poke11() {
        fondoPokeElegido(Nombre11, Nv11, Ps11, pokemon11)
        fondoPokeNo(Nombre10, Nv10, Ps10, pokemon10)
        fondoPokeNo(Nombre20, Nv20, Ps20, pokemon20)
        fondoPokeNo(Nombre01, Nv01, Ps01, pokemon01)
        fondoPokeNo(Nombre00, Nv00, Ps00, pokemon00)
        fondoPokeNo(Nombre21, Nv21, Ps21, pokemon21)
        elegir.disableProperty().set(false)
    }
    @FXML
    private fun poke21() {
        fondoPokeElegido(Nombre21, Nv21, Ps21, pokemon21)
        fondoPokeNo(Nombre10, Nv10, Ps10, pokemon10)
        fondoPokeNo(Nombre20, Nv20, Ps20, pokemon20)
        fondoPokeNo(Nombre01, Nv01, Ps01, pokemon01)
        fondoPokeNo(Nombre11, Nv11, Ps11, pokemon11)
        fondoPokeNo(Nombre00, Nv00, Ps00, pokemon00)
        elegir.disableProperty().set(false)
    }/*
    @FXML
    fun elegirPulsado() {
        try {
            if (stage == null) {
                var pokeSelection: BatallaController
                stage = Stage()
                stage?.isResizable = false
                val fxmlloader = FXMLLoader(BatallaController::class.java.getResource("escena2.fxml"))
                val scene = Scene(fxmlLoader.load(), 700.0, 500.0)
                stage?.tittle = "Pokemon"
                stage?.scene = scene
                stage.isResizable = false
                stage?.show()

                val controller = loader.getController<PokemonSeleccionadoController>()
                var select: Pokemon
                arrayPokemon.forEachIndexed { index, pokemon ->
                    println(arrayPokemon[index].click)
                    if (pokemon.click) {
                        select = arrayPokemon[index]

                        controller.cargarPokemon(select)
                        controller.enviarDatosMenuSeleccion(this)
                        pokeSelection = PokemonSeleccionadoController()
                    }
            }

        } catch (e: IOException) {
            e.printStackTrace()
        }
    }*/
}