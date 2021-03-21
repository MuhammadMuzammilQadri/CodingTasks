import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * Created by Muzammil on 3/9/21.
 */
internal class LongestSubstringWithoutRepeatingCharactersTest {
  
  private lateinit var problem: LongestSubstringWithoutRepeatingCharacters
  
  @BeforeEach
  fun setUp() {
    problem = LongestSubstringWithoutRepeatingCharacters()
  }
  
  @Test
  fun computeValidSubstring() {
    assertEquals(3, problem.lengthOfLongestSubstring("abcabcbb"))
    assertEquals(1, problem.lengthOfLongestSubstring("bbbbb"))
    assertEquals(3, problem.lengthOfLongestSubstring("pwwkew"))
    assertEquals(0, problem.lengthOfLongestSubstring(""))
    assertEquals(1, problem.lengthOfLongestSubstring(" "))
    assertEquals(7, problem.lengthOfLongestSubstring("qbqbqwerty"))
    assertEquals(5, problem.lengthOfLongestSubstring("qrsvbspk"))
    assertEquals(3, problem.lengthOfLongestSubstring("aabaab!bb"))
  }
  
}
