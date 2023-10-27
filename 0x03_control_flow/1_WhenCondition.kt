fun main() {
    val greeting = "Hello"

    val result = when (greeting) {
        // If greeting equals "1", sets result to "one"
        "1" -> "One"
        // If greetings equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result)

    // Greeting

    temperature()
}

fun temperature(){
    val temp = 18

    val description = when {
        // If temp < 0 is true, sets description to "very cold"
        temp < 0 -> "very cold"
        // If temp < 10 is true, sets description to "a bit cold"
        temp < 10 -> "a bit cold"
        // If temp < 20 is true, sets description to "warm"
        temp < 20 -> "warm"
        // Sets description to "hot" if no previous condition is satisfied
        else -> "hot"
    }

    println(description)
    // warm
}