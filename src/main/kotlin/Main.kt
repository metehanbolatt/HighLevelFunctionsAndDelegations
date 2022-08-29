fun main() {

    val myNumList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    myNumList.filter { it == 4 }
    myNumList.map { it * it }

    val filterMapCombine = myNumList
        .filter { it < 6 }
        .map { it * it }

    println(filterMapCombine)

    val musician = listOf(
        Musician("James", 60, "Guitar"),
        Musician("Lars", 55, "Drum"),
        Musician("Kirk", 50, "Guitar"),
    )

    val filteredMusicians = musician
        .filter { it.age < 60 }
        .map { it.instrument }

    println(filteredMusicians)
}

data class Musician(
    val name: String,
    val age: Int,
    val instrument: String
)