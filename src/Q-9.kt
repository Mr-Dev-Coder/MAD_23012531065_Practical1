fun main() {
    val n = 5
    val a = ArrayList<Int>()
    var max = 0

    println("Enter $n numbers:")
    for (i in 0 until n) {
        print("a[${i}] : ")
        val input = readln().toInt()
        a.add(input)

        if (input > max) {
            max = input
        }
    }

    println("Max is $max")
}