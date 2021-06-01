/********************************************************************
Selection Sort with Kotlin : https://www.instagram.com/p/CPazHTzjf9V/
 ********************************************************************/

fun selectionSort(sampleArray: IntArray){
    val n = sampleArray.size
    var temp: Int
    for(i in 0 until n-1){
        var indexOfMin = i
        for(j in n-1 downTo i){
            if(sampleArray[j] < sampleArray[indexOfMin])
                indexOfMin = j
        }
        if(i != indexOfMin){
            temp = sampleArray[i]
            sampleArray[i] = sampleArray[indexOfMin]
            sampleArray[indexOfMin] = temp
        }
    }
}

fun main() {
    println("Before Sort: ")
    val arraySort = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for(i in arraySort) print(i)
    selectionSort(arraySort)
    println("Number Sorted is: ")
    for(i in arraySort) print(i)
}