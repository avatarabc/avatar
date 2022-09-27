package com.example.demo.app

import com.example.demo.MainView
import tornadofx.*

class MyApp : App(MainView::class, Styles::class) {
    init {
        reloadStylesheetsOnFocus()
    }
}