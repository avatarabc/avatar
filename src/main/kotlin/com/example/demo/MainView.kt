package com.example.demo

import com.example.demo.bus.BusView
import com.example.demo.view.*
import tornadofx.*

class MainView : View("Hello TornadoFX") {

    override val root = borderpane {
        left<BusView>()
        right<ValidateView>()
    }
}
