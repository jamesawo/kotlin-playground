fun greetPerson(name: String = "James"){
    println("Hello $name")
}


fun buyGroceries(items: List<String> =  listOf("Rice", "Eggs")){
    println("\n Going to get groceries ...\n")
    items.forEach{item -> println("Bought $item") }
}


fun main() {
    // use default value
    greetPerson()

    // pass in a value
    greetPerson("John")

    buyGroceries(listOf("Fish", "Oil", "Bread", "Milk", "Cake", "Meat"))
}