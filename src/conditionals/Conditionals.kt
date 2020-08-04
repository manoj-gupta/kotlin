package conditionals

fun main(args: Array<String>) {
    val mode: Int = 5

    when (mode) {
        1 -> println("Mode is 1")
        2 -> {
            println("Mode is 2")
            println("Second line of mode 2")
        }
        3 -> println("Mode is 3")
        else -> println("Unknown mode " + mode)
    }
}