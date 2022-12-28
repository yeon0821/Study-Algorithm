import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    var max = 0
    var idx = 0

    repeat(5) {
        val result = readLine().split(" ").map { score -> score.toInt() }.sum()
        if (max < result) {
            max = result
            idx = it + 1
        }
    }
    
    println("$idx $max")
}