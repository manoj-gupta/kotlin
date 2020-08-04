package lamda

// *** Lambda functions examples **

//max(strings, { a, b -> a.length < b.length })

// with type annotation in lambda expression
val sum1 = { a: Int, b: Int -> a + b }

// without type annotation in lambda expression
val sum2:(Int,Int)-> Int  = { a, b -> a + b }

// Lambda as class extension
val lambdaCE : String.(Int) -> String = { this + it }

// *** Anonymous functions examples **

// anonymous function with body as an expression
val anonymous1 = fun(x: Int, y: Int): Int = x + y

// anonymous function with body as a block
val anonymous2 = fun(a: Int, b: Int): Int {
    val mul = a * b
    return mul
}

// return String value by lambda function
val find = fun(num: Int): String {
    var str: String
    if (num % 2==0 && num < 0) {
        str = "Number is even and negative"
    }  else if (num %2 ==0 && num >0) {
        str = "Number is even and positive"
    } else if(num %2 !=0 && num < 0) {
        str = "Number is odd and negative"
    } else {
        str = "Number is odd and positive"
    }

    return str
}

fun main(args: Array<String>) {
    val company = { println("Hello Kotlin")}

    // invoking function method1
    company()

    // invoking function method2
    company.invoke()

    val result1 = sum1(2,3)
    val result2 = sum2(3,4)
    println("The sum of two numbers is: $result1")
    println("The sum of two numbers is: $result2")
    // directly print the return value of lambda
    // without storing in a variable.
    println(sum1(5,7))

    val result = "My Class".lambdaCE(50)
    print(result+"\n")

    // it: implicit name of a single parameter
    val numbers = arrayOf(1,-2,3,-4,5)
    println(numbers.filter {  it > 0 })

    // longhand form of lambda function
    println(numbers.filter {item -> item > 0 })

    val ret = find(112)
    println(ret)

    //invoking anonymous functions
    val sum = anonymous1(3,5)
    val mul = anonymous2(3,5)
    println("The sum of two numbers is: $sum")
    println("The multiply of two numbers is: $mul")
}