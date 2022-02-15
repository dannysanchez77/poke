package com.example.poke

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import java.io.File



class PokeApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(PokeApplication::class.java.getResource("escena1.fxml"))
        val scene = Scene(fxmlLoader.load(), 700.0, 500.0)
        stage.title = "Pokemon"
        stage.scene = scene
        stage.isResizable = false
        stage.show()
    }

}

fun main() {
    Application.launch(PokeApplication::class.java)
}