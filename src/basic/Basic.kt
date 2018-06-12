package basic

import java.util.Random

fun main(args: Array<String>) {
    sample01()
    sample02()
    sample03()
    sample04()
    sample05()
    sample06()
    sample07()
    sample08()
}

fun sample08(){
    prnt("\n\t\t\t{Loops}\n")

    for (x in 1..10){
        prnt("Loop: $x")
    }

    val rand = Random()
    val magicNum = rand.nextInt(50)+1
    var guess = 0
    while (magicNum != guess){
        guess+=1
    }
    prnt("Magic Number was ($guess)")

    for (x in 1..20 ){
        if (x % 2 == 0) continue

        prnt("Odd {$x}")

        if (x == 15) break
    }

    var arr: Array<Int> = arrayOf(3,6,9)

    for (i in arr.indices){
        prnt("Mult 3 : ${arr[i]}")
        prnt("-3 * ${i+1} = ${arr[i]}")
    }

for ((index,value) in arr.withIndex()){
    prnt("Index: ${index}, Value: ${value}")
}

}
fun sample07(){
    prnt(message = "\n\t\t\t{Conditional}\n")

    val age = 8

    if (age < 5) prnt("Case 1")
    else if (age == 5) prnt("Case 2")
    else if (age > 5) {
        prnt("Case 3: ${age - 5}")
    }
    else prnt("Case 4")

    when(age){
        0,1,2,3,4 -> prnt("Case 1")
        5-> prnt("Case 2")
        in 6..20-> prnt("Case 3: ${age - 5}")
        else -> prnt("Case 4")
    }

}
fun sample06(){
    prnt("\n\t\t\t{Ranges}\n")

    val oneTo10 = 1..10

    val alphA = "A".."Z"
    val alpha = "a".."z"

    prnt("R in alphA: ${"R" in alphA}")
    prnt("R in alpha: ${"R" in alpha}")

    val tenTo1 = 10.downTo(1)
    val towTo20 = 2.rangeTo(20)

    prnt(towTo20.count())

    val rng3 = oneTo10.step(3)

    for (x in rng3) prnt("Range 3: $x")

    for (x in tenTo1.reversed()) prnt("Reversed: $x")
}
fun sample05(){
    prnt("Arrays")

    var arr = arrayOf(1, 1.2,"Sadra",'M',1L)
    prnt(arr[2])
    arr[1] = 3.22
    prnt(message = "Array Lenght ${arr.size}")
    prnt("Sadra in Array: ${arr.contains("Sadra")}")

    var partArr = arr.copyOfRange(0,1)

    prnt("First: ${partArr.first()}")
    prnt("Sadra Index: ${arr.indexOf("Sadra")}")

    var sqArr = Array(5000,{x -> x * x})
    prnt(sqFun(sqArr,220))

    var arr2: Array<Int>  = arrayOf(1,2,3,4,5,6,7,8,9,0)
    prnt(arr2.reversedArray())
}
private fun sqFun(sqArr: Array<Int>, i: Int): Int = sqArr[i]
fun sample04(){
    prnt("String")

    val name ="Sadra M"
    val longStr ="""Sadra is
        the best!"""
    var fName: String="Sadra"
    var lName: String="M"

    fName = "Mia"
    var fullName = fName + " " + lName
    prnt(fullName)

    prnt("1 + 2 = ${1+2}")
    prnt("String Lenght:  ${longStr}")
    var str1 = "A is first Letter"
    var str2 = "a is first Letter"
    prnt("String Equal ${str1.equals(str2)}")
    prnt("Compare A to B ${"A".compareTo("B")}")

    prnt("2nd Index: ${name.get(2)}")
    prnt("2nd Index: ${name[2]}")

    prnt("Index 2 - 7: ${longStr.subSequence(2, 8)}")

    prnt("Contains random: ${longStr.contains("best")}")

}
fun sample03(){
    prnt("Type casting")

    prnt("3.14 to Int: " + 3.14.toInt())
    prnt("A to Int: " + 'A'.toInt())
    prnt("65 to Char: " + 65.toChar())
}
fun sample02(){
    prnt("check variabe Type")

    var letter: Char = 'A'
    println("A is Char: ${letter is Char}")
}
fun sample01(){
    println(message = "Hi, This is Sadra!\n")

    val name = "Sadra"
    var age = 28

    var bigInt: Int = Int.MAX_VALUE
    var big: String = Int.MAX_VALUE.toString()

    println("Name: $name \nAge: $age")
    println("Biggest Int: $bigInt")
    println("Biggest Int: $big")

    //TODO("Add new fun Here")
}
private fun prnt(message: Any) = println(message.toString())