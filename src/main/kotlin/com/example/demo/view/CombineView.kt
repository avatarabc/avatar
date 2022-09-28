package com.example.demo.view

import javafx.beans.property.SimpleObjectProperty
import tornadofx.*
import java.time.LocalDate


class CombineView : View() {

    val dateProperty = SimpleObjectProperty<LocalDate>();

    override val root = vbox {

        datepicker(dateProperty) {
            value = LocalDate.now()
        }

        textarea("please text here") {
            selectAll()
        }

        progressbar(0.5) {
            colorpicker() {

            }
        }

    }
}