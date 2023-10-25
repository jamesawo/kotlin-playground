fun main() {
    immutableSetExample()
    mutableSetExample()
}

fun immutableSetExample() {
    // create a set
    val setOfThings = setOf("Book", "Pencil", "Board")
    val size = setOfThings.size
    println("size of set is $size")

    val contains = setOfThings.contains("Book")
    println("setOfThings contains book?: $contains")

    setOfThings.forEach{ println(it) }

}

fun mutableSetExample() {
    val listOfSongs = mutableSetOf("Cry Baby", "Happy Hour", "Jazz")

    // add item
    listOfSongs.add("Hello")

    // contains item
    listOfSongs.contains("Hello")

    val size = listOfSongs.size
    println(size)

    val firstSongWith = listOfSongs.firstOrNull{it.lowercase().contains("cry")}
    println("First song $firstSongWith")

}

