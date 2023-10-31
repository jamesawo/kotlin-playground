val listOfInts = listOf<Int>(-1, -2, -3, 1, 2, 3)
var positiveInts = listOfInts.filter { value -> value > 0 }
var negativeInts = listOfInts.filter { value -> value < 0 }

fun externalFunctionInLambdas() {
    // using function from other files in same directory
    val listOfNumbers = listOf(1, 2, 3, 4, 5, 6)

    val filterEvenNumber = listOfNumbers.filter { isDivisibleByTwo(it) }
    println("Even numbers are $filterEvenNumber")

}

fun passLambdaExample1() {
    println("Positive ints are : $positiveInts")
    println("Negative ints are : $negativeInts")
}

fun passLambdaExample2() {
    // let's take out the filter into a lambda function
    val positiveFilterExpr = { value: Int -> value > 0 }
    val negativeFilterExpr = { value: Int -> value < 0 }

    positiveInts = listOfInts.filter(positiveFilterExpr)
    negativeInts = listOfInts.filter(negativeFilterExpr)

    println("Example 2: Positive ints are : $positiveInts")
    println("Example 2: Negative ints are : $negativeInts")
}

fun passLambdaExample3() {
    // combining filter lambda
    val filterExpr = { value: Int, char: Char -> if (char == '<') value < 0 else value > 0 }

    val positiveInts = listOfInts.filter { filterExpr(it, '>') }
    val negativeInts = listOfInts.filter { filterExpr(it, '<') }

    println("Example 3: Positive ints are : $positiveInts")
    println("Example 3: Negative ints are : $negativeInts")
}

fun nameToUpperCase(name: String): String {
    return name.uppercase()
}

fun main() {

    println("Hi my name is " + nameToUpperCase("James"))
    // using lambda
    println("Hi my name is " + { name: String -> name.uppercase() }("James"))

    // assign lambda fun to variable
    val toUpperCase = { name: String -> name.uppercase() }("James")
    println("Hi my name is $toUpperCase")

    // passing lambda function to other functions
    externalFunctionInLambdas()
    passLambdaExample1()
    passLambdaExample2()
    passLambdaExample3()
}