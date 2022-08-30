fun main() {
    val scopeFunctions = ScopeFunctions()

    scopeFunctions.scopeFunctions()
}

class ScopeFunctions {
    private var myInt: Int? = null

    fun scopeFunctions() {
        if (myInt != null) { val num = myInt!! + 1 }

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
    }
}

data class Person(var name: String, var age: Int)
