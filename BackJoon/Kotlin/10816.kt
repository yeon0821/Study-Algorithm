import java.util.*
 
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
 
    val num = br.readLine().toInt()
    val queue : Queue<Int> = LinkedList()
 
    for(i in 1 .. num) {
        queue.add(i)
    }
    while(queue.size != 1) {
        queue.poll()
        queue.add(queue.poll())
    }
 
    bw.write("${queue.poll()}")
    bw.flush()
    bw.close()
    br.close()
}
