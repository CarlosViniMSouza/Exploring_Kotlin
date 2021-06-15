/*
1. The Unit return type declaration is optional for functions. The following codes are equivalent.
 */

fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello $name")
}

/*
2. Single-Expression functions:When a function returns a single expression, the curly braces can be omitted and the
body is specified after = symbol
 */

fun double(x: Int): Int = x * 2

// Let's go to see the Outputs:

fun main(){
    printHello("Carlos")

    println("The return function double is:")
    double(10)
}

// I'm going to stop the book project for now to see a mini-course on YouTube