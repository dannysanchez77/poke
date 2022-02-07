package com.example.poke
import javafx.fxml.FXML
import javafx.scene.control.ProgressBar
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.BorderPane
import java.awt.Label
import java.io.File

class BatallaController {


    // FONDO
    @FXML
    private lateinit var fondoBatalla: ImageView

    // RIVAL
    @FXML
    private lateinit var NombreRival: Label
    @FXML
    private lateinit var NvRival: Label
    @FXML
    private lateinit var VidaActualRival: Label
    @FXML
    private lateinit var BarraRival: ProgressBar
    @FXML
    private lateinit var FotoRival: ImageView

    // ELEGIDO
    @FXML
    private lateinit var NombreElegido: Label
    @FXML
    private lateinit var NvElegido: Label
    @FXML
    private lateinit var VidaActualElegido: Label
    @FXML
    private lateinit var BarraElegido: ProgressBar
    @FXML
    private lateinit var FotoElegido: ImageView

    @FXML
    private lateinit var AtaqueSeguro: Label
    @FXML
    private lateinit var AtaqueMuyArri: Label
    @FXML
    private lateinit var AtaqueArri: Label
    @FXML
    private lateinit var Curar: Label
    @FXML
    private lateinit var Atacar: Label
    @FXML
    private lateinit var Salir: Label
    @FXML
    private lateinit var BoxAtaques: BorderPane
    @FXML
    private lateinit var BoxJugar: BorderPane

    class PokemonElegido(
        var NombreElegido: Label,
        var NvElegido: Label,
        var FotoElegido: ImageView,
        var VidaActualElegido:Label ,
        var BarraElegido: ProgressBar,
    )
    class PokemonRival(
        var NombreRival: Label,
        var NvRival: Label,
        var FotoRival: ImageView,
        var VidaActualRival: Label,
        var BarraRival: ProgressBar,
    )
    var pokeselec=Pokemon(
        "Venusaur",
        70,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\venusaur.gif"),
        200,
        200,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\venu_espalda.gif"),
    )
    fun cargarPokemonElegido(pokemon: Pokemon){
        pokemon.boolean=false
        pokeselec = pokemon

        val pokemonElegidoBatalla = PokemonElegido(NombreElegido,NvElegido,FotoElegido,VidaActualElegido,BarraElegido)
        initializeElegido(pokemonElegidoBatalla)
    }
fun initializeFondo(){
    fondoBatalla.image = Image(File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\fondoBatalla.jpg").toURI().toString())
}
    fun initializeElegido(pokemonElegidoBatalla: PokemonElegido) {
        val imagenPokeElegido= pokeselec.imagenCombate
        pokemonElegidoBatalla.FotoElegido.image=Image(imagenPokeElegido.toString())
        pokemonElegidoBatalla.NombreElegido.text=pokeselec.Nombre
        pokemonElegidoBatalla.VidaActualElegido.text="PS"
        pokemonElegidoBatalla.NvElegido.text="Nvl "+pokeselec.Nv
        pokemonElegidoBatalla.BarraElegido.progress=pokeselec.vidaActual.toDouble()/pokeselec.vidaMaxima
        if(pokemonElegidoBatalla.BarraElegido.progress>0.5)
            pokemonElegidoBatalla.BarraElegido.style="-fx-accent: #20ee31"
        else
            if(pokemonElegidoBatalla.BarraElegido.progress>0.25)
                pokemonElegidoBatalla.BarraElegido.style="-fx-accent: #ff8929"
            else
                if (pokemonElegidoBatalla.BarraElegido.progress<0.25)
                    pokemonElegidoBatalla.BarraElegido.style="-fx-accent:red"
                else
                    if (pokemonElegidoBatalla.BarraElegido.progress<0.5)
                        pokemonElegidoBatalla.BarraElegido.style="-fx-accent:#ff8929"
    }
    fun cargarPokemonRival(pokemon: ElegirPokemonController){
        val pokeRival = pokemon

        val pokemonRival = PokemonRival(NombreRival ,NvRival,FotoRival,VidaActualRival,BarraRival)
        initializeRival(pokemonRival)
    }
    fun initializeRival(pokemonRivalBatalla: PokemonRival) {
        val imagenPokeRival= pokeselec.imagenCombate
        pokemonRivalBatalla.FotoRival.image=Image(imagenPokeRival.toString())
        pokemonRivalBatalla.NombreRival.text=pokeselec.Nombre
        pokemonRivalBatalla.VidaActualRival.text="PS"
        pokemonRivalBatalla.NvRival.text="Nvl "+pokeselec.Nv
        pokemonRivalBatalla.BarraRival.progress=pokeselec.vidaActual.toDouble()/pokeselec.vidaMaxima
        if(pokemonRivalBatalla.BarraRival.progress>0.5)
            pokemonRivalBatalla.BarraRival.style="-fx-accent: #20ee31"
        else
            if(pokemonRivalBatalla.BarraRival.progress>0.25)
                pokemonRivalBatalla.BarraRival.style="-fx-accent: #ff8929"
            else
                if (pokemonRivalBatalla.BarraRival.progress<0.25)
                    pokemonRivalBatalla.BarraRival.style="-fx-accent:red"
                else
                    if (pokemonRivalBatalla.BarraRival.progress<0.5)
                        pokemonRivalBatalla.BarraRival.style="-fx-accent:#ff8929"
    }
}




