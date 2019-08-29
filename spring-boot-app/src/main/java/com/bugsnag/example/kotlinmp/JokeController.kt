package com.bugsnag.example.kotlinmp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class JokeController {
    @GetMapping("jokes")
    fun getAllJokes() = JokeMachine().getAllJokes()

    @GetMapping("jokes/random")
    fun getRandomJokes() = JokeMachine().pokeAJoke()

    @GetMapping("jokes/random/{name}")
    fun getCustomJoke(@PathVariable name: String) = JokeMachine().pokeAJoke(name)
}
