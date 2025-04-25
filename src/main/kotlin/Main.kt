
fun main() {
    testScores.toList()
        .sortedBy { it.second }
        .map { it.first }
        .take(3)
        .forEach { println(it)}
}

/* Another solution
Convert map to a list of pairs
    val scoresList = testScores.toList()

Sort by score (second element in each pair)
    val lowerScores = scoresList.sortedBy { it.second }
        .take(3)
        .forEach { println(it.first) }  // Print just the ID
 */