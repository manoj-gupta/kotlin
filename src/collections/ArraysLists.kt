package collections

fun main(args: Array<String>) {
    // Arrays
    val array = arrayOf("Texas", "Iowa", "California")
    val mixed = arrayOf("Kotlin", 3.0, 1)
    println(mixed[0])
    val numbers = intArrayOf(1, 3, 3)

    // Lists
    val list = listOf("Orange", "Apple", "Bananas")
    println(list[1])

    // arrayList
    val arrayList = arrayListOf("John", "Doe", "Mike")
    arrayList.add("Ben")
}
