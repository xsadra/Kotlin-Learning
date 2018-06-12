package function


fun main(args: Array<String>) {
    prnt("SUM(1,2,3,4,5)= ${getSum(1,2,3,4,5)}")

    // literals Functions
    val  multiply = {num1: Int, num2: Int -> num1 * num2}
    prnt("3 * 4= ${multiply(3,4)}")

    // Factorial with tail recursion
    prnt("5! = ${fact(5)}")

}

private fun prnt(message: Any) = println(message.toString())

private fun getSum(vararg numbers: Int):Int{
    var sum = 0
    //numbers.forEach { num -> sum += num }
    numbers.forEach { sum+=it }
    return sum
}

private fun fact(x: Int): Int{
    tailrec fun factTail(y:Int, z: Int): Int{
        if (y == 0) return z
        return factTail(y - 1,y * z)
    }
    return factTail(x,1)
}


