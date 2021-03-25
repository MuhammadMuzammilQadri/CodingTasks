import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * Created by Muzammil on 3/9/21.
 */
internal class LongestPalindromicSubstringTest {
  
  private lateinit var problem: LongestPalindromicSubstring
  
  @BeforeEach
  fun setUp() {
    problem = LongestPalindromicSubstring()
  }
  
  @Test
  fun computeValidSubstring() {
    // assertEquals("aca", problem.longestPalindrome("aacabdkacaa"))
    // assertEquals("aba", problem.longestPalindrome("abacdgfdcaba"))
    // assertEquals("aba", problem.longestPalindrome("qwabacdgfdcabave"))
    // assertEquals("cabac", problem.longestPalindrome("qwabacdgfdcabacve"))
    assertEquals("bb", problem.longestPalindrome("abb"))
    assertEquals("a", problem.longestPalindrome("a"))
    assertEquals("qwerewq", problem.longestPalindrome("abbeqwerewqter"))
    assertEquals("bab", problem.longestPalindrome("baba"))
    assertEquals("aba", problem.longestPalindrome("abab"))
    assertEquals("bab", problem.longestPalindrome("babad"))
    assertEquals("bb", problem.longestPalindrome("cbbd"))
    assertEquals("a", problem.longestPalindrome("ac"))
  }
  
}
