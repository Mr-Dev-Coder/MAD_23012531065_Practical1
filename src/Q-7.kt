tailrec fun factorial(n: Int, out: Long = 1): Long {
    return if (n <= 1) {
        out
    } else {
        factorial(n - 1, n * out)
    }
}

fun main() {
    print("Enter Number : ")
    val number = readln().toInt()
    val result = factorial(number)

    println("By TailRec Keyword, Factorial of $number = $result")
}