import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ValidParenthesesTest() {
  
  lateinit var problem: ValidParentheses
  
  @BeforeEach
  fun setUp() {
    problem = ValidParentheses()
  }
  
  @Test
  fun testCases() {
    assertEquals(false, problem.isValid("(("))
    assertEquals(false, problem.isValid("))"))
    assertEquals(false, problem.isValid("("))
    assertEquals(true, problem.isValid("()"))
    assertEquals(true, problem.isValid("[]"))
    assertEquals(true, problem.isValid("{}"))
    assertEquals(true, problem.isValid("()[]{}"))
    assertEquals(true, problem.isValid("{[]}"))
    assertEquals(true, problem.isValid("{[]}()"))
    assertEquals(true, problem.isValid("{[{}]({})}"))
    assertEquals(false, problem.isValid("(]"))
    assertEquals(false, problem.isValid("([)]"))
  }
}
