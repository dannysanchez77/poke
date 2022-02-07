package com.example.poke

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import java.io.File
var pokeElegido = ArrayList<Pokemon>()
var pokeRival = ArrayList<Pokemon>()
class PokeApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(PokeApplication::class.java.getResource("escena1.fxml"))
        val scene = Scene(fxmlLoader.load(), 700.0, 500.0)
        stage.title = "Pokemon"
        stage.scene = scene
        stage.isResizable = false
        stage.show()

        val groudon = Pokemon(
            "Groudon",
            70,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\groudon.gif"),
            200,
            200,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\swampert_espalda.gif")
            )
        val venusaur = Pokemon(
            "Venusaur",
            70,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\venusaur.gif"),
            200,
            200,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\swampert_espalda.gif")
            )
        val torkoal = Pokemon(
            "Torkoal",
            70,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\torkoal.gif"),
            200,
            200,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\swampert_espalda.gif")
            )
        val electivire = Pokemon(
            "Electivire",
            70,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\electivire.gif"),
            200,
            200,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\swampert_espalda.gif")
            )
        val sharpedo = Pokemon(
            "Sharpedo",
            70,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\sharpedo.gif"),
            200,
            200,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\swampert_espalda.gif")
            )
        val swampert = Pokemon(
            "Swampert",
            70,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\swampert.gif"),
            200,
            200,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\swampert_espalda.gif"),
            )


        pokeElegido.add(groudon)
        pokeElegido.add(venusaur)
        pokeElegido.add(torkoal)
        pokeElegido.add(electivire)
        pokeElegido.add(sharpedo)
        pokeElegido.add(swampert)

        val blastoise = Pokemon(
            "Blastoise",
            70,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\blasto.gif"),
            200,
            200,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\blasto.gif")
            )
        val charizard = Pokemon(
            "Charizard",
            70,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\charizard.gif"),
            200,
            200,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\charizard.gif")
            )
        val incineroar = Pokemon(
            "Incineroar",
            70,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\incineroar.gif"),
            200,
            200,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\incineroar.gif")

            )
        val archeops = Pokemon(
            "Archeops",
            70,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\archeops.gif"),
            200,
            200,
            File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\archeops.gif")
        )

        pokeRival.add(blastoise)
        pokeRival.add(charizard)
        pokeRival.add(incineroar)
        pokeRival.add(archeops)
    }
}

fun main() {
    Application.launch(PokeApplication::class.java)
}