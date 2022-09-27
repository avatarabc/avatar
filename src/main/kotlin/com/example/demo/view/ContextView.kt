package com.example.demo.view

import com.example.demo.model.User
import tornadofx.*

class ContextView : View() {

    val userList = listOf<User>(User("arthur", "21"), User("tom", "23")).asObservable()

    override val root = stackpane {
        tableview(userList) {
            column("名称", User::name)
            column("年纪", User::age) {}
            contextmenu {
                item("aaa").action {
                    print("aaa")
                }
                item("bbb").action {
                    print("bbb")
                }
                item("ccc").action {
                    print("ccc")
                }
            }
        }
    }


}