class RomanToInteger {
  fun convertRomanToInt(c: Char): Int {
    when (c) {
      'I' -> return 1
      'V' -> return 5
      'X' -> return 10
      'L' -> return 50
      'C' -> return 100
      'D' -> return 500
      'M' -> return 1000
    }
    throw IllegalArgumentException("Invalid Symbol")
  }
  
  fun romanToInt(s: String): Int {
    var i = 0
    var integerValue = 0
    while (i < s.length) {
      val (increment, currentSymbolValue) = computeSymbolValue(s, i)
      integerValue += currentSymbolValue
      i += increment
    }
    return integerValue
  }
  
  private fun computeSymbolValue(s: String, i: Int): Pair<Int, Int> {
    val current = s[i]
    val currentInteger = convertRomanToInt(current)
    
    if (i + 1 >= s.length) return Pair(1, currentInteger)
    
    val next = s[i + 1]
    val nextInteger = convertRomanToInt(next)
    
    if (currentInteger < nextInteger) {
      return Pair(2, nextInteger - currentInteger)
    } else {
      return Pair(1, currentInteger)
    }
  }
}
