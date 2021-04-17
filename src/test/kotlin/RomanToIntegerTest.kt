import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class RomanToIntegerTest() {
  
  lateinit var problem: RomanToInteger
  
  @BeforeEach
  fun setUp() {
    problem = RomanToInteger()
  }
  
  @Test
  fun testCases() {
    assertEquals(3, problem.romanToInt("III"))
    assertEquals(4, problem.romanToInt("IV"))
    assertEquals(9, problem.romanToInt("IX"))
    assertEquals(58, problem.romanToInt("LVIII"))
    assertEquals(1994, problem.romanToInt("MCMXCIV"))
  }
}
