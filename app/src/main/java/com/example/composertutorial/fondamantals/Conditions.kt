package com.example.composertutorial.fondamantals

fun main(){
    // String Color
    enterColorToCheck()

    //Integer Number
    enterNumberToCheck()
}

fun enterColorToCheck(){

    println("Enter a color name : ")
    val color: String = readLine().toString()

    //condition If
    //checkWithIfCondition(color)

    // condition When
    checkWithWhenCondition( color)
}

fun enterNumberToCheck(){

    println("Enter value : ")
    val num: Int = readln().toInt()

    //fun with parameter
    checkNumberWithWhenCondition(num)
}

fun checkWithIfCondition( color : String){
    if(color == "white"){
        println("The color is white")
    }
    else if (color == "black"){
        println("The color is black")
    }
    else if (color == "yellow"){
        println("The color is yellow")
    }
    else{
        println("That does not exist")
    }
}

fun checkWithWhenCondition( color : String){
    val i =  "a".."z"
    val u =  "A".."Z"

    when (color) {
        in "a".."z".plus("A".."Z") ->{
            println("Exist!!!")
        }
        "white" -> {
            println("The color is white")
        }
        "black" -> {
            println("The color is black")
        }
        "yellow" -> {
            println("The color is yellow")
        }
        else -> {
            println("That does not exist")
        }
    }
}

fun checkNumberWithWhenCondition( num : Int){

    when (num) {
        in 1..10->{
            println(" Number exist!!!")
        }
        else -> {
            println("That does not exist")
        }
    }
}