fun main() {
    print("Enter Number: ")
    val n = readln().toInt()
    val s = if (n % 2 == 0) "Even" else "Odd"
    println("$n is $s")
}