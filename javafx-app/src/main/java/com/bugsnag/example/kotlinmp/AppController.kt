package com.bugsnag.example.kotlinmp

import javafx.scene.control.*
import javafx.scene.layout.HBox
import javafx.scene.layout.Priority
import javafx.scene.layout.Region

class AppController {

    lateinit var rootPane: HBox
    lateinit var jokeLabel: Label
    lateinit var nameField: TextField

    fun showJoke() {
        val name = nameField.text
        val joke = JokeMachine().pokeAJoke(name)
        jokeLabel.text = joke
    }
}
