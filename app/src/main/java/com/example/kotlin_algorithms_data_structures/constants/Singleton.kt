package com.example.kotlin_algorithms_data_structures.constants

object Configuration{
    const val USERNAME = "john"
    const val PASSWORD = "1234"
}

fun userLogin(user: String, pass: String): String{
    return "$user logged in with password $pass"
}

fun main() {
    println(userLogin(Configuration.USERNAME,
        Configuration.PASSWORD));
}