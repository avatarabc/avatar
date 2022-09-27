package com.example.demo

import com.example.demo.view.ComboxView
import com.example.demo.view.DayOfWeekView
import tornadofx.*

class MainView : View("Hello TornadoFX") {

    override val root = stackpane {
        add(ComboxView::class)
        add(DayOfWeekView::class)
    }
}
