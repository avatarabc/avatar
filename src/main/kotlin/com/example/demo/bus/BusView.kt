package com.example.demo.bus

import tornadofx.*

class BusView : View() {


    override val root = vbox {
        button("fire") {
            action {
                fire(WordEvent("aaaa"))
            }
        }
    }

    init {
        subscribe<WordEvent> { event ->
            print(event.word)
        }
    }
}