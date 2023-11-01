fun main() {
    var neverNull: String  = "This string will never be null"

    // throw compile error
    // neverNull = null

    var nullableString: String? = "This string can be null at some point"

    // no error here
    nullableString = null

    // by default null values are not accepted
    var inferredNonNull = "The compiler assumes non-nullable"

    fun strLength(value: String): Int {
        return value.length
    }

    println(strLength(inferredNonNull))
    println(nullableString)



}