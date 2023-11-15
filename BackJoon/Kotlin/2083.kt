fun main() {
    while (true) {
        val input = readLine()?.split(" ")
        val name = input?.get(0)
        val age = input?.get(1)?.toInt()
        val weight = input?.get(2)?.toInt()

        if (name == "#" && age == 0 && weight == 0) {
            break
        }

        val category = if (age!! > 17 || weight!! >= 80) {
            "Senior"
        } else {
            "Junior"
        }

        println("$name $category")
    }
}
