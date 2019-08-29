package com.bugsnag.example.kotlinmp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bugsnag.example.kotlinmp.R
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_language_list.*

class LanguageListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_list)
        title = "Poke A Joke"


        laughButton.setOnClickListener {
            val name = yourName.text
            val joke = JokeMachine().pokeAJoke(name.toString())
            theJoke.text = joke
        }
    }

}
