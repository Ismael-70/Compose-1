package com.example.composertutorial.fondamantals

class SmartPhone(val name: String, val category: String){

    var deviceStatus = "online"

    // Second  constructor
    constructor(name: String,category: String,statusCode: Int) : this(name,category){
        deviceStatus = when(statusCode){
            0-> "Offline"
            1-> "Online"
            else-> "Unknown"
        }
    }
    /*fun turnOn(){
        println("Smart Tv device is turned on")
    }

    fun turnOff(){
        println("Smart Tv device is turned off")
    }*/
}

fun main(){
    //access parameter of primary  constructor
    val display = SmartPhone("Android Phone", "Entertainment")
    val name = display.name
    val category = display.category
    println("\nDevice name : $name \nDevice category : $category")

    //access parameter of second  constructor
}