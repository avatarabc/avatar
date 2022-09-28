package com.example.demo.bus

import com.example.demo.model.UserModel
import tornadofx.*

class UserModelEvent(val model:UserModel) :FXEvent(){
}