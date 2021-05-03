class ValidParentheses {
  
  fun isValid(s: String): Boolean {
    val stack = mutableListOf<Char>()
    for (c in s) {
      if (!isValidParentheses(c, stack)) {
        return false
      }
    }
    return stack.isEmpty()
  }
  
  private fun isValidParentheses(c: Char, stack: MutableList<Char>): Boolean {
    if (stack.size == 0) {
      stack.add(c)
      return true
    }
    if (c == '(' || c == '{' || c == '[') {
      stack.add(c)
      return true
    }
    stack.last().let {
      try {
        return (c == counterPartOf(it)).also {
          stack.removeAt(stack.lastIndex)
        }
      } catch (e: Exception) {
        return false
      }
    }
  }
  
  private fun counterPartOf(c: Char): Char {
    if (c == '(') return ')'
    if (c == '[') return ']'
    if (c == '{') return '}'
    throw IllegalArgumentException("Invalid parenthesis")
  }
}
