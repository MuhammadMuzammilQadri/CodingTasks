import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * Created by Muzammil on 22-Aug-20.
 */
internal class DummyTest() {
  
  lateinit var dummy: Solution
  
  @BeforeEach
  fun setUp() {
    dummy = Solution()
  }
  
  @Test
  fun testCases() {
    assertEquals(intArrayOf(3), dummy.solve(3))
  }
}
