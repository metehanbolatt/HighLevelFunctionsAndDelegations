fun main() {
    val myNumList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14)

    val allCheck = myNumList.all { it > 5 }                           /** Hepsi 5 ten büyükse true döner */
    val anyCheck = myNumList.any { it > 5 }                           /** Bir tane değerin büyük olması yeterlidir. */
    val countCheck = myNumList.count { it > 5 }                       /** 5 ten büyük kaç tane değer olduğunu döner. */
    val findNum = myNumList.find { it > 5 }                           /** 5 ten büyük ilk elemanı getirir. */
    val findLastNum = myNumList.findLast { it > 5 }                   /** 5 ten büyük son elemanı getirir. */

    val myPredicate = { num: Int -> num > 5 }                         /** Predicate'i önceden de yazabiliriz. */
    val allCheckWithPredicate = myNumList.all(myPredicate)


    println(allCheck)
    println(anyCheck)
    println(countCheck)
    println(findNum)
    println(findLastNum)
    println(allCheckWithPredicate)
}