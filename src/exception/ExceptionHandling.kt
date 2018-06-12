package exception

fun main(args: Array<String>) {
    // Exception Handling

    var divisor = 2
    try {
        if (divisor != 0){
            prnt("5 / $divisor = ${5/divisor}")
            return
        }
        throw IllegalArgumentException("Can't Divide by Zero")
    }catch (e: IllegalArgumentException){
        prnt(e.message.toString())
    }
}

private fun prnt(message: Any) = println(message.toString())
