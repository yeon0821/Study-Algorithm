import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val stack = Stack<Int>()
    val bw = System.out.bufferedWriter()

    repeat(n) {
        val command = br.readLine().split(" ")
        when (command[0].toInt()) {
            1 -> stack.push(command[1].toInt())
            2 -> bw.write("${if (stack.isEmpty()) -1 else stack.pop()}\n")
            3 -> bw.write("${stack.size}\n")
            4 -> bw.write("${if (stack.isEmpty()) 1 else 0}\n")
            5 -> bw.write("${if (stack.isEmpty()) -1 else stack.peek()}\n")
        }
    }
    bw.flush()
    bw.close()
}
