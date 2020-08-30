fun sumOfSquare(n: Int) : Int {
    var sumSquare = 0
    var sums = 0
    for (i in 1..n) {
        sumSquare += (i * i)
        sums += i
    }
    return (sums * sums) - sumSquare
}

fun main() {
    println(sumOfSquare(100))
}