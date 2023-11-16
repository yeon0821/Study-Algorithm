fun main(){

    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()


    var num = br.readLine().toInt()
    var cnt = 0

    while (true){
        if (num%5==0){
            cnt += num/5
            break
        }


        num -= 3

        if (num<0){
            cnt = -1
            break
        }
    }
    bw.write("$cnt")
    bw.flush()
    bw.close()
    br.close()
}
