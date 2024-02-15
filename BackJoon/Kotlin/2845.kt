fun main() {
    val (L, P) = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }

    val num = L * P
    val list = a.map { it - num }

    println(list.joinToString(" "))
}
