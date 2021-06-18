/*Section 3.1: String Equality
        In Kotlin strings are compared with == operator which check for their structural equality.
*/

fun chapter3Part1(){

        var word1 = "Hello, World!"
        var word2: String = "Hello," + " World!"

        println(word1 == word2) // Prints true

        //Referential equality is checked with === operator.

        word1 = """
        |Hello, World!
        """.trimMargin()

        word2 = """
        #Hello, World!
        """.trimMargin("#")

        val str3 = word1
        println(word1 == word2) // Prints true
        println(word1 === word2) // Prints false
        println(word1 === word2) // Prints true
}

fun chapter3Part2(){
/*
        Section 3.2: String Literals
        Kotlin has two types of string literals:
        Escaped string
                Raw string
                Escaped string handles special characters by escaping them. Escaping is done with a backslash. The following
                escape sequences are supported: \t, \b, \n, \r, \', \", \\ and \$. To encode any other character, use the Unicode
        escape sequence syntax: \uFF00.

 */
        val s = "Hello, world!\n"

        val text = /* i don't know how to fix these errors! */
                """
                for (c in "foo")
                print(c)
                """

        // Leading whitespace can be removed with trimMargin() function.

        val text = /* i don't know how to fix these errors! */
                """
                |Tell me and I forget.
                |Teach me and I remember.
                |Involve me and I learn.
                |(Benjamin Franklin).
                |""".trimMargin()

        //
}

fun main(){
        chapter3Part1()
        chapter3Part2()
}
