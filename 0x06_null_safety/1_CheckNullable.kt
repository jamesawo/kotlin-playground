fun checkNullable(text: String?){
    //!text.isNullOrEmpty()
    if (text != null && text.length > 0){
        println("The text is `$text` and length is ${text.length}")
    } else {
        println("Null or Empty Text Provided")
    }
}

fun main() {
    var text: String? = null
    checkNullable(text)

    text = "this is not an empty text"
    checkNullable(text)

}