package function


fun main(args: Array<String>) {
    // Higher order Functions

    val numList = 1..20

    val evenList = numList.filter { it % 2 == 0 }

    evenList.forEach { prnt(it) }

    // Return dynamically a created function
    val mul3 = makeMathFunc(3)
    prnt("5 * 3 = ${mul3(5)}")

    // Work on list
    val multiply2 = {num1: Int -> num1 * 2}

    val numList2 = arrayOf(1,2,3,4,5,6,7,8,9)

    mathOnList(numList2, multiply2)

}

private fun prnt(message: Any) = println(message.toString())

private fun makeMathFunc(num1: Int): (Int) -> Int = {num2 -> num1 * num2}

private fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int){
    numList.forEach { prnt("MathOnList<$it>: ${myFunc(it)}") }
}