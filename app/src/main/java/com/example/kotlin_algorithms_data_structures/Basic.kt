package com.example.kotlin_algorithms_data_structures

fun main() {
    val array = arrayOf("Kotlin", "Java", "C", "Typescript")
    println(array[1])

    val readOnlyList = listOf<String>("Java", "Kotlin", "Nodejs", "Nest")
    println("Readonly: $readOnlyList")


}