fun main() {
    immutableMapExample()
    mutableMapExample()
}

fun immutableMapExample() {
    val mapOfThings = mapOf("one" to 1, "two" to 2)
    val isContain = mapOfThings.containsKey("one")

    // get value
    val itemTwo = mapOfThings.get("two")
    val itemOne = mapOfThings["one"]

    // iterate
    mapOfThings.forEach{ (key, value) -> println("Key: $key, Value: $value") }

    // iterate the keys
    mapOfThings.keys.forEach{ println(it) }
    mapOfThings.keys.forEach{ println(it) }
}

fun mutableMapExample() {
    val menu = mutableMapOf("Smoked Rice" to 30, "Fried Fish" to 5, "Spaghetti Sauce" to 20)

    // add item
    menu["Fried Chicken"] = 12
    menu.put("Egg rolls", 9)

    // remove
    menu.remove("Smoked Rice")

    println("Menu is $menu")
    //
    menu.clear()

    println("removing all items")
    println(menu)

}

