package functions

import java.util.*

fun helloWorld() {
    println("Hello World!")
}

// Kotlin -> K o t l i n
fun printWithSpaces(text: String) {
    for (char in text) {
        print(char + " ")
    }
    println()
}

fun getCurrentData(): Date {
    return Date()
}

fun max(a: Int, b: Int): Int {
    var max: Int
    if (a >= b) {
        max = a
    } else {
        max = b
    }
    return max
}

fun reverse(list: List<Int>): List<Int> {
    var result = arrayListOf<Int>()

    for (i in 0..list.size-1) {
        result.add(list[list.size-i-1])
    }

    return result
}

fun main(args: Array<String>) {
    var numbers = listOf(1, 2, 3, 6, 8, 9)
    println(reverse(numbers))

    helloWorld()
    printWithSpaces("Kotlin is awesome!")
    println(getCurrentData())
    println(max(16, 44))
}
