package com.example.composertutorial.exercises

import java.util.*

fun main() {
    // display sum of two numbers
    sumOfTwoNumbers()
}

fun sumOfTwoNumbers(){

    val reader = Scanner(System.`in`)

    println("Enter first number : ")
    val number1 = reader.nextDouble()

    println("Enter second number : ")
    val number2 = reader.nextDouble()

    val result: Int = addNumbers(number1, number2)
    println("result = $result")
}

fun addNumbers(num1: Double, num2: Double): Int {
    val sum = num1 + num2
    return sum.toInt()
}
