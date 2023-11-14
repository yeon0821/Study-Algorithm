import java.math.BigInteger
import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)){
    repeat(3) {
        var result = BigInteger.ZERO

        repeat(nextInt()) {
            result += nextBigInteger()
        }

        println(
            when {
                result < BigInteger.ZERO -> "-"
                result > BigInteger.ZERO -> "+"
                else -> "0"
            }
        )
    }
}
