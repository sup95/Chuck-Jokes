package com.bugsnag.example.kotlinmp

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

fun launchApp(primaryStage: Stage, classLoader: ClassLoader) {
    val root = FXMLLoader.load<Parent>(classLoader.getResource("app.fxml")!!)
    primaryStage.title = "Poke A Joke"
    primaryStage.scene = Scene(root, 650.0, 650.0)
    primaryStage.show()
}
