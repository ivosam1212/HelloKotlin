
fun checkType(input: Any?) {
/*    if (input is String) {
        if (input == null) {
            println("Input was a null String")
        } else {
            println("Input is a String with a length ${input.length}")
        }
    }

    if (input !is Int) {
        println("Input is not an Int")
    }

    if (input is Int) {
        println("Input is an Int")
    }*/
    when (input) {
        null -> println("Input was null")
        is String -> println("Input was a String of length ${input.length}")
    }

}

fun main() {
    val aGenericVariable: Any = "A String"

    checkType(aGenericVariable)
}
