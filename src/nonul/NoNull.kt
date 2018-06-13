package nonul

fun main(args: Array<String>) {
    // Null
    var nullVal: String? = null

    fun returnNull(): String?{
        return null
    }

    var nullVal2 = returnNull()

    if (nullVal2 != null) prnt("L: ${nullVal2.length}")

    //var nullVal3 = nullVal2!!.length

    var nullVal4: String = returnNull() ?: "No Name"

    prnt(nullVal4)
}

private fun prnt(message: Any?) = println(message.toString())