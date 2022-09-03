```kotlin
import java.util.Scanner
fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)

    while (true){
        var x = sc.nextInt()
        var y = sc.nextInt()
        var z = sc.nextInt()

        // 0 0 0 입력 받으면 종료
        if ((x == 0 && y == 0 && z ==0)){
            break
        }

        if ((x * x +y * y ) == z * z){
            println("right")
        }
        else if (x * x ==(y * y + z * z)){
            println("right")
        }
        else if (y * y == (z * z + x * x)){
            println("right")
        }
        else {
            println("wrong")
        }
    }
}
```