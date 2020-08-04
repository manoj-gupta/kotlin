package challenges

import java.time.Year
import java.util.*

fun main(args: Array<String>) {
    challenge1()
    challenge2()
    challenge3()
    challenge4()
}

fun challenge1() {
    val random = Random().nextInt(50) + 1

    when (random) {
        in 1..10 -> println("In between 1 to 10: $random")
        in 11..20 -> println("In between 11 to 20: $random")
        in 21..30 -> println("In between 21 to 30: $random")
        in 31..40 -> println("In between 31 to 40: $random")
        else -> println("In between more than 40: $random")
    }
}

fun challenge2() {
    var sum = 0L
    for (i in 100..100000L) {
        sum += i
    }
    println(sum)
}

fun challenge3() {
    val books = arrayListOf("Danger", "Washington", "Remains", "Only")

    for (book in books) {
        if (book.contains('e')) {
            for (character in book) {
                println(character)
            }
        }
        println()
    }
}


class Book(val title: String, val author: String, val publicationYear: Int, var borrowed: Boolean) {
    init {
        println("Book Created")
    }

    fun borrowBook(): Boolean {
        if (borrowed) {
            println("Error: The book is already borrowed")
            return false
        }

        borrowed = true
        return true
    }

    fun returnBook(): Boolean {
        if (!borrowed) {
            println("Error: The book was not borrowed")
            return false
        }

        borrowed = false
        return true
    }

    fun print() {
        println("Book [title=$title, author=$author, publicationYear=$publicationYear]")
    }
}

fun challenge4() {
    val book = Book("Manoj", "Home", 2020, false)
    book.returnBook()   // Does not work because we did not borrow it yet.
    book.borrowBook()       // Let's borrow it.
    book.borrowBook()       // We cannot borrow again without returning.
    book.returnBook()   // Let's return it.
    book.print()        // And print it out.
}
