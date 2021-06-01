/*
    The arguments passed from the console can be received in the Kotlin program and it can be used as an input. You
can pass N (1 2 3 and so on) numbers of arguments from the command prompt.

    A simple example of a command-line argument in Kotlin.
 */

fun main(){
    println("Input 2 numbers Int: ")
    var (a, b) = readLine()!!.split(',')

    println("The max number is: ${maxOf(a.toInt(), b.toInt())}, " +
            "\nand The min number is: ${minOf(a.toInt(), b.toInt())}")
}