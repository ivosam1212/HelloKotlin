import java.io.File
import kotlin.io.path.writeLines

fun main() {
    print("Enter the name of the file: ")
    val fileName = readLine()

    if (fileName.isNullOrEmpty()) {
        println("Not a valid filename")
        return
    }

    val scores = File(fileName)
    if (!scores.isFile) return

    val rawScores = scores.readLines()

    val parsedScores = rawScores.map { line ->
        val elements = line.split(":")
        elements[0] to elements[1]
    }

    val finalScores = parsedScores.sortedByDescending { it.second }
        .take(3)

    val outputPath = File("sorted.txt").toPath()
    val outputScores = finalScores.map {
        "${it.first}:${it.second}"
    }

    outputPath.writeLines(outputScores)

/*    val scores = File(fileName).readLines()
        .map { line ->
            val parts = line.split(":")
            Pair(parts[0], parts[1].toInt())
        }

    val sortedScores =  scores.sortedByDescending { part -> part.second }
        .take(3)

    val formatScores = sortedScores.map { (id, score) -> "$id:$score" }
    val outputFile = File("sorted-scores.txt").toPath()
    outputFile.writeLines(sortedScores)*/
}
