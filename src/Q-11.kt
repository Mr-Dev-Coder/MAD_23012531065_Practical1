class Matrix(val data: Array<IntArray>) {
    val row: Int = data.size
    val col: Int = data.firstOrNull()?.size ?: 0

    operator fun plus(other: Matrix): Matrix {
        val result = Array(row) { IntArray(col) }
        for (i in 0 until row) {
            for (j in 0 until col) {
                result[i][j] = this.data[i][j] + other.data[i][j]
            }
        }
        return Matrix(result)
    }

    operator fun minus(other: Matrix): Matrix {
        val result = Array(row) { IntArray(col) }
        for (i in 0 until row) {
            for (j in 0 until col) {
                result[i][j] = this.data[i][j] - other.data[i][j]
            }
        }
        return Matrix(result)
    }

    operator fun times(other: Matrix): Matrix {
        val result = Array(this.row) { IntArray(other.col) }
        for (i in 0 until this.row) {
            for (j in 0 until other.col) {
                for (k in 0 until this.col) {
                    result[i][j] += this.data[i][k] * other.data[k][j]
                }
            }
        }
        return Matrix(result)
    }

    override fun toString(): String {
        var output = "($row x $col Matrix):\n"
        for (row in data) {
            output += row.joinToString("\t")
            output += "\n"
        }
        return output
    }
}

fun main() {
    val m1 = Matrix(arrayOf(
        intArrayOf(3, -2, 5),
        intArrayOf(3, 0, 4)
    ))
    val m2 = Matrix(arrayOf(
        intArrayOf(2, 3),
        intArrayOf(-9, 0),
        intArrayOf(0, 4)
    ))
    val m3 = Matrix(arrayOf(
        intArrayOf(6, 3),
        intArrayOf(9, 0),
        intArrayOf(5, 4)
    ))

    println("****************Addition****************")
    print("Matrix:1 ")
    print(m3)
    print("Matrix:2 ")
    print(m2)
    val addition = m3 + m2
    print("Addition: $addition")

    println("\n****************Subtraction****************")
    print("Matrix:1 ")
    print(m3)
    print("Matrix:2 ")
    print(m2)
    val subtraction = m3 - m2
    print("Subtraction: $subtraction")

    println("\n****************Multiplication****************")
    print("Matrix:1 ")
    print(m1)
    print("Matrix:2 ")
    print(m2)
    val multiplication = m1 * m2
    print("Multiplication: $multiplication")
}