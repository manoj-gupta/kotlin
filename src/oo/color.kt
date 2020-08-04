package oo

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);

    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }
}

fun main(args: Array<String>) {
    println(Color.RED)
    println(Color.GREEN)
    println(Color.BLUE)
    println(Color.YELLOW)

    println(0b1010 )
    println(Color.RED.containsRed())
    println(Color.YELLOW.containsRed())

    //bitwise operators
    println(0b1101 or 0b1000)
}