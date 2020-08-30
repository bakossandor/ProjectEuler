import kotlin.math.sqrt

// Find the Prime Factorials of a number

fun findFactorial(n: Long) : ArrayList<Long> {
    val arr = arrayListOf<Long>()
    var num = n

    // First check for divisibility with 2 until it goes
    while(num % 2L == 0L) {
        arr.add(2L)
        num /= 2L
    }

    for (i in 3L..sqrt(n.toDouble()).toLong() step 2L) {
        while (num % i == 0L) {
            arr.add(i)
            num /= i
        }
    }

    // Finally if n is greater than 2 and prime
    if (num > 2L) {
        arr.add(num)
    }

    return arr
}

fun main() {
    val list = findFactorial(600851475143)
    println(list)
}