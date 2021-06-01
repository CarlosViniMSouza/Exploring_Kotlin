fun main(){
    val year = 2020
    var leap: Boolean
    if(year % 4 == 0){
        if(year % 100 == 0){
            leap = year % 400 == 0
        } else
            leap = true
    } else
        leap = false

    if(leap){
        println("$year is a leap year")
    } else
        println("$year isn't a leap year")
}