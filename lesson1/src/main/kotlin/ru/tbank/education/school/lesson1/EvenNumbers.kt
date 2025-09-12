package ru.tbank.education.school.lesson1

fun main() {
    val numbers = arrayOf(1,2,3,4,5,6,7,8,9)
    print(sumEvenNumbers(numbers))
}


fun sumEvenNumbers(numbers: Array<Int>): Int {
    var n = 0
    for(i in numbers)
    {
        if(i%2==0)
        {
            n = n + i
        }
    }
    return n
}
