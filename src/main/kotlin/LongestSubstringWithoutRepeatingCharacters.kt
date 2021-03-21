/**
 * Created by Muzammil on 3/9/21.
 */

class LongestSubstringWithoutRepeatingCharacters {
  fun lengthOfLongestSubstring(s: String): Int {
    val slidingWindow = HashMap<Char, Int>()
    var longestSubstring = 0
    var iClosed = 0
    var jOpen = 0
    for (index in s.indices) {
      val element = s[index]
      val isExist = slidingWindow[element]
      if (isExist != null) {
        iClosed = Math.max(iClosed, isExist + 1)
      }
      jOpen++
      slidingWindow[element] = index
      longestSubstring = Math.max(longestSubstring, jOpen - iClosed)
    }
    
    return longestSubstring
  }
}
