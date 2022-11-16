package com.example.kotlin_algorithms_data_structures.constants


class Car(private val name: String){
    /**
     * This is a constant that is only used
     * inside this class
     */
    private val numberOfWheels = 4
    /**
     * The companion object defines a constant
     * that exists only as a single copy and
     * Can also be used outside the class
     */
    companion object{
        const val NUMBER_OF_WHEELS = 4
    }
    fun showMessage(): String{
        return "A ${this.name} has ${this.numberOfWheels} wheels"
    }

}
fun main() {
    val nissan = Car("Nissan");
    println(nissan.showMessage());
    println("Number of wheels = ${Car.NUMBER_OF_WHEELS}");
}