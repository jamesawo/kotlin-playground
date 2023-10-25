fun main() {
    mutableListExample()
    immutableListExample()
}

fun immutableListExample() {
    val listOfNames = listOf("John", "Jones", "Lulu")

    // to get index use indices property of list
    println("--iterate using for loop--")
    for (index in listOfNames.indices) {
        println("Index $index: ${listOfNames[index]}")
    }

    // get item from list
    val itemAtPosition0 = listOfNames.get(0)
    val itemAtPosition1 = listOfNames[1]

}

fun mutableListExample() {
    val listOfFruits = mutableListOf<String>("orange", "grape", "apple")
    // add item
    listOfFruits.add("banana")
    println(listOfFruits)

    listOfFruits.get(2);

    listOfFruits[2] = "guava"
    println(listOfFruits)

    // iterate the listOfFruits
    println("Iterate without index")
    listOfFruits.forEach { fruit -> println(fruit) }

    println("Iterate with index")
    listOfFruits.forEachIndexed { fruit, index -> println("Fruit at position $index is $fruit") }

}

