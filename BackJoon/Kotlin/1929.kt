fun sieveOfEratosthenes(m: Int, n: Int) {
    val isPrime = BooleanArray(n + 1) { true }
    isPrime[0] = false
    isPrime[1] = false

    for (i in 2..n) {
        if (isPrime[i]) {
            for (j in i * 2..n step i) {
                isPrime[j] = false
            }
        }
    }

    for (i in m..n) {
        if (isPrime[i]) {
            println(i)
        }
    }
}

fun main() {
    val (m, n) = readLine()!!.split(" ").map { it.toInt() }
    sieveOfEratosthenes(m, n)
}
