package com.example.demo.view

import javafx.beans.property.StringProperty
import javafx.scene.Parent
import tornadofx.*

class TableView : View() {

    private val list = listOf(
            "the", "world", "a", "fine", "place"
    ).asObservable()

    override val root = vbox {
        tableview(list) {
            column("word", String::get)
            smartResize()
        }
    }
}