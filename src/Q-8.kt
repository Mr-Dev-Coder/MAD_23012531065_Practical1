fun main() {
    val array1 = arrayOf(10, 90, 60, 80, 100)
    println("Create Array-1 by using arrayOf() method:")
    println(array1.contentToString())

    val array2 = Array(5) { 0 }
    println("\nCreate Array-2 by using Array<>():")
    println(array2.contentToString())

    val array3 = Array(8) { it * 1 }
    println("\nCreate Array-3 by using Array<>() and lambda function:")
    println(array3.contentToString())

    val array4 = IntArray(5)
    println("\nCreate Array-4 by using IntArray():")
    println(array4.contentToString())

    val array5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println("\nCreate Array-5 by using intArrayOf():")
    println(array5.contentToString())

    val array6 = arrayOf(intArrayOf(1, 3), intArrayOf(4, 5), intArrayOf(6, 7))
    println("\nCreate 2D Array-6 by using arrayOf() and intArrayOf():")
    println(array6.contentDeepToString())

    println("\nPlease enter Array Value:")
    val userArray = IntArray(5)
    for (i in userArray.indices) {
        print("a[$i]=")
        userArray[i] = readln().toInt()
    }
    println("\nEntered Array:")
    println(userArray.contentToString())

    println("\n**************With Built-in Function**************")
    val aa = userArray.clone()
    aa.sort()
    println("After sorting by built-in function:")
    println(aa.contentToString())

    println("\n**************Without Built-in Function**************")
    val bb = userArray.clone()
    println("Before Sorting:")
    println(bb.contentToString())
    for (i in bb.indices) {
        for (j in i + 1 until bb.size) {
            if (bb[i] > bb[j]) {
                val temp = bb[i]
                bb[i] = bb[j]
                bb[j] = temp
            }
        }
    }
    println("\nAfter Sorting without built-in function:")
    println(bb.contentToString())
}