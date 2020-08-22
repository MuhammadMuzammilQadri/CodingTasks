import kotlin.math.sqrt

/**
 * Created by Muzammil on 22-Aug-20.
 */

fun main(args: Array<String>) {
  val problem10 = Problem10()
  
  // takes input from user
  val numberOfLines = readLine()!!
  val cases: MutableCollection<String> = mutableListOf()
  numberOfLines.toInt().also {
    for (i in 1..it) {
      cases.add(readLine()!!)
    }
  }
  
  // print output to console
  cases.forEach {
    println(problem10.solve(it.toInt()))
  }
  
}

class Problem10 {
  fun solve(number: Int): Long {
    var sumOfPrimes = 0L
    if (number > 1) sumOfPrimes += 2
    for (primeCandidate in 3..number step 2) {
      if (isPrime(primeCandidate)) {
        sumOfPrimes += primeCandidate
      }
    }
    
    return sumOfPrimes
  }
  
  fun isPrime(number: Int): Boolean {
    if (number == 1 || number == 0) return false
    if (number == 2) return true
    if (number % 2 == 0) return false
    
    val upperLimit = sqrt(number.toDouble()).toInt()
    for (divisor in 3..upperLimit step 2) {
      if (number % divisor == 0) {
        return false
      }
    }
    return true
  }
}
