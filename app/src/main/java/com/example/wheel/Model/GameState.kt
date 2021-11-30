package com.example.wheel.Model

sealed class GameState {
    class Running(val lettersUsed: String,
                    val underscoreWord: String,
                    val drawable: Int) : GameState()
    class Lost(val WordToGuess: String) : GameState()
    class Won(val wodToGuess: String) : GameState()

}