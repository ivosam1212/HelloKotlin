import kotlin.concurrent.fixedRateTimer

fun main() {
    for (i in 0 .. 5) println(i)
    for (i in 0 until 5) println(i)
    for (i in 10 downTo 0) println(i)
    for (i in 10 downTo 0 step 3) println(i)
}
