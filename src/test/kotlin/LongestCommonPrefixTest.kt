import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class LongestCommonPrefixTest() {
  
  lateinit var problem: LongestCommonPrefix
  
  @BeforeEach
  fun setUp() {
    problem = LongestCommonPrefix()
  }
  
  @Test
  fun testCases() {
    assertEquals("a", problem.longestCommonPrefix(arrayOf("a")))
    assertEquals("flower", problem.longestCommonPrefix(arrayOf("flower")))
    assertEquals("fl", problem.longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    assertEquals("", problem.longestCommonPrefix(arrayOf("", "flow", "flight")))
    assertEquals("", problem.longestCommonPrefix(arrayOf("flower", "", "flight")))
    assertEquals("", problem.longestCommonPrefix(arrayOf("dog", "racecar", "car")))
    assertEquals("", problem.longestCommonPrefix(arrayOf()))
    assertEquals("", problem.longestCommonPrefix(arrayOf("")))
    assertEquals("", problem.longestCommonPrefix(arrayOf("abcdef", "abcfed", "qabcdef")))
    assertEquals("abc", problem.longestCommonPrefix(arrayOf("abcdef", "abcfed", "abcdef")))
  }
}
