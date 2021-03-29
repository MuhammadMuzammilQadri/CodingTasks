import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * Created by Muzammil on 22-Aug-20.
 */
internal class AtoiTest() {
  
  lateinit var problem: Atoi
  
  @BeforeEach
  fun setUp() {
    problem = Atoi()
  }
  
  @Test
  fun testCases() {
    assertEquals(0, problem.myAtoi(""))
    assertEquals(0, problem.myAtoi("00000-42a1234"))
    assertEquals(1, problem.myAtoi("+1"))
    assertEquals(0, problem.myAtoi("+-12"))
    assertEquals(0, problem.myAtoi("-+12"))
    assertEquals(42, problem.myAtoi("42"))
    assertEquals(-42, problem.myAtoi("     -42"))
    assertEquals(4192, problem.myAtoi("4192 with words"))
    assertEquals(4193, problem.myAtoi("     4193 with words"))
    assertEquals(0, problem.myAtoi("words and 987"))
    assertEquals(-2147483648, problem.myAtoi("-91283472332"))
    assertEquals(2147483647, problem.myAtoi("91283472332"))
    assertEquals(0, problem.myAtoi("     .4193 with words"))
    assertEquals(41, problem.myAtoi("     41.93 with words"))
    assertEquals(0, problem.myAtoi("-words and 987"))
    assertEquals(0, problem.myAtoi("-     41 with words"))
  }
}
