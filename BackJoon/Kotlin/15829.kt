
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


val br = BufferedReader(InputStreamReader(System.`in`))
fun main()=with(br){
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val N = readLine()!!.toInt()
    val str = readLine()
    var go = 0
    var expo = 1L
    var sum = 0L
    for(w in str) {
        if(go==0)
            expo=1L
        else
            expo=(expo*31)%1234567891
        sum=(sum+(w.toInt()-96)*expo)%1234567891
        go++
    }
    bw.write("${sum%1234567891}")
    bw.flush()
    bw.close()
}
