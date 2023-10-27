fun main() {
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    val isChecked = if (check) "Checked is True" else "Checked is False"
    println(isChecked)

    val a = 1
    val b = 2

    println(if (a > b) a else b) // Returns a value: 2
}