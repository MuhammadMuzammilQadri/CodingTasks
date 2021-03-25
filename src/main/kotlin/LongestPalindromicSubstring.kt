/**
 * Created by Muzammil on 3/9/21.
 */

class LongestPalindromicSubstring {
  fun longestPalindrome(s: String): String {
    var longestPalindrome = s[0].toString()
    for (i in s.indices) {
      checkWhetherTheEyeOfPalindrom(s, i)
        .takeIf { it.length > longestPalindrome.length }
        ?.let {
          longestPalindrome = it
        }
    }
    return longestPalindrome
  }
  
  private fun checkWhetherTheEyeOfPalindrom(s: String, index: Int): String {
    var left = index
    var right = index
    var leftAlt = index
    var rightAlt = index + 1
    while (true) {
      var noMorePalindrome = true
      if (left >= 0 && right < s.length && s[left] == s[right]) {
        left--
        right++
        noMorePalindrome = false
      }
      
      if (leftAlt >= 0 && rightAlt < s.length && s[leftAlt] == s[rightAlt]) {
        leftAlt--
        rightAlt++
        noMorePalindrome = false
      }
      
      if (noMorePalindrome) break
    }
    
    val palindrome = s.slice(left + 1 until right)
    val palindromeAlt = s.slice(leftAlt + 1 until rightAlt)
    
    return if (palindrome.length > palindromeAlt.length) {
      palindrome
    } else {
      palindromeAlt
    }
  }
}
