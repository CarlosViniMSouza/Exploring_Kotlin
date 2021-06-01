/**************************************************
Data Structure with Kotlin (by: @kotlin_developers)
 ***********************************************/

data class Employee(
    val name: String = "Carlos",
    val lastname: String = "Souza",
    val telNumber: Int = 92992680331.toInt(),
    val address: String = "Manaus, Amazonas"
)

fun main(){
    println(Employee())
}