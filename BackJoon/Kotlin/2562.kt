```kotlin
import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)

    var idx = 0
    var max = 0

    repeat(9){
        val num = readLine()?.toInt();
        if (max < num!!){
            idx = it + 1
            max = num
        }
    }

    println(max)
    println(idx)

}
```