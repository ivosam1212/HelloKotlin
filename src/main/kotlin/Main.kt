

// write a function that satisfies the following requirements

// function takes 2 strings for first and last name
// function takes a formatting function parameter
// function should print the result of the passed format function

fun printFormattedName(firstName: String, lastName: String, formatter: (String, String) -> String) {
    println(formatter(firstName, lastName))
}

val basicFormatter: (String, String) -> String = { firstName, lastName ->
    "$firstName $lastName"
}

val fancyFormatter: (String, String) -> String = { firstName, lastName ->
    "First name is: $firstName, and last name is: $lastName"
}

fun main() {
    printFormattedName("Ivo", "Sam", basicFormatter)
    printFormattedName("Ivo", "Sam", fancyFormatter)

    printFormattedName("Ivo", "Sam") { firstName, lastName ->
        "$lastName, $firstName"
    }
}
