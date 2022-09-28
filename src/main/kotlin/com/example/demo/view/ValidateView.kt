package com.example.demo.view

import com.example.demo.bus.UserModelEvent
import com.example.demo.model.UserModel
import tornadofx.*

class ValidateView : View() {


    private val model: UserModel by inject()
    override val root = vbox {
        form {
            fieldset("login") {
                field("name") {
                    textfield(model.name) {
                        required()
                    }
                    passwordfield(model.password) {
                        required()
                    }
                }
                button("login") {
                    action {
                        fire(UserModelEvent(model))
                    }
                }
            }
        }
    }

    init {
        subscribe<UserModelEvent> { messageEvent ->
            print(messageEvent.model.name)
            print(messageEvent.model.password)
        }
    }
}