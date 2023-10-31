// a function that returns a lambda function
fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { num: Int -> num * 60 * 60 }
    "minute" -> { num: Int -> num * 60 }
    "second" -> { num: Int -> num }
    else -> { num: Int -> num }
}

fun main() {
    val timesInMinutes = listOf(2, 4, 8, 10)
    val minuteToSeconds = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(minuteToSeconds).sum()
    println("Total time in seconds is $totalTimeInSeconds")
}