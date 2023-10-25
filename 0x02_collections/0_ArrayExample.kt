fun main() {
    val interestingThings = arrayOf("Name", "spoon", "cars")

    println("the size of the array is ${interestingThings.size}")
    println("the item in 0 position is ${interestingThings.get(0)}")
    println("the item in 2 position is ${interestingThings[2]}")
    println("calling toString on interestingThings: ${interestingThings.toString()}")

    // iterating using for
    for (interestingThing in interestingThings){
        println(interestingThing)
    }

    // using forEach on interestingThings
    interestingThings.forEach { printItemInArray(item = it) }
}

fun printItemInArray(item: String, something: String = "Optional") = println("The item passed is $item")

