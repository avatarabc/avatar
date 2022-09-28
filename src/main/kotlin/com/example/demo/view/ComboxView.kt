package com.example.demo.view

import javafx.beans.property.SimpleStringProperty
import javafx.collections.FXCollections
import tornadofx.*

class ComboxView : View() {


    val list = FXCollections.observableArrayList("go", "back", "pause")

    val value = SimpleStringProperty("go")

    override val root = form {
           title="哇哈哈";
            fieldset {
                field("work") {
                    combobox(value, list)
                }
            }

    }
}