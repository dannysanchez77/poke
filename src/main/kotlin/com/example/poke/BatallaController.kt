package com.example.poke
import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.ProgressBar
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.BorderPane
import java.io.File
import java.util.*

class BatallaController {
    var posiblesPokemonRivales = ArrayList<Pokemon>()
    lateinit var pokemonRival : Pokemon

    lateinit var elegirLuchador:Pokemon //he añadido esta xq no me lo cogia en el click
    val pokemonRival1 = Pokemon(
        "Blastoise",
        70,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\blasto.gif"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\masculino.png"),
        200,
        200,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\blasto.gif")
    )
    val pokemonRival2 = Pokemon(
        "Charizard",
        70,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\charizard.gif"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\femenino.png"),
        200,
        200,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\charizard.gif")
    )
    val pokemonRival3 = Pokemon(
        "Incineroar",
        70,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\incineroar.gif"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\masculino.png"),
        200,
        200,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\incineroar.gif")

    )
    val pokemonRival4 = Pokemon(
        "Archeops",
        70,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\archeops.gif"),
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\femenino.png"),
        200,
        200,
        File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\archeops.gif")

    )
    // FONDO
    @FXML private lateinit var fondoBatalla: ImageView

    // RIVAL
    @FXML private lateinit var nombreRival: Label
    @FXML private lateinit var nvRival: Label
    @FXML private lateinit var vidaActualRival: Label
    @FXML private lateinit var generoRival: ImageView
    @FXML private lateinit var barraRival: ProgressBar
    @FXML private lateinit var fotoRival: ImageView

    // ELEGIDO
    @FXML private lateinit var nombreElegido: Label
    @FXML private lateinit var nvElegido: Label
    @FXML private lateinit var vidaActualElegido: Label
    @FXML private lateinit var generoElegido: ImageView
    @FXML private lateinit var barraElegido: ProgressBar
    @FXML private lateinit var fotoElegido: ImageView

    @FXML private lateinit var ataqueSeguro: Label
    @FXML private lateinit var ataqueMuyArriesgado: Label
    @FXML private lateinit var ataqueArriesgado: Label
    @FXML private lateinit var curar: Label
    @FXML private lateinit var atacar: Label
    @FXML private lateinit var salir: Label
    @FXML private lateinit var BoxAtaques: BorderPane
    @FXML private lateinit var BoxJugar: BorderPane

    private fun calcularBarraVida(poke: Pokemon): Double{

        return poke.vidaActual.toDouble()/poke.vidaMaxima
    }

    fun initialize() {

        posiblesPokemonRivales.add(pokemonRival1)
        posiblesPokemonRivales.add(pokemonRival2)
        posiblesPokemonRivales.add(pokemonRival3)
        posiblesPokemonRivales.add(pokemonRival4)
        BoxAtaques.visibleProperty().set(false)

        fondoBatalla.image= Image(File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\fondoBatalla.png").toURI().toString())


        pokemonRival = posiblesPokemonRivales.random()
        nombreRival.text=pokemonRival.Nombre
        nvRival.text= "Nv "+pokemonRival.Nv
        fotoRival.image = Image(pokemonRival.imagen.toURI().toString())
        generoRival.image= Image(pokemonRival.genero.toURI().toString())
        barraRival.progress = calcularBarraVida(pokemonRival)
        vidaActualRival.text = pokemonRival.vidaActual.toString()

    }
    fun traerPokemon(elegirLuchador: Pokemon) {
        nombreElegido.text= elegirLuchador.Nombre
        nvElegido.text = "Nv "+elegirLuchador.Nv.toString()
        fotoElegido.image = Image(elegirLuchador.imagenEspalda.toURI().toString())
        generoElegido.image = Image(elegirLuchador.genero.toURI().toString())
        vidaActualElegido.text = elegirLuchador.vidaActual.toString()
        barraElegido.progress = calcularBarraVida(elegirLuchador)
    }
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



    @FXML private fun ataqueSeguroClicked(){

    ataqueSeguro

    }
    @FXML private fun ataqueArriClicked(){

    }
    @FXML private fun ataqueMuyArriClicked(){

    }
    @FXML private fun curarClicked(){

    }
    @FXML private fun salirClicked(){

    }
    @FXML private fun atacarClicked(){
        BoxJugar.visibleProperty().set(false)
        BoxAtaques.visibleProperty().set(true)
    }
    @FXML private fun ataqueSeguroEntered(){

    }
    @FXML private fun ataqueSeguroExited(){

    }
    @FXML private fun ataqueMuyArriEntered(){

    }
    @FXML private fun ataqueMuyArriExited(){

    }
    @FXML private fun ataqueArriEntered(){

    }
    @FXML private fun ataqueArriExited(){

    }
    @FXML private fun curarEntered(){

    }
    @FXML private fun curarExited(){

    }
    @FXML private fun atacarEntered(){

    }
    @FXML private fun atacarExited(){

    }
}


