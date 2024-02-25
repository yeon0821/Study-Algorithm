data class People(val weight: Int, val height: Int, var rank: Int = 0)
fun main() {
    val peopleNum = readln().toInt()
    val peopleList = ArrayList<People>(peopleNum)

    repeat(peopleNum){
        readln().split(' ').map{ it.toInt() }.let{ (x,y) ->
            peopleList.add(People(x,y))
        }
    }
    
    for ((i,people) in peopleList.withIndex()){
        var n = 0 // 덩치 큰 애
        for((j,comparePeople) in peopleList.withIndex()){
            if (i == j) continue // 자기 자신 제외
            when {
                people.height < comparePeople.height && people.weight < comparePeople.weight -> n += 1
            }
        }
        people.rank = n + 1
    }

    peopleList.forEach{ print("${it.rank} ")}
}
