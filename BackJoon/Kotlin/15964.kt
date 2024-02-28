fun main(args: Array<String>) = println(
   readln()
       .split(" ")
       .map { it.toBigInteger() }
       .let { (it[0] + it[1]) * (it[0] - it[1]) }
)
