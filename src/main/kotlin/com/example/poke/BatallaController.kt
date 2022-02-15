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

}