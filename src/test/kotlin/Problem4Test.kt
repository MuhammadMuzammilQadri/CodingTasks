import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test

/**
 * Created by Muzammil on 22-Aug-20.
 */
internal class Problem4Test() {
  
  lateinit var problem4: Problem4
  
  @org.junit.jupiter.api.BeforeEach
  fun setUp() {
    problem4 = Problem4()
  }
  
  @Test
  fun testCases() {
    assertEquals(101101, problem4.solve("101110"))
    assertEquals(793397, problem4.solve("800000"))
    assertNotEquals(101101, problem4.solve("101101"))
  }
  
  @Test
  fun isProductOfTwoThreeDigitNumber() {
    assertEquals(false, problem4.isProductOfTwoThreeDigitNumber(798897))
    assertEquals(true, problem4.isProductOfTwoThreeDigitNumber(101101))
    assertEquals(true, problem4.isProductOfTwoThreeDigitNumber(793397))
    assertEquals(false, problem4.isProductOfTwoThreeDigitNumber(1011013))
    assertEquals(false, problem4.isProductOfTwoThreeDigitNumber(1013))
  }
  
  @Test
  fun detectingPalindromes() {
    assertEquals(true, problem4.isPalindrome("101101"))
    assertEquals(true, problem4.isPalindrome("793397"))
    assertEquals(false, problem4.isPalindrome("101102"))
    assertEquals(false, problem4.isPalindrome("111101"))
    assertEquals(false, problem4.isPalindrome("793497"))
  }
}
