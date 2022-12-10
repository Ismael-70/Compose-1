package com.example.composertutorial.fondamantals

fun sayHello(greeting: String, itemToGreet:List<String>) {
    itemToGreet.forEach{itemToGreet->
        println("$greeting $itemToGreet")}
}

fun main(){
    val inters = listOf("Kotlin","Programming","Language")
    val inter = arrayOf("Kotlin","Programming","Language")
    sayHello("Hi",inters)
    //println(inter.size) //size of array
    //println(inter[0]) // access value in array
    //println(inter[1])
    /*val num = 0..5
    inter.forEach { inter->
        println(inter)
    }
    num.forEach { num->
        print(" $num ")
    }

    val map = mapOf(1 to "a", 2 to "b", 3 to "3")
    map.forEach{map->println(map )
    }*/
}