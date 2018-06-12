package collection


fun main(args: Array<String>) {
    // Collection operators
    val numList = 1..20

    // Reduce
    val listSum = numList.reduce { acc, i -> acc + i }
    prnt("Reduce Sum: $listSum")

    // Fold
    val listSum2 = numList.fold(5) { acc, i -> acc + i }
    prnt("Fold Sum<init: 5>: $listSum2")

    // Any & All
    prnt("Even (Any of elements): ${numList.any { isEven(it) }}")
    prnt("Even (All of elements): ${numList.all { isEven(it) }}")

    // Filter
    val big5 = numList.filter { it > 5 }
    big5.forEach { prnt("$it > 5") }

    // Map
    val times7 = numList.map { it * 7 }
    times7.forEach { prnt("*7: ${it}") }
    times7.forEachIndexed { index, i -> prnt("${index.inc()} * 7 = $i") }
}

private fun isEven(it: Int) = it % 2 == 0

private fun prnt(message: Any) = println(message.toString())
