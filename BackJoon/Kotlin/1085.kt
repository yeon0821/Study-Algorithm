import java.util.Scanner
fun main(args: Array<String>){
    val sc: Scanner = Scanner(System.`in`)

    var x = sc.nextInt()
    var y = sc.nextInt()
    var w = sc.nextInt()
    var h = sc.nextInt()


    var x_min = Math.min(x, w - x) // x축 최소 거리
    var y_min = Math.min(y, h - y) // y축 최소거리

    // x와 y축 최소거리 중 가작 작은 값
    println(Math.min(x_min, y_min))
}
