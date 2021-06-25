import java.util.*

/*
Generic arrays in Kotlin are represented by Array<T>.
To create an empty array, use emptyArray<T>() factory function:
val empty = emptyArray<String>()
To create an array with given size and initial values, use the constructor:
 */

var strings = Array<String>(size = 5, init = { index -> "Item #$index" })

print(Arrays.toString(a))
print(a.size)

strings.set(2, "ChangedItem")
print(strings.get(2))

// You can use subscription as well:
strings[2] = "ChangedItem"
print(strings[2]) // prints "ChangedItem"