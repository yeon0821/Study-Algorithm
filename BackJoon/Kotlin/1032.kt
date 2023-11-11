fun main() {
    val n = readLine()!!.toInt()
    val fileNames = List(n) { readLine()!! }

    val pattern = StringBuilder()

    for (i in fileNames[0].indices) {
        val charSet = fileNames.map { it[i] }.toSet()

        if (charSet.size == 1) {
            pattern.append(charSet.first())
        } else {
            pattern.append("?")
        }
    }

    println(pattern.toString()
}
