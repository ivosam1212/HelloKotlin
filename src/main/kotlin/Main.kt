package org.example

fun main() {
    val aChar: Char = 'a'
    val aNumericCHar = '1'
    val newLineChar = '\n'

 //   val concatOption1 = 'a' + 'b'

 //   val concatOption2 = 'ab'

    val aString: String = "Hello Kotlin!"
    val escaped = "Hello \n World"
    println(escaped)

    val raw = """
     >>Some
        multiline
     text
      >>is going on
    here
    """.trimMargin(marginPrefix = ">>")
    println(raw)

    val concatString = "Hello" + " Kotlin!"
    println(concatString)

    val concatNumber = "The number " + 10
    println(concatNumber)

    val aNumber = 10
    val concarTemplate = "The number ${1 + aNumber}"
    println(concarTemplate)

    val someString = "  "
    println(someString.isNotBlank())

    val anotherString = "Hello Kotlin World!"
    println(anotherString.contains("Kotlin"))
}
