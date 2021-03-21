import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.util.*

/**
 * Created by Muzammil on 3/9/21.
 */
internal class TwoSumTest {
  
  lateinit var problem: TwoSum
  
  @BeforeEach
  fun setUp() {
    problem = TwoSum()
  }
  
  @Test
  fun emptyTest() {
    assertTrue(
      intArrayOf(0, 1)
        .toTypedArray()
        .contentDeepEquals(problem
                             .twoSum(intArrayOf(2, 7, 11, 15), 9)
                             .toTypedArray()))
    
    assertTrue(
      intArrayOf(1, 2)
        .toTypedArray()
        .contentDeepEquals(problem
                             .twoSum(intArrayOf(3, 2, 4), 6)
                             .toTypedArray()))
  }
}
