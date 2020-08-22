/**
 * Created by Muzammil on 22-Aug-20.
 */

fun main(args: Array<String>) {
  val problem4 = Problem4()
  
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
    println(problem4.solve(it))
  }
  
}

class Problem4 {
  fun solve(number: String): Int {
    var intNumber = number.toInt().minus(1)
    while (intNumber > 101101) {
      if (isPalindrome(intNumber.toString())
          && isProductOfTwoThreeDigitNumber(intNumber)) {
        return intNumber
      }
      intNumber--
    }
    return intNumber
  }
  
  fun isPalindrome(number: String): Boolean {
    number.toCharArray().let {
      return (it[0] == it[5]
              && it[1] == it[4]
              && it[2] == it[3])
    }
  }
  
  fun isProductOfTwoThreeDigitNumber(number: Int): Boolean {
    for (i in 100..999) {
      if (number % i == 0
          && (number / i).toString().length == 3) {
        return true
      }
    }
    return false
  }
}
