package com.example.composertutorial.fondamantals

fun main(){

    //enterValueToCheck()

    valueRange()

}

fun checkNumber(num : Int){
    when(num){
        in 0..10->{
            println("The number exist on interval [0,10]")
        }
        else->{
            println("The number doesn't exist on interval [0,10]")
        }
    }
}

fun enterValueToCheck(){
    println("Enter value : ")
    val cr = readLine()!!.toInt()

    checkNumber(cr)
}

fun valueRange(){
    val num1 = 0 until 10
    print(num1)

    println()

    val num2 = 10 downTo 0
    print(num2)
}