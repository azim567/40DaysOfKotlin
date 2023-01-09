fun main() {
    val addition1: (a: Int, b: Int) -> Unit = { a, b ->
        println(a + b)
    }
    operation(4, 2, showMessage = { message -> println(message) }, sum = { a, b -> println(a + b) })
}

//normal function
fun addition(a: Int, b: Int) {
    println(a + b)
}

fun operation(a: Int, b: Int, showMessage: (msg: String) -> Unit, sum: (a: Int, b: Int) -> Unit) {
    if (a > b) {
        showMessage("a greater than b")
    } else {
        sum(a, b)
    }
}
