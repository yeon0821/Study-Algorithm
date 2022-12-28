```
import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    repeat(3) {
        when(readLine().split(" ").count { it == "0" }) {
            0 -> println("E")
            1 -> println("A")
            2 -> println("B")
            3 -> println("C")
            4 -> println("D")
        }
    }
}
```