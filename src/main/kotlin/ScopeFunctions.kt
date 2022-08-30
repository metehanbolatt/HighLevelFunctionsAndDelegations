fun main() {
    val scopeFunctions = ScopeFunctions()

    scopeFunctions.scopeFunctions()
}

class ScopeFunctions {
    private var myInt: Int? = null

    fun scopeFunctions() {
        if (myInt != null) {
            val num = myInt!! + 1
        }

        myInt?.let { val num = it + 1 }

        val myNum = myInt?.let { it + 1 } ?: 0

        val metehan = Person("Metehan", 24)
        val pinar = Person("Pınar", 23)
        val ada = Person("Ada", 1)

        val people = listOf(metehan, pinar, ada)

        people
            .filter {
                it.age > 18
            }
            .also { personList ->
                personList.map {
                    println(it.name)
                }
            }

        /** Apply */
        val myArrayList = arrayListOf<Int>()
        myArrayList.add(1)
        myArrayList.add(2)
        myArrayList.add(3)
        myArrayList.clone()
        myArrayList.clear()

        arrayListOf<Int>().apply {
            add(1)
            add(2)
            add(3)
            clone()
            clear()
        }

        /** With */

        /** Bu örnekte konsol'a Marley yazılır. */
        Person("marley", 4)
            .apply {
                name = "Marley"
            }.also {
                println(it.name)
            }

        val newMarley = Person("mar", 4)
            .apply {
                name = "Marley"
            }
        println(newMarley.name)

        val anotherMarley = with(Person("arley", 4)) {
            name = "Marley"
        }
        /** Unit */
        println(anotherMarley)

        val withMarley = Person("arley", 4)

        with(withMarley) {
            name = "Marley"
            age = 4
        }

        println(withMarley.name)
    }
}

data class Person(var name: String, var age: Int)
