package com.example.kotlin_algorithms_data_structures.constants

const val CONNECTION_POOL = 10

class DBDriver{
    companion object{
        fun isConnectionExceeded(value: Int): Boolean{
            return (value > CONNECTION_POOL)
        }
    }
}

fun main() {
    println(DBDriver.isConnectionExceeded(11));
}