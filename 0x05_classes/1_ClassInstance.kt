class Contact(var id: Int, var email: String, var name: String) {

}

fun main() {
    // create an object from Contact class
    val contact = Contact(1, "example@example.com", "John Doe")

    // print the value of the property: email
    println("Email: ${contact.email}")

    println("Name: ${contact.name}")
    println("Id: ${contact.id}")

    contact.email = "updated@example.com"
    println("Updated Email: ${contact.email}")


}