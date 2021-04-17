import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


internal class RegularExpressionMatchingTest() {
  
  lateinit var problem: RegularExpressionMatching
  
  @BeforeEach
  fun setUp() {
    problem = RegularExpressionMatching()
  }
  
  @Test
  fun testCases() {
      assertEquals(true, problem.isMatch("aaa", "a*a"))
    // assertEquals(false, problem.isMatch("aa", ""))
    // assertEquals(false, problem.isMatch("", "a"))
    // assertEquals(true, problem.isMatch("", "a*"))
    // assertEquals(false, problem.isMatch("", "."))
    // assertEquals(true, problem.isMatch("", ".*"))
    // assertEquals(true, problem.isMatch("", ""))
    // assertEquals(false, problem.isMatch("aa", "a"))
    // assertEquals(true, problem.isMatch("aa", "a."))
    // assertEquals(true, problem.isMatch("aa", "a*"))
    // assertEquals(true, problem.isMatch("abc", ".*"))
    // assertEquals(true, problem.isMatch("aab", "c*a*b"))
    // assertEquals(false, problem.isMatch("mississippi", "mis*is*p*."))
    // assertEquals(true, problem.isMatch("mississippi", "mis*is*ip*i"))
    // assertEquals(true, problem.isMatch("mississippi", "mis*is*ip*i*"))
    // assertEquals(true, problem.isMatch("bbb", "b*"))
    // assertEquals(false, problem.isMatch("aaa", "a."))
    // assertEquals(true, problem.isMatch("aa", ".a"))
    // assertEquals(true, problem.isMatch("aaa", ".aa"))
    // assertEquals(true, problem.isMatch("aaa", ".a*"))
    // assertEquals(true, problem.isMatch("abb", ".b*"))
    // assertEquals(false, problem.isMatch("abc", "ab"))
    // assertEquals(false, problem.isMatch("abc", "abcd"))
    // assertEquals(true, problem.isMatch("abc", "abcd*"))
    // assertEquals(false, problem.isMatch("abc", "abc."))
    // assertEquals(true, problem.isMatch("abc", "abc.*"))
  }
}
