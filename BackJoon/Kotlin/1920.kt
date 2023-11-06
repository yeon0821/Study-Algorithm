fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }.toSet()
    val m = readLine()!!.toInt()
    val targets = readLine()!!.split(" ").map { it.toInt() }

    for (target in targets) {
        if (a.contains(target)) {
            println(1)
        } else {
            println(0)
        }
    }
}
