package collection


fun main(args: Array<String>) {
    // MutableList (Changable List)
    var mutableList: MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8)

    // ImutableList (Unchangable List)
    var immutableList: List<Int> = listOf(1,2,3,4,5,6,7,8)

    mutableList.add(9)

    mutableList.addAll(listOf(10,11,12,13,14,15))

    prnt("1st: ${mutableList.first()}")
    prnt("2nd: ${mutableList[1]}")
    prnt("Last: ${mutableList.last()}")

    var newSubList = mutableList.subList(0,3)

    prnt(newSubList)
    prnt(mutableList)

    prnt("Length: ${mutableList.size}")

    /**
     * When we Clear Sub List
     * we also Delete Original element in Base List
    */
    newSubList.clear()

    mutableList.remove(5)
    mutableList.removeAt(5)

    prnt(mutableList)

    mutableList.forEach { prnt("Mutable List Item: $it") }

    immutableList.map { it.inc() }.forEach { prnt("inc: $it") }
}

private fun prnt(message: Any) = println(message.toString())
