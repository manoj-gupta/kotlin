package oo

class Person(val name: String, var age: Int) {
    init {
        println("Object was created")
    }

    fun speak() {
        println("Hello $name!")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

//    fun getYearOfBirth(): Int {
//        return 2020 - age
//    }
    fun getYearOfBirth() = 2020 - age
}


fun main(args: Array<String>) {
    val person = Person( name = "Jack", age = 17)
    println(person.name)
    println(person.age)
    person.speak()
    person.greet(name = "Ron")
    println(person.getYearOfBirth())
}