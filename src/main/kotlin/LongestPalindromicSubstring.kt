/**
 * Created by Muzammil on 3/9/21.
 */

class LongestPalindromicSubstring {
  fun longestPalindrome(s: String): String {
    val reversed = s.reversed()
    return extractLongestCommonSubstring(s, reversed)
             .takeIf { it.isNotEmpty() }
           ?: s[0].toString()
  }
  
  private fun extractLongestCommonSubstring(actual: String, reversed: String): String {
    var longestCommonSubstring = ""
    for (i in actual.indices) {
      for (j in i + 1..actual.length) {
        actual.substring(i, j)
          .let { slicedString ->
            reversed.indexOf(slicedString).let {
              if (it != -1
                  && slicedString.length > longestCommonSubstring.length
                  && it == actual.length - j
              ) {
                longestCommonSubstring = slicedString
              }
            }
          }
      }
    }
    return longestCommonSubstring
  }
}
