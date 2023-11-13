import java.io.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine().toInt()
    var cnt = 0

    for (i in 1..n) {
        val word = br.readLine()
        val arr = ArrayList<Char>()
        arr.add(word[0])
        var flag = true

        // 그룹단어 판별
        for (index in word.indices) {
            if (arr[arr.size-1] != word[index]) {
                if (arr.contains(word[index])) {
                    flag = false
                    break
                } else {
                    arr.add(word[index])
                }
            }
        }

        if (flag) {
            cnt++
        }
    }

    println(cnt)
    br.close()

}
