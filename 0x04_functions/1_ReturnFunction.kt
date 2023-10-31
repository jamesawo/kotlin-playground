fun sum(x: Int, y: Int): Int {
    return x + y
}

fun isDivisibleByTwo(number: Int): Boolean {
    return number != 0 && number % 2 == 0
}


fun main() {
    //  sum two number and returns the value
    val x = 10
    val y = 10
    val sumValue = sum(x, y)
    println("$x + $y is : $sumValue")

    //checks if a number the sum value dividable by 2

    println("is $sumValue divisible by 2: " +isDivisibleByTwo(sumValue) )

}