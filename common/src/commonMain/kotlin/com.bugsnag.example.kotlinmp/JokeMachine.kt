package com.bugsnag.example.kotlinmp

class JokeMachine {

    fun getAllJokes(name: String = "Chuck Norris") = listOf(
            "$name knows the last digit of PI.",
            "If $name writes code with bugs, the bugs fix themselves.",
            "$name can retrieve anything from null.",
            "$name can solve the Towers of Hanoi in one move.",
            "$name went out of an infinite loop."
    )

    fun pokeAJoke(name: String = "Chuck Norris"): String {
        var theJokeName = name
        if(name.isBlank()) theJokeName = "Chuck Norris"
        return getAllJokes(theJokeName).shuffled().take(1)[0]
    }

}