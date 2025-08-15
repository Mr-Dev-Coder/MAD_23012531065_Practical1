fun main() {
    val a: Int = 10
    val b: Double = a.toDouble()
    println("Integer Value:$a")
    println("Double Value (From Integer):$b")

    val c: String = "10"
    val d: Int = c.toInt()
    val e: Double = "11.12".toDouble()
    println("String Value:$c")
    println("Integer Value1 (From String):$d")
    println("Double Value (From String):$e")
}