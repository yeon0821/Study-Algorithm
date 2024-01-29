import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer
 
fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    repeat(readLine().toInt()) {
        val queue: Queue<IntArray> = LinkedList()
        val (n, m) = readLine().split(' ').map { it.toInt() }
        val st = StringTokenizer(readLine())
        repeat(n) {
            queue.add(intArrayOf(it, st.nextToken().toInt()))
        }
        var print = 0	// 인쇄를 한 횟수
        while (true) {
            // 큐에서 첫문서의 중요도가 큐에 있는 문서들의 최대 중요도와 동일하면 인쇄
            if (queue.peek()[1] == queue.maxOf { it[1] }) {
                print++
                if (queue.poll()[0] == m) break	// m번째 문서를 인쇄하면 반복 종료
            } else {
                queue.add(queue.poll())
            }
        }
        bw.write("$print\n")
    }
    bw.close()
}
