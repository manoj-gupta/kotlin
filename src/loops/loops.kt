package loops

fun main(args: Array<String>) {
    var sum = 0
    for (i in 1..10) {
        sum += i
    }
    println(sum)

    var list = listOf("C", "Golang", "Kotlin")
    for (element in list) {
        println(element)
    }

    for ((index, value) in list.withIndex()) {
        println("Element at $index is $value")
    }

    var x = 9
    while (x >= 0) {
        println(x)
        x--
    }

    //naming loops
    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i-j == 5) {
                break@outer
            }
            println("$i-$j")
        }
    }
}