
fun main() {
    val stringList: List<String> = listOf("kotlin", "code", "puppy")
    val listOfInt = listOf(1, 2, 3, null)

    val doubledValues = List<Int>(5) { index ->
        2 * index
    }

    doubledValues.forEach { println(it) }

    val emptyStringList: List<String> = emptyList()

    val firstInt = listOfInt.get(0)
    val secondInt = listOfInt[1]

    println(firstInt)
    println(secondInt)

    val languages = mutableListOf("kotlin", "java")
    languages[0] = "Kotlin"
    languages.set(0, "Kotlin")
    languages.add("javascript")
    println(languages)
    languages.add(1, "c++")
    languages.remove("javascript")
    languages.removeAt(0)

    val aList: List<String> = mutableListOf("dog", "cat")
}
