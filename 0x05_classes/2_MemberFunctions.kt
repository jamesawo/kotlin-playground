class Person(var id: Int, var name: String, var age: Int){

    private fun askAge(): String {
        return "I am $age years old"
    }

    fun salute(){
        println("Hello my name is $name and ${askAge()}")
    }
}

fun main() {
    val person = Person(1, "John Doe", 23)
    person.salute()
}