fun safeCall(nullableString: String?): Int? {
    return nullableString?.length
}

fun safeCallMemberFun(){
    var nullString: String? = null
    println(nullString?.uppercase())
}

fun main() {
    var maybeText: String? = null
    println(safeCall(maybeText))

    maybeText = "Another option"
    println(safeCall(maybeText))

    safeCallMemberFun()
}