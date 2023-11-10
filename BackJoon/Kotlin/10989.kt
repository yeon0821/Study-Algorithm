import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val arr = IntArray(n)

    repeat(n) {
        arr[it] = br.readLine().toInt()
    }

    arr.sort()

    for (i in 0 until n) {
        bw.write("${arr[i]}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}
