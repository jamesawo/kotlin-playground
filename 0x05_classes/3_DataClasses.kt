data class User(var id: Int, var name: String)

fun compareInstances(){
    val user1 = User(1, "John")
    val user2 = User(1, "John")
    val user3 = User(1, "Max")

    println("User 1 equals to User 2: ${user1 == user2}")
    println("User 2 equals to User 3: ${user2 == user3}")


}

fun main() {
    val user = User(1, "John Doe")

    // Automatically uses toString() function so that output is easy to read
    println(user)

    compareInstances()
}