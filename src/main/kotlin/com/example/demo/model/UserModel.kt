package com.example.demo.model

import tornadofx.*

class UserModel : ItemViewModel<User>() {
    val name = bind(User::name)
    val password = bind(User::password)
}