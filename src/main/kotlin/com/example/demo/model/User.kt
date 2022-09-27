package com.example.demo.model

import javafx.beans.property.SimpleStringProperty

class User(name: String, age: String) {

    val name = SimpleStringProperty(this,"name",name);
    val password = SimpleStringProperty(this,"password");
    val age = SimpleStringProperty(this,"age",age);

}