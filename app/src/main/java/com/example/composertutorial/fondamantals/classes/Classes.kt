package com.example.composertutorial.fondamantals.classes

class SmartDevice(){
    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"

    fun turnOn(){
        println("Smart Tv device is turned on")
         /*
         A valid use case to call the turnOff() method could be to turn off
         the TV when available power doesn't meet the requirement.
         */

        //turnOff()
    }
    fun turnOff(){
        println("Smart Tv device is turned off")
    }
}

fun main(){
    val smartTvDevice = SmartDevice()

    // access variable using class
    //println(smartTvDevice.name)

    // access function using class
    println("Device name is : ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}