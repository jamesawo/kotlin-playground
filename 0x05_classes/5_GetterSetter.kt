class Person(
    var id: Int,
    var personLastName: String,
    var personEmail: String,
    ) {

    var personFirstName: String? = null
        get() {
            println("trying to get this person firstname")
            return field?:"DefaultNameInGetter"
        }
        set(value) {
            println("trying to set this person firstname")
            field = value?.uppercase()
        }

    override fun toString(): String {
        return "[Person: " +
                "Id: ${this.id}, " +
                "FirstName -> ${this.personFirstName}, " +
                "LastName -> ${this.personLastName}, " +
                "Email -> ${this.personEmail}" +
                "]"
    }
}

fun main() {
    val person = Person(1, "Abel", "abel@example.com")
    // person.personFirstName = "Gilbert"
    person.personFirstName = null
    // var id = person.id
    // var lastname = person.personLastName
    // var firstname = person.personFirstName
    // var email = person.personEmail


    println(person)
    println(person.personFirstName)

    // println(id).also { println(lastname) }.also { println(firstname) }.also { println(email) }

    // email = "new@example.com"
    // println(email)
}