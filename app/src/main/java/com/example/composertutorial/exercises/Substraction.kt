package com.example.composertutorial.exercises

fun main() {
    println("Enter first number : ")
    val number1 = readln().toInt()

    println("Enter second number : ")
    val number2 = readln().toInt()

    val result: Int = subNumbers(number1, number2)
    println("result = $result")


}

fun subNumbers(num1: Int, num2: Int): Int {
    val sub = num1 - num2
    return sub.toInt()
}
