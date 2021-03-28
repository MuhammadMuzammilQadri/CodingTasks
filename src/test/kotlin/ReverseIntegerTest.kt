import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * Created by Muzammil on 22-Aug-20.
 */
internal class ReverseIntegerTest() {
  
  lateinit var problem: ReverseInteger
  
  @BeforeEach
  fun setUp() {
    problem = ReverseInteger()
  }
  
  @Test
  fun testCases() {
    assertEquals(3, problem.reverse(3))
    assertEquals(231, problem.reverse(132))
    assertEquals(31, problem.reverse(130))
    assertEquals(-215, problem.reverse(-512))
    assertEquals(-215, problem.reverse(-5120))
    assertEquals(0, problem.reverse(2147483647))
  }
}
