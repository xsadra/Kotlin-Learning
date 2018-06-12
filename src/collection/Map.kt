package collection


fun main(args: Array<String>) {
    // MutableMap (Changable Map)
    var mutableMap = mutableMapOf<Int, Any?>()
    mutableMap[1] = "Sadra"
    mutableMap[2] = "28"
    mutableMap[3] = "Vienna"

    //var mutableMap2 = mutableMapOf(1 to "Sadra", 2 to 28, 3 to "Vienna")
    var mutableMap2: MutableMap<Int, Any?> = mutableMapOf(1 to "Sadra", 2 to 28, 3 to "Vienna")

    //var mutableMap3 = mutableMapOf(Pair(1,"Sadra"),Pair(2,28),Pair(3,"Vienna"))
    var mutableMap3 : MutableMap<Int, Any?> = mutableMapOf(Pair(1,"Sadra"),Pair(2,28),Pair(3,"Vienna"))

    prnt(mutableMap)
    prnt(mutableMap2)
    prnt(mutableMap3)

    var mapList: List<MutableMap<Int,Any?>> = listOf(mutableMap, mutableMap2, mutableMap3)

    mapList.forEach { prnt("Size: ${it.size}") }

    mapList.forEach { it.put(3, "Linz") }

    mapList.forEach { prnt(it) }

    mapList.forEach { it.remove(2) }

    mapList.forEach { prnt(it) }

    for ((key, value) in mutableMap){
        prnt("Key: $key, Value: $value")
    }

    mutableMap2.forEach { key, value -> prnt("Key: $key, Value: $value") }
}

private fun prnt(message: Any) = println(message.toString())
