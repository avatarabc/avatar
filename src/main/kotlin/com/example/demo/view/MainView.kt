package com.example.demo.view

import tornadofx.*

class MainView : View("Hello TornadoFX") {

    override val root = stackpane {
        add(ComboxView::class)
    }
}
