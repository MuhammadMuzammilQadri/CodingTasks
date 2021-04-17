import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class ContainerWithMostWaterTest() {
  
  lateinit var problem: ContainerWithMostWater
  
  @BeforeEach
  fun setUp() {
    problem = ContainerWithMostWater()
  }
  
  @Test
  fun testCases() {
    assertEquals(49, problem.maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    assertEquals(1, problem.maxArea(intArrayOf(1, 1)))
    assertEquals(16, problem.maxArea(intArrayOf(4, 3, 2, 1, 4)))
    assertEquals(2, problem.maxArea(intArrayOf(1, 2, 1)))
  }
}
