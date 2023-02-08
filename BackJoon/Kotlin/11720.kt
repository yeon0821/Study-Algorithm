import java.util.*
fun main(){
    val sc = Scanner(System.`in`)
    val N  = sc.nextInt()
    val a = sc.next()
    var sum = 0

    for(i in 0 until N){
        sum += a[i] - '0'
    }
    println(sum)
}
Footer
