import kotlin.math.absoluteValue
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

class Problem10() {
  val PRIMES_LIST: List<Int>
  val SUM_OF_PRIMES_LIST: List<Long>
  
  init {
    PRIMES_LIST = createPrimesList(1000_000)
    SUM_OF_PRIMES_LIST = createSumOfPrimesList()
  }
  
  fun solve(number: Int): Long {
    if (number == 1) return 0
    return PRIMES_LIST.binarySearch(number).let {
      if (it >= 0) {
        SUM_OF_PRIMES_LIST[it]
      } else {
        SUM_OF_PRIMES_LIST[(it + 2).absoluteValue]
      }
    }
  }
  
  fun createSumOfPrimesList(): List<Long> {
    return mutableListOf<Long>().apply {
      for (i in PRIMES_LIST.indices) {
        if (i == 0) {
          add(PRIMES_LIST[0].toLong())
        } else {
          add(get(i - 1) + PRIMES_LIST[i])
        }
      }
    }
  }
  
  fun createPrimesList(until: Int): List<Int> {
    val primesList: MutableList<Int> = mutableListOf<Int>().apply {
      for (i in 2..until) {
        add(i)
      }
    }
    
    var outerIndex = 0;
    while (outerIndex < primesList.size) {
      val step = primesList[outerIndex]
      if (step != -1) {
        var innerIndex = outerIndex + step
        while (innerIndex < primesList.size) {
          primesList.set(innerIndex, -1)
          innerIndex += step
        }
      }
      outerIndex++
    }
    
    primesList.removeAll { value -> value == -1 }
    
    return primesList
  }
}
