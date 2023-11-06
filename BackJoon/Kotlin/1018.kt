import kotlin.math.min

fun main() {
    val (n, m) = readLine()!!.split(' ').map(String::toInt)
    val board = Array(n) { readLine()!! }

    var minCount = Int.MAX_VALUE

    for (i in 0..n - 8) {
        for (j in 0..m - 8) {
            var countW = 0
            var countB = 0
            for (x in i until i + 8) {
                for (y in j until j + 8) {
                    if ((x + y) % 2 == 0) {
                        if (board[x][y] != 'W') countW++
                        if (board[x][y] != 'B') countB++
                    } else {
                        if (board[x][y] != 'B') countW++
                        if (board[x][y] != 'W') countB++
                    }
                }
            }
            minCount = min(minCount, min(countW, countB))
        }
    }
    println(minCount)
}
