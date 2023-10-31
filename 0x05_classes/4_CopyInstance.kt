import kotlin.jvm.internal.FunctionReferenceImpl

data class Fruits(var id: Int, var quantity: Int, var name: String)

fun main() {
    val mango = Fruits(1, 2, "Apple")

    val copy = mango.copy()
    println(copy)
    println(mango.copy(id = 2, quantity = 4))
    println(mango.copy(id = 2, name = "Mango"))
}