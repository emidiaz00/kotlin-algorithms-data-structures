package com.example.kotlin_algorithms_data_structures

fun main() {

    /*
    * Given two numbers should return how many odd numbers there are between them
    */
    /*
    - The Function receive two parameters
    - Loop of number1 to number2
    - Condition if rest is different to zero, is odd
    - Add the counter in 1
    *  */
    fun add(number1: Int, number2: Int): String {
        var counter = 0
        for (i in number1 until number2) {
            if (i % 2 !== 0) {
                println(i)
                counter+=1
            }
        }
        return "Exist ${counter} numbers odd"
    }
    println(add(2,8))
}