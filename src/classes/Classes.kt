package classes


fun main(args: Array<String>) {
    // Classes

    val bowser = Animal("Bowser", 20.0, 12.5)

    bowser.getInfo()
}

private fun prnt(message: Any?) = println(message.toString())

open class Animal(val name:String,
                  var height:Double,
                  var weight:Double){
    init {
        val regex = Regex(".*\\d+.*")

        require(!name.matches(regex)){"Animal name Can't contain Numbers"}

        require(height > 0){"Height must be Greater than 0"}

        require(weight > 0){"Weight must be Greater than 0"}
    }

    open fun getInfo(): Unit{
        prnt("$name is $height tall and weight $weight")
    }
}