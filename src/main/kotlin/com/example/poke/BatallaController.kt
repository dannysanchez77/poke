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
    lateinit var miLuchador : Pokemon

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
        miLuchador= elegirLuchador
    }

    fun actualizarVida(){
        vidaActualElegido.text = miLuchador.vidaActual.toString()
        vidaActualRival.text = pokemonRival.vidaActual.toString()
        barraElegido.progress = calcularBarraVida(miLuchador)
        barraRival.progress = calcularBarraVida(pokemonRival)

    }



    @FXML private fun ataqueSeguroClicked(){
        if (pokemonRival.estaVivo(miLuchador)){
            miLuchador.ataqueSeguro(pokemonRival)}

        if (miLuchador.estaVivo(pokemonRival)){
            pokemonRival.ataqueSeguro(miLuchador)
            }

        actualizarVida()
    }
    @FXML private fun ataqueArriClicked(){
        if (pokemonRival.estaVivo(miLuchador)){
            miLuchador.ataqueArriesgado(pokemonRival)}

        if (miLuchador.estaVivo(pokemonRival)){
            pokemonRival.ataqueArriesgado(miLuchador)}

        actualizarVida()
    }
    @FXML private fun ataqueMuyArriClicked(){
        if (pokemonRival.estaVivo(miLuchador)){
            miLuchador.ataqueMuyArriesgado(pokemonRival)}

        if (miLuchador.estaVivo(pokemonRival)){
            pokemonRival.ataqueMuyArriesgado(miLuchador)}
        actualizarVida()
    }
    @FXML private fun curarClicked(){
        miLuchador.curar(pokemonRival)
        pokemonRival.curar(miLuchador)
        actualizarVida()
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


