import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * Created by Muzammil on 22-Aug-20.
 */
internal class Problem5Test() {
  
  lateinit var problem5: Problem5
  
  @BeforeEach
  fun setUp() {
    problem5 = Problem5()
  }
  
  @Test
  fun testCases() {
    assertEquals(6, problem5.solve(3))
    assertEquals(2520, problem5.solve(10))
  }
}
