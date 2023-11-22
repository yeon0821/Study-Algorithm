fun main() {
    val (E, S, M) = readLine()!!.split(" ").map { it.toInt() }
    val result = calculateYear(E, S, M)
    println(result)
}

fun calculateYear(E: Int, S: Int, M: Int): Int {
    var e = 1
    var s = 1
    var m = 1
    var year = 1

    while (true) {
        if (e == E && s == S && m == M) {
            break
        }

        e = if (e <= 15) e + 1 else 1
        s = if (s <= 28) s + 1 else 1
        m = if (m <= 19) m + 1 else 1

        year++
    }

    return year
}
