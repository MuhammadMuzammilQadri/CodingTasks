enum class Result {
  TRUE, FALSE
}

class RegularExpressionMatching {
  lateinit var memo: Array<Array<Result?>>
  
  fun isMatch(text: String, pattern: String): Boolean {
    memo = Array(text.length + 1) { arrayOfNulls<Result>(pattern.length + 1) }
    return dp(0, 0, text, pattern)
  }
  
  fun dp(i: Int, j: Int, text: String, pattern: String): Boolean {
    if (memo[i][j] != null) {
      return memo[i][j] == Result.TRUE
    }
    val ans: Boolean
    ans = if (j == pattern.length) {
      i == text.length
    } else {
      val first_match = i < text.length &&
                        (pattern[j] == text[i] ||
                         pattern[j] == '.')
      if (j + 1 < pattern.length && pattern[j + 1] == '*') {
        dp(i, j + 2, text, pattern) ||
        first_match && dp(i + 1, j, text, pattern)
      } else {
        first_match && dp(i + 1, j + 1, text, pattern)
      }
    }
    memo[i][j] = if (ans) Result.TRUE else Result.FALSE
    return ans
  }
}
