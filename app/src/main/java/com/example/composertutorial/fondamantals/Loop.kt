package com.example.composertutorial.fondamantals

fun main(){

    //whileLoop()
    //whileLoop()
    //forLoop()
    //repeatLoop()

    println("Interval [0,10[ : ")
    forLoopUntil()

    println("Decrementation : ")
    forLoopDownTo()

}

fun whileLoop(){
    var n = 1
    while (n < 10) {
        n += 1 + (n + 1)
        println(n)
    }
}

fun doWhileLoop(){
    var n = 1
    do {
        n += 1 + (n + 1)
        println(n)
    }while (n < 10)
}

fun forLoop(){
    var num = 1
    for(i in 0..10){
        if (num < 10){
            num += 1+(num+1)
            println(num)
        }
    }
}

fun forLoopUntil(){
    for(i in 0 until 10){
        println(i)
    }
}

fun forLoopDownTo(){

    for(i in 10 downTo 0){
        println(i)
    }

}

fun repeatLoop(){
    var number = 1
    repeat(10){
        if (number < 10){
            number += 1+number+1
            println(number)
        }
    }
}