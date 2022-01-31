package com.example.poke
import javafx.fxml.FXML
import javafx.scene.control.ProgressBar
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.BorderPane
import java.awt.Label
import java.io.File

class BatallaController {
    private var listaPokemonRival = CargarPokemonRival.crearListaPokemonRival()

    @FXML
    private lateinit var fondoBatalla: ImageView
    @FXML
    private lateinit var nombreRival: Label
    @FXML
    private lateinit var NvRival: Label
    @FXML
    private lateinit var VidaActualRival: Label
    @FXML
    private lateinit var nombreElegido: Label
    @FXML
    private lateinit var NvElegido: Label
    @FXML
    private lateinit var VidaActualElegido: Label
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

//fun InicioBatalla(Pokemon){

}

    data class PokemonRival(
        var Nombre: String,
        var Nv: Int,
        var imagen: File,
        var vidaActual: Int,
    )
}

class CargarPokemonRival {
    companion object {
        fun crearListaPokemonRival(): MutableList<BatallaController.PokemonRival> {
            val blastoise = BatallaController.PokemonRival(
                "Blastoise",
                70,
                File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\blasto.gif"),
                200,
            )
            val charizard = BatallaController.PokemonRival(
                "Charizard",
                70,
                File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\charizard.gif"),
                200,
            )
            val incineroar = BatallaController.PokemonRival(
                "Incineroar",
                70,
                File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\incineroar.gif"),
                200,
            )
            val archeops = BatallaController.PokemonRival(
                "Archeops",
                70,
                File("src\\main\\kotlin\\com\\example\\poke\\Pokemones\\archeops.gif"),
                200,
            )

            return mutableListOf(blastoise, charizard,incineroar, archeops)
        }
    }
}
/*fun configurarPokeRival(
    nombre: Label,    // VARIABLE DEL NOMBRE DEL POKEMON
    nivel: Label,     // VARIABLE DEL NIVEL DEL POKEMON
    pokemonRival: ImageView,// VARIABLE DE LA IMAGEN DEL POKEMON
    vida: ProgressBar,// VARIABLE DE LA PROGRESS BAR DEL POKEMON
) { // ASIGNACION DE VARIABLES
    nombre.text = BatallaController.PokemonRival.Nombre
    nivel.text = "Nv " + PokemonRival.Nv
    pokemonRival.image = Image(pokemonRival.imagen.toURI().toString())
    vida.progress = calcularBarraVida(poke)
    ps.text = poke.vidaActual.toString() + '/' + poke.vidaMaxima

*/
