import kotlin.math.sqrt

// Find out if a number is prime
// Prime numbers can be divided with only itself and 1
// 0 and 1 are not prime numbers
// 2, 3, 5, 7, 11 are the first primes

fun isPrime(n: Int) : Boolean {
    if (n == 2) return true
    if (n < 2 || n % 2 == 0) return false

    for (i in 3 until n step 2) {
        if (n % i == 0) return false
    }
    return true
}

// We can optimize the algorithm by the following reasons
// x * y = n
// x <= y
// x * x <= y * x
// x * x <= n
// x <= sqrt(n)

fun isPrimeOptimized(n: Int) : Boolean {
    if (n == 2) return true
    if (n < 2 || n % 2 == 0) return false

    // Finding the factorials
    // We can start from 3, we already checked against 2
    // And can step by 2, to check only odd numbers from then
    // And we set the limit up to the sqrt of the n
    for (i in 3..(sqrt(n.toDouble()).toInt()) step 2) {
        if (n % i == 0) return false
    }
    return true
}


fun main() {
    println("33 ${isPrime(33)} ${isPrimeOptimized(33)}")
    println("3 ${isPrime(3)} ${isPrimeOptimized(3)}")
    println("41 ${isPrime(41)} ${isPrimeOptimized(41)}")
    println("11 ${isPrime(11)} ${isPrimeOptimized(11)}")
    println("49 ${isPrime(49)} ${isPrimeOptimized(49)}")
    println("12 ${isPrime(12)} ${isPrimeOptimized(12)}")
    println("100 ${isPrime(100)} ${isPrimeOptimized(100)}")
    println("1000 ${isPrime(1000)} ${isPrimeOptimized(1000)}")
    println("97 ${isPrime(97)} ${isPrimeOptimized(97)}")
    println("1 ${isPrime(1)} ${isPrimeOptimized(1)}")
    println("13 ${isPrime(13)} ${isPrimeOptimized(13)}")
    println("88 ${isPrime(88)} ${isPrimeOptimized(88)}")
    println("5 ${isPrime(5)} ${isPrimeOptimized(5)}")
    println("---")
}