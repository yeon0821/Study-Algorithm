fun main() {
    while (true) {
        val input = readln()
        if (input == "0") break

        var width = 1
        for (n in input) {
            width += when (n) {
                '1' -> 2
                '0' -> 4
                else -> 3
            }
            width += 1
        }
        println(width)
    }
}
