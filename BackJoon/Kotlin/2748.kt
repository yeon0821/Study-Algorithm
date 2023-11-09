import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    val fibo = LongArray(91)
    fibo[0] = 0
    fibo[1] = 1

    for (i in 2..n){
        fibo[i] = fibo[ i - 1] + fibo[i - 2]
    }

    print(fibo[n])
}
