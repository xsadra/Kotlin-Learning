package function


fun main(args: Array<String>) {
    prnt("5 + 4 = "+add(5,4))
    prnt("5 - 4 = "+ subtract(5,4))
    // Change Parameters place
    prnt("5 - 4 = "+ subtract(num2 = 5,num1 = 4))

    sayHello("Sadra")
    // Default Value
    sayHello2()
    sayHello2("Nia")

    // Return two Values
    val (addVal, subVal) = withTwoValue(5,4)
    prnt("5 + 4 = $addVal, 5 - 4 = $subVal")
}

private fun prnt(message: Any) = println(message.toString())

private  fun add(num1: Int, num2: Int) : Int = num1 + num2

private  fun subtract(num1: Int, num2: Int) : Int = num1 - num2

private fun sayHello(name: String) : Unit = prnt("Hello, $name")

private fun sayHello2(name: String = "Sadra") : Unit = prnt("Hello, $name")

private fun withTwoValue(num1: Int, num2: Int) : Pair<Int, Int>{
    return Pair(
            add(num1,num2),
            subtract(num1,num2)
    )
}


