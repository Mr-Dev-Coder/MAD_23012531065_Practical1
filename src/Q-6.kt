fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun multiply(a: Int, b: Int): Long {
    return a.toLong() * b.toLong()
}

fun divide(a: Int, b: Int): Double {
    return a.toDouble() / b.toDouble()
}

fun main() {
    print("Enter First Number : ")
    val a = readln().toInt()
    print("Enter Second Number : ")
    val b = readln().toInt()
    println("Addition of $a, $b is ${add(a, b)}")
    println("Subtraction of $a, $b is ${subtract(a, b)}")
    println("Multiplication of $a, $b is ${multiply(a, b)}")
    println("Division of $a, $b is ${divide(a, b)}")
}