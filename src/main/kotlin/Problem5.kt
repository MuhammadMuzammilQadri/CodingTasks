/**
 * Created by Muzammil on 22-Aug-20.
 */

fun main(args: Array<String>) {
  val problem5 = Problem5()
  
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
    println(problem5.solve(it.toInt()))
  }
  
}

class Problem5 {
  fun solve(number: Int): Int {
    var smallestEvenlyDivisible = number
    while (true) {
      var isThisTheOne = true
      for (divisor in 1..number) {
        if (smallestEvenlyDivisible % divisor != 0) {
          isThisTheOne = false
          break
        }
      }
      if (isThisTheOne) {
        return smallestEvenlyDivisible
      }
      smallestEvenlyDivisible++
    }
  }
}
